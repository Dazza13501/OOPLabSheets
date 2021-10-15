package labsheet6;


//TestAnimal.java
/*A driver (test) class that contains the main() method for
testing the functionality of the Animal class. This version of the driver is
also to demonstrate the creation of an array of Animal objects*/


public class TestAnimal2 {
    public static void main( String args[]) {

        Animal2 allAnimals[] = new Animal2[10];

        System.out.println("Calling the no-argument constructor to create the first animal....");
        Animal2 animal1 = new Animal2(); //tests no-arg constructor
        animal1.setType("Gorilla");
        animal1.setWeight(250);

        String lionContinents[] = {"Africa","Asia"}; //initialise an array of strings

        //tests 4-arg constructor and the 4 mutator methods
        System.out.println("\nCalling the 4-argument constructor to create a lion object....");
        Animal2 animal2  = new Animal2("Lion",lionContinents,200,40);

        System.out.println("\nCalling the 4-argument constructor to create a rat object....");
        Animal2 animal3  = new Animal2("Rat",new String[]{"Europe","America","Africa","Asia"},0.2,5);

        System.out.println("\nCalling the 4-argument constructor to create a polar bear object....");
        Animal2 animal4  = new Animal2("Polar Bear",new String[]{"Antarctica"},450,15);

        System.out.println("\nCalling the 4-argument constructor to create an anaconda object....");
        Animal2 animal5  = new Animal2("Anaconda",new String[]{"Asia","America"},100,8);

        allAnimals[0] = animal1;
        allAnimals[1] = animal2;
        allAnimals[2] = animal3;
        allAnimals[3] = animal4;
        allAnimals[4]=  animal5;

        System.out.println("\n\nThe details of all the animals in the Animal array are:\n\n");

        for(int i=0;i<allAnimals.length;i++)
            System.out.println(allAnimals[i]+"\n\n");

    }
}