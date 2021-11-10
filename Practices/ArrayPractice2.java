package Practices;

import javax.swing.*;
import java.util.Random;

public class ArrayPractice2 {

    public static void main(String[] args) {

        String[] foodArray= {"Apples","Bananas", "Steak","Chocolate bars", "Potatoes", "Carrots", "Tacos","Noodles", "Burgers","Hot dogs" };
        int [] numArray= {3,56,12,43, 0, 10, 34, 44, 32,50, 17};
        String [] countryArray= {"Ireland", "Japan", "Germany", "France","the United Kingdom", "the United States of America", "Australia", "Italy", "Mexico", "China"};
        Random r= new Random();
        int randomFood= r.nextInt(foodArray.length);
        int randomNumber= r.nextInt(numArray.length);
        int randomCountry= r.nextInt(countryArray.length);


        JOptionPane.showMessageDialog(null, "I would like "+numArray[randomNumber]+"\t "+foodArray[randomFood]+" in "+countryArray[randomCountry], "Food Menu", JOptionPane.INFORMATION_MESSAGE);
    }
}
