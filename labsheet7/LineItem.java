package labsheet7;
//LineItem.java
/*A simple instantiable class definition for an line-item which also demonstrates
the OO concept of aggregation*/

public class LineItem {
    private int id;
    private int quantity;
    private Product product;
    private static int count;

    public LineItem(int id, int quantity, Product product) {
        setId(count);
        setQuantity(quantity);
        setProduct(product);
        incrementCount();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        id=100000;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    public static int getCount(){
        return count;

    }
    private static void incrementCount(){
        count++;
    }


    public String toString() {
        return "LineItem Details are as follows: \n\nid " + getId() + "\nquantity:" + getQuantity() + "\n" + getProduct() + "\n\n";
    }
}
