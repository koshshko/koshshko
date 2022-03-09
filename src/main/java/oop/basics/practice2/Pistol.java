package oop.basics.practice2;

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

Пистолет может перегреться. Нормальная температура пистолета - 20 градусов. Ниже нее
пистолет опуститься не может. Каждый выстрел повышает температуру на 1 градус.
При этом каждую секунду пистолет остывает на один градус, но не ниже нормальной
(20 градусов). То есть если мы сделали три выстрела подряд, температура пистолета
станет 23 градуса. Если мы потом подождем 1 секунду, температура опустится до 22
градусов. Если температура пистолета становится > 60 градусов, при попытке выстрелить
происходит исключение HeatException, выстрел не происходит. После того как температура
падает до 60 градусов и ниже, выстрелы снова становятся доступными.

На класс надо написать тесты, которые будут проверять поведение класса
*/

import java.util.*;

public class Pistol {

    private List<Ammo> ammos = new ArrayList<>();
    private boolean isLocked;
    private int chanceToBroke;
    private int temperature;

    public Pistol() {
        this(10, 15, 10);
    }

    private Pistol(int ammoCount, int ammoSize, int chance) {
        for (int i = 0; i < ammoCount; i++) {
            ammos.add(new Ammo(ammoSize));
        }
        chanceToBroke = chance;
        setTemperature(20);
    }

    public void shot() {
        if (isLocked) {
            throw new RuntimeException("Пистолет заблокирован");
        }

        if (getCurrentAmmo().getShots() == 0) {
            reload();
        }

        if (brokeHappened()) {
            isLocked = true;
            return;
        }

        getCurrentAmmo().substractBy(1);
    }
    public void reload() {
        if (getAmmosCount() == 1) {
            throw new RuntimeException("Магазинов больше не осталось!");
        }
        ammos.remove(0);
        isLocked = false;
    }
    public String amount() {
        return String.format("magazins = %s, bullets = %s", getAmmosCount() - 1, getCurrentAmmo().getShots());
    }
    // Вспомогательные методы
    public int getAmmosCount() {
        return ammos.size();
    }
    public Ammo getCurrentAmmo() {
        return ammos.get(0);
    }
    public Ammo getAmmoByIndex(int i) {
        return ammos.get(i);
    }
    private boolean brokeHappened() {
        Random rnd = new Random();
        return (rnd.nextInt(99) + 1) <= chanceToBroke;
    }
    public void setLocked(boolean locked) {
        isLocked = locked;
    }
    public boolean getLocked() {
        return isLocked;
    }
    public int getChanceToBroke() {
        return chanceToBroke;
    }
    public void setChanceToBroke(int chanceToBroke) {
        this.chanceToBroke = chanceToBroke;
    }
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        if (temperature < 20)
            this.temperature = 20;

        this.temperature = temperature;
    }
}
