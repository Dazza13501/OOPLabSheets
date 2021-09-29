package labsheet4.exercise3;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {

        String output = "";

        labsheet4.exercise3.Book c1 = new labsheet4.exercise3.Book();

        output += " Calling the no-argument Book constructor." + " The first Book object details are: \n\n " + c1.toString();

        labsheet4.exercise3.Book c2 = new Book("Harry Potter and the Philosopher's Stone ", 7.99 , "757463738", 335);

        output += " \n\nCalling the multi-argument Book  constructor." + " The second Book object details are: \n\n " + c2.toString();

        JOptionPane.showMessageDialog(null, output, "Computer Object Data, ", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}


