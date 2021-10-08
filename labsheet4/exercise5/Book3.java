package labsheet4.exercise5;

public class Book3 {
    String title;
    double price;
    String ISBN;
    int pages;


    public Book3() {

        title = " Not available ";
        price = 0;
        ISBN = "Not available";
        pages = 0;
    }

    public Book3(String title, double price, String ISBN, int pages) {

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

        if(title==null || title.equals(""))
            this.title="No valid title entered";
        else
        this.title=title;
    }
    public void setPrice(double price) {
        if(price<0 || price >50000)
            this.price= 0;
        else
        this.price = price;}
    public void setISBN(String ISBN){
        if(ISBN==null || ISBN.equals(""))
            this.ISBN="No valid ISBN entered";
        else
            this.ISBN=ISBN;

    }
    public void setPages(int pages){
        if(pages<0 || pages>4000)
          this.pages= 0;
        else

          this.pages=pages;
    }

    public String toString(){
        return "Title: "+getTitle()+ " Price: " +getPrice()+ " ISBN: "+getISBN()+
                " No. of Pages: "+getPages();
    }


}

