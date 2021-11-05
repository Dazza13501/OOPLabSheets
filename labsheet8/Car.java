package labsheet8;

public class Car extends Vehicle{

    private int maxPassengers;
    private String registrationNumber;

    public Car() {
        maxPassengers = 0;
        registrationNumber = "No data found";
    }

    public Car(double price, double length, double height, double weight, String manufacturer, String model, int maxPassengers, String registrationNumber) {
        super(price, length, height, weight, manufacturer, model);
        setMaxPassengers(maxPassengers);
        setRegistrationNumber(registrationNumber);
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String toString(){

        return super.toString() + "\nMax amount of passengers: "+getMaxPassengers()+ " \nRegistration Number:" +getRegistrationNumber();


    }
}
