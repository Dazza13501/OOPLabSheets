package labsheet5;

import labsheet5.Thermometer;

import javax.swing.*;
public class TestThermometer {

    public static void main(String[] args) {

        String output="";

        Thermometer c1= new Thermometer();

        output += "Calling the no-argument constructor. The temperature of the first thermometer is "+c1.toString()+
        "\n\nFirst Thermometer: \n\nCurrent temperature: "+c1.toString()+"  \n\nMaximum Temperature:"+c1.toString()+"\n\nMinimum temperature: "+c1.toString() ;

        Thermometer c2= new Thermometer(35,35,35);

        output += "Calling the one-argument constructor. The temperature of the second thermometer is "+c2.toString()+
                "\n\nFirst Thermometer: \n\nCurrent temperature: "+c2.toString()+"  \n\nMaximum Temperature:"+c2.toString()+"\n\nMinimum temperature: "+c2.toString() ;

    }
}
