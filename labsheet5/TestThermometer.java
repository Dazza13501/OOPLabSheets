package labsheet5;

import labsheet5.Thermometer;

import javax.swing.*;
public class TestThermometer {

    public static void main(String[] args) {

        String output="";

        Thermometer c1= new Thermometer();

        c1.toString();

        output += "*****Thermometer Testing*****\n\nCalling the no-argument constructor. \nThe results of the first thermometer are "+c1.toString() ;

        Thermometer c2= new Thermometer(35,35,35);

        output += "\n\nCalling the one-argument constructor. \nThe results of the second thermometer are "+c2.toString() ;

        JOptionPane.showMessageDialog(null, output, null, JOptionPane.INFORMATION_MESSAGE);
    }
}
