package oop.basics.practice2;

public class Ammo {

    private int shotsNum;

    public Ammo() {
        this(15);
    }

    Ammo(int num) {
        shotsNum = num;
    }

    public int getShots() {
        return shotsNum;
    }

    public void substractBy(int i) {
        this.shotsNum -= i;
    }
}
