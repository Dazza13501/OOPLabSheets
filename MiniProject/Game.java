package MiniProject;

import javax.swing.*;
import java.io.Serializable;

public class Game implements Serializable {

    private String genre;
    private String title;
    private int age;
    private double price;
    private int yearReleased;
    private int review;



    public Game(String genre,String title, int age, double price,int yearReleased, int review) {
        setGenre(genre);
        setTitle(title);
        setAge(age);
        setPrice(price);
        setYearReleased(yearReleased);
        setReview(review);

    }

    public String getGenre() {

        return genre;
    }

    public void setGenre(String genre) {

        this.genre = genre;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
        while(age != 3 | age != 7 | age != 12 | age != 16 | age != 18 )
            JOptionPane.showInputDialog(null,"Error! Please enter a valid age (3,7,12,16,18)", "Incorrect age", JOptionPane.ERROR_MESSAGE);

    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
           if(price>999.99)
               JOptionPane.showInputDialog(null,"Error! Please enter a valid price(<999.99 and yes, there is a game worth this)", "Incorrect price", JOptionPane.ERROR_MESSAGE);
           else
        this.price = price;
    }

    public int getYearReleased() {


        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        if(yearReleased > 2021 && yearReleased <1962)
            JOptionPane.showInputDialog(null,"Error! Please enter a valid year in which a video game was released(1962-2019)", "Incorrect year", JOptionPane.ERROR_MESSAGE);
        else
        this.yearReleased = yearReleased;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        if(review >10)
            JOptionPane.showInputDialog(null,"Error! Please enter a rating less than or equal to 10", "Incorrect review", JOptionPane.ERROR_MESSAGE);
        else
            this.review = review;
    }

    public String toString(){

        return "\n\nVideo Game details. \n\nGenre: " +getGenre()+" \nTitle: "+getTitle()+" \nAge: "+getAge()+" \nPrice: "+getPrice()+ " \nYear released: "+getYearReleased()+
                " \nReview: "+getReview()+ "/10";
    }

}
