package Practices;

import javax.swing.*;
import java.util.Arrays;

public class ArrayPractice4 {

    public static void main(String[] args) {

        String country[] = new String[6];
        String longest = "";
        String message = "";

        nameCountry(country);

        for (int i = 0; i < country.length; i++) {

            if (country[i].length() > longest.length())
                longest = country[i];
        }

        Arrays.sort(country);
        message = "Your list of countries in ascending order: \n\n" + Arrays.toString(country) +
                "\n\n The country with the most letters is: " + longest;

        JOptionPane.showMessageDialog(null, message, "Results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
        public static void nameCountry(String country[]){
            for (int i = 0; i < country.length; i++) {
                country[i] = JOptionPane.showInputDialog("Please enter a country");
            }

    }
}