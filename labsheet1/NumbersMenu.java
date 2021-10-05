package labsheet1;

import javax.swing.*;

public class NumbersMenu {
    public static void main(String[] args) {

        int choice,i= 0;
        double factorial=0 ;
        int fact= 1;



        do {
            int number = Integer.parseInt(JOptionPane.showInputDialog("Please enter any whole number: "));
            choice = Integer.parseInt(JOptionPane.showInputDialog("What would you like to do with your number? \n1. Determine if the number is even or odd," +
                    "\n2. Find the factorial of the number    \n3.Quit the program  \n\nPlease enter your choice: "));
            switch (choice) {
                case 1:
                    if (number % 2 == 0)
                        JOptionPane.showMessageDialog(null, number+" is even", "Even or Odd?", JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, number+" is odd", "Even or Odd?", JOptionPane.INFORMATION_MESSAGE);
                    i++;
                    break;
                case 2:

                    if(number<0)
                        JOptionPane.showMessageDialog(null, "Can't get the factorial of a negative number! Please try again ", "Factorial error", JOptionPane.ERROR_MESSAGE);
                    else
                    factorial= 1;
                    for(int j=1;j<=number;j++)
                        factorial *= j;
                        JOptionPane.showMessageDialog(null, "The factorial of "+number+" is "+factorial, "Factorial", JOptionPane.INFORMATION_MESSAGE);

                    i++;

                    break;

                case 3:
                    JOptionPane.showMessageDialog(null,"Thank you for using the numbers menu. You entered "+i+" number/s. Goodbye","Exit", JOptionPane.INFORMATION_MESSAGE);
                    break;

            }

        }

        while (i <= 10 && choice!=3) ;

    }
}


