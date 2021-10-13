package Practices;

import javax.swing.*;

public class ArrayPractice2 {

    public static void main(String[] args) {

        String[] foodArray= {"Apples","Bananas", "Steak","Chocolate", "Potatoes", "Carrots", "Tacos","Noodles", "Burgers","Hot dogs" };
        int [] numArray= {3,56,12,43, 0, 10, 34, 44, 32,50, 17};
        String [] countryArray= {"Ireland", "Japan", "Germany", "France","United Kingdom", "United States of America", "Australia", "Italy", "Mexico", "China"};
        String food= foodArray[7];
        int num=numArray[6];
        String country=countryArray[9];

        JOptionPane.showMessageDialog(null, "I would like "+num+"\t "+food+" in "+country, "Food Menu", JOptionPane.INFORMATION_MESSAGE);
    }
}
