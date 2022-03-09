package basics.practice2;

import oop.basics.practice2.Pistol;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
У пистолета есть магазин. В магазине может быть максимум 15 патронов.
При этом у нас изначально 10 магазинов.

Методы:
shot() - производит выстрел. При этом в текущем магазине становится на один
патрон меньше. Если в текущем магазине нет патронов, магазин автоматически
меняется на новый, только после этого происходит выстрел.

reload() - перезаряжаем магазин на новый. При этом если в старом магазине
остались патроны, они теряются. Если нового магазина нет, бросается исключение
OutOfMagazins. Старый магазин при этом не меняется, т.е. если в нем были патроны,
они остаются.

amount() - возвращается строку текущего состояния, например: "magazins = 5, bullets = 3"
- это значит, что у нас есть еще 5 новых магазинов и три патрона в текущем.

Усложненная:
При выстреле может произойти осечка с 10% вероятностью. Пистолет попадает в состояние
locked. Патрон при этом не тратится. Но все последующие вызовы shot() должны бросать
исключение LockedException и не производить выстрела.
Чтобы вывести пистолет из состояния locked, необходимо вызвать метод reload(), который
заменит магазин на новый.
*/
public class PistolTests {

    private Pistol pistol;
    private int maxAmmosAmount = 10;
    private int maxAmmoCapacity = 15;

    int currentAmmosAmount, currentBulletsAmount;

    @BeforeEach
    void setup() {
        pistol = new Pistol();
        currentAmmosAmount = pistol.getAmmosCount();
        currentBulletsAmount = pistol.getCurrentAmmo().getShots();
    }

    @Test
    void pistolHasAmmo() {
        assertNotNull(pistol.getCurrentAmmo(), "В пистолете отсутсвует обойма");
    }

    @Test
    void pistolHasDefaultAmmosAmount() {
        assertEquals(maxAmmosAmount, pistol.getAmmosCount(),
                "При инициализации пистолета количество магазинов отличается от максимального");
    }

    @Test
    void pistolAmmoMAxCapacityHasDefaultAmount() {
        assertEquals(maxAmmoCapacity, pistol.getCurrentAmmo().getShots(),
                "При инициализации пистолета количество патронов в магазине отличается от максимального");
    }

    @Test
    void whenShotShouldReturnSameAmmosAmountAndDecreasedBulletsAmount() {
        pistol.shot();

        assertEquals(currentAmmosAmount, pistol.getAmmosCount(),
                "Количество обойм после выстрела не должно быть измениться");
        assertEquals(currentBulletsAmount - 1, pistol.getCurrentAmmo().getShots(),
                "Количество патронов в обойме должно было уменьшится на 1");
    }

    @Test
    void whenShotWithZeroBulletsShouldReloadAmmoAndShot() {
        emptyCurrentAmmoAndSetZeroChanceToBroke(pistol);

        pistol.shot();

        assertEquals(currentAmmosAmount - 1, pistol.getAmmosCount(),
                "Количество обойм должно уменьшиться на 1");
        assertEquals(maxAmmoCapacity - 1, pistol.getCurrentAmmo().getShots(),
                "Количество патронов в обойме должно было уменьшится на 1");
    }

    @Test
    void whenShootWithoutBulletsAndAmmoShouldThrowException() {
        reloadUntil1Ammo(pistol);

        emptyCurrentAmmoAndSetZeroChanceToBroke(pistol);

        assertThrows(RuntimeException.class, pistol::shot,
                "Пистолет стреляет без патронов!");
    }

    @Test
    void whenReloadWith1AmmoShouldThrowExceptionAndStateDidNotChange() {
        reloadUntil1Ammo(pistol);
        setZeroChanceToBroke(pistol);

        pistol.shot();
        int currentShots = pistol.getCurrentAmmo().getShots();

        assertThrows(RuntimeException.class, pistol::reload,
                "Пистолет перезаряжается без обойм!");
        assertEquals(1, pistol.getAmmosCount(),
                "Должна остаться одна обойма");
        assertEquals(currentShots, pistol.getCurrentAmmo().getShots(),
                "Количество патронов не должно измениться");
    }

    @Test
    void whenReloadNotEmptyAmmoShouldReloadSuccessfully() {
        setZeroChanceToBroke(pistol);

        int shotsAmount = getRandomNumber(1, maxAmmoCapacity - 1);
        for (int i = 0; i < shotsAmount; i++) {
            pistol.shot();
        }

        int bulletsCountBefore = (maxAmmosAmount - 1) * maxAmmoCapacity +
                pistol.getCurrentAmmo().getShots();

        pistol.reload();

        int bulletsCountAfter = 0;
        for (int i = 0; i < pistol.getAmmosCount(); i++) {
            bulletsCountAfter += pistol.getAmmoByIndex(i).getShots();
        }

        assertEquals(bulletsCountBefore - (maxAmmoCapacity - shotsAmount), bulletsCountAfter,
                "Общее количество выстрелов должно уменьшиться на " + shotsAmount);
        assertEquals(maxAmmosAmount - 1, pistol.getAmmosCount(),
                "Количество обойм должно было уменьшиться на 1");
        assertEquals(maxAmmoCapacity, pistol.getCurrentAmmo().getShots(),
                "Количество патронов должно быть максимальныи");
    }

    private void emptyCurrentAmmoAndSetZeroChanceToBroke(Pistol pistol) {
        setZeroChanceToBroke(pistol);
        while (pistol.getCurrentAmmo().getShots() > 0) {
            pistol.shot();
        }
    }

    private void setZeroChanceToBroke(Pistol pistol) {
        pistol.setChanceToBroke(0);
    }

    private void reloadUntil1Ammo(Pistol pistol) {
        while (pistol.getAmmosCount() != 1) {
            pistol.reload();
        }
    }

    private int getRandomNumber(int a, int b) {
        Random rnd = new Random();
        return rnd.nextInt(b - a) + a;
    }
}
