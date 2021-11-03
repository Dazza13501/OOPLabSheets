package labsheet8;

public class Bicycle {

    private int gearCount;
    private boolean hasBell;

    public Bicycle() {
       gearCount = 0;
       hasBell = false;
    }


    public Bicycle(int gearCount, boolean hasBell) {
        this.gearCount = gearCount;
        this.hasBell = hasBell;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public boolean isHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }
}
