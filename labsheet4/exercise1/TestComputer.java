package labsheet4.exercise1;

import labsheet3.exercise2.Computer2;
import labsheet4.exercise1.Computer;

import javax.swing.*;

public class TestComputer {
    public static void main(String[] args) {

        String output = "";

        labsheet4.exercise1.Computer c1 = new labsheet4.exercise1.Computer();

        output += " Calling the no-argument Computer constructor." + " The first Computer object details are: \n\n " + c1.toString();

        labsheet4.exercise1.Computer c2 = new Computer("Dell ", "Laptop ", 3.25, 16, 550.99);

        c2.setSpeed(-3.15);

        output += " \n\nCalling the no-argument Computer constructor." + " The second Computer object details are: \n\n " + c2.toString();

        labsheet4.exercise1.Computer c3 = new Computer("Apple ", "Desktop ", 3.65, -16, -500.25);

        c3.setRAM(-8);
            output += " \n\nCalling the no-argument Computer constructor." + " The third Computer object details are: \n\n " + c3.toString();

            JOptionPane.showMessageDialog(null, output, "Computer Object Data, ", JOptionPane.INFORMATION_MESSAGE);

            System.exit(0);
        }
    }




