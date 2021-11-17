package MiniProject;

import javax.swing.*;
import java.util.GregorianCalendar;

public class GameStore {

    public static void main(String[] args) {

        String output="";

        Game g1 = new Game();
        output+= "\n Value of first Game is: "+g1;

        output+= "\n Calling Game multi constructor.";

        String category = JOptionPane.showInputDialog("Please enter the category of the game ");
        String name = JOptionPane.showInputDialog("Please enter the name of the game ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter the age group of the game "));
        double price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the game "));

        Game g2 = new Game(category, name, age, price);
        output+= "\n Value of second Game is: "+g2;

        Staff s1 = new Staff();
        output+= "\n Value of first Staff is: "+s1;

        output+= "\n Calling Staff multi constructor. ";
         String forename = JOptionPane.showInputDialog("Please enter your forename");
         String surname = JOptionPane.showInputDialog("Please enter your surname");
         String gender = JOptionPane.showInputDialog("Please enter your gender");
         GregorianCalendar DOB = GregorianCalendar.thisGregorianCalendar(JOptionPane.showInputDialog("Please enter your DOB in the format dd/mm/yyyy"));
         String address = JOptionPane.showInputDialog("Please enter your address");
         int PhoneNo = Integer.parseInt(JOptionPane.showInputDialog("Please enter your phone number"));
        output+= "\n Value of first Game is: "+g1;
        output+= "\n Value of first Game is: "+g1;
        output+= "\n Value of first Game is: "+g1;
        output+= "\n Value of first Game is: "+g1;





    }
}
