package MiniProject;

import java.io.Serializable;

public class Game implements Serializable {

    private String category;
    private String title;
    private int age;
    private double price;


    public Game() {
        category = "Undefined";
        title = "Undefined";
        age = 0;
        price = 0;
    }

    public Game(String category, String title, int age, double price) {
        setCategory(category);
        setTitle(title);
        setAge(age);
        setPrice(price);
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
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

        return "\n\nVideo Game details. \n\nCategory: " +getCategory()+" \nTitle: "+getTitle()+" \nAge: "+getAge()+" \nPrice: "+getPrice();
    }

}
