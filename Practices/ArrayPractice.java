package Practices;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] numArray={10,20,40, 58, 576};
        int numCount=0;
        /*int num= numArray[2];*///change number to determine position i.e 0=10,1=20, 2=40, 3=576.

        System.out.println("The numbers you have chosen are: ");
                for(int i=0;i<numArray.length;i++)
        {
            System.out.println(numArray[i] + "\n\n" );
            numCount++;

        }
        System.out.println("You chose "+numCount+" numbers");
    }
}
