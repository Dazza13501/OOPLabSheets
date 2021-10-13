package labsheet6;

import javax.swing.*;

public class TestPerson {

    public static void main(String[] args) {

        String output="";
        String firstName="";
        String lastName="";

        Person c1= new Person();

        output+="\nCalling Person() constructor. \nThe values of person 1 are: "+c1.toString();

        firstName= JOptionPane.showInputDialog("Please enter your first name ");
        lastName= JOptionPane.showInputDialog("Please enter your surname");

        Person c2= new Person(firstName,lastName) ;
        output+="\nCalling the Person(String,String) constructor with user-defined variables. \nThe values of person 2 are " +c2;

        JOptionPane.showMessageDialog(null, output, null, JOptionPane.INFORMATION_MESSAGE);

    }
}
