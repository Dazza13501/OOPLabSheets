package labsheet8;

public class Bicycle extends Vehicle {

    private int gearCount;
    private boolean hasBell;

    public Bicycle() {
       gearCount = 0;
       hasBell = false;
    }


    public Bicycle(double price, double length, double height, double weight, String manufacturer, String model, boolean hasBell , int gearCount){
        super(price, length, height, weight, manufacturer, model);
        setHasBell(hasBell);
        setGearCount(gearCount);

    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public boolean getHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }

public String toString(){

       String st=  super.toString() + " \nDoes it have a bell? ";

       if(getHasBell())
           st+="Yes";
       else
           st+="No";

       st +="\nNumber of gears: " +getGearCount();
       return st;

}

}
