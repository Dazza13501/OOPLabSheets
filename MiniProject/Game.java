package MiniProject;

import javax.swing.*;
import java.io.Serializable;

public class Game implements Serializable {

    private String genre;
    private String title;
    private double price;
    private int yearReleased;
    private int review;



    public Game(String genre,String title, double price,int yearReleased, int review) {
        setGenre(genre);
        setTitle(title);
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




    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public int getYearReleased() {


        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {

            this.review = review;
    }

    public String toString(){

        return "\n\nVideo Game details. \n\nGenre: " +getGenre()+" \nTitle: "+getTitle()+" \nPrice: "+getPrice()+ " \nYear released: "+getYearReleased()+
                " \nReview: "+getReview()+ "/10";
    }

}
