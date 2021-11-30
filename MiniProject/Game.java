package MiniProject;

import java.io.Serializable;

public class Game implements Serializable {

    private String genre;
    private String title;
    private int age;
    private double price;


    public Game() {
        genre = "Undefined";
        title = "Undefined";
        age = 0;
        price = 0;
    }

    public Game(String title, int age, double price) {
        setTitle(title);
        setAge(age);
        setPrice(price);
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
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }
    public String toString(){

        return "\n\nVideo Game details. \n\nGenre: " +getGenre()+" \nTitle: "+getTitle()+" \nAge: "+getAge()+" \nPrice: "+getPrice();
    }

}
