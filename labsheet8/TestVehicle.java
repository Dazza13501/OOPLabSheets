package labsheet8;

public class TestVehicle {

    public static void main(String[] args) {



        System.out.println("Calling the no-argument Car constructor. The data is as follows: ");
        Car c1= new Car();
        System.out.println(c1);

        System.out.println("\nCalling the multi-argument Car constructor. The data is as follows: ");
        Car c2= new Car(100000.0, 4.5, 1.25, 2000.0, "Ferrari", "F2", 2, "05KY1" );
        System.out.println(c2);

        System.out.println("\nCalling the no-argument Bicycle constructor. The data is as follows: ");
        Bicycle b1= new Bicycle();
        System.out.println(b1);

        System.out.println("\nCalling the multi-argument Bicycle constructor. The data is as follows: ");
        Bicycle b2= new Bicycle(500.0, 1.5, 1.0, 50.0, "Raleigh", "MountainBike", true , 4  );
        System.out.println(b2);

    }
}
