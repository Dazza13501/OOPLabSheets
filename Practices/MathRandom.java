package Practices;

import javax.swing.*;

public class MathRandom {
    public static void main(String[] args) {


        int num = (int) (Math.random() * 101);
        //math.random() default is 0 to 1.To get 0 to 100, multiply by 101. 0-10, multiply by 11 etc. Multiply by 1 no. above for range. To exclude 0. multiply by 100 then add 1 for range 1-100.

       if(num<50)
           JOptionPane.showMessageDialog(null, num+" is less than 50. A number less than 50 was generated.");

       else
           JOptionPane.showMessageDialog(null, num+" is greater than 50. A number greater than 50 was generated.");


    }
}
