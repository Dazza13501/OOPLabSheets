package labsheet4.exercise4;

public class Book2 {
    String title;
    double price;
    String ISBN;
    int pages;


    public Book2() {

        title = " Not available ";
        price = 0;
        ISBN = "Not available";
        pages = 0;
    }

    public Book2(String title, double price, String ISBN, int pages) {

        this.title = title;
        this.price = price;
        this.ISBN = ISBN;
        this.pages = pages;
    }

    public String getTitle(){

        return title;
    }


    public double getPrice(){

        return price;
    }

    public String getISBN(){

        return ISBN;
    }

    public int getPages(){

        return pages;
    }


    public void setTitle(String title){
        this.title=title;
    }
    public void setPrice(double price) {this.price = price;}
    public void setISBN(String ISBN){}
    public void setPages(int pages){
        this.pages=pages;
    }

    public String toString(){
        return "Title: "+getTitle()+ " Price: " +getPrice()+ " ISBN: "+getISBN()+
                " No. of Pages: "+getPages();
    }





}