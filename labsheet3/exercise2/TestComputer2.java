package labsheet3.exercise2;

import labsheet3.exercise1.Computer;

import javax.swing.*;

public class TestComputer2 {
    public static void main(String[] args) {

        String output="";

        Computer2 c1= new Computer2();

        output += " Calling the no-argument Computer constructor."+ " The first Computer object details are: \n\n "+c1.toString();

        Computer2 c2= new Computer2("Dell ", "Laptop ", 3.25, 16, 550.99);

        c2.setSpeed(-3.15);

        output += " \n\nCalling the no-argument Computer constructor."+ " The second Computer object details are: \n\n "+c2.toString();

        Computer2 c3= new Computer2("Apple ", "Desktop ", 2.9, 12, 865.00);

        c3.setRAM(-8);

        output += " \n\nCalling the no-argument Computer constructor."+ " The third Computer object details are: \n\n "+c3.toString();

        JOptionPane.showMessageDialog(null,output, "Computer Object Data, ",JOptionPane.INFORMATION_MESSAGE );

        System.exit(0);
    }
}
