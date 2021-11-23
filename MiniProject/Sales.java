package MiniProject;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Sales {


    private static double sales=0;
    private String salesDate;




    public Sales() {
        this(null, 0);
    }


    public Sales(String salesDate, double sales) {
        setSalesDate(salesDate);
        setSales(sales);

    }

    public static String getSalesDate() {
        Date salesDate = new Date();
        SimpleDateFormat format =new SimpleDateFormat("dd/MM/yy");
        String date = format.format(salesDate);
        return date;
    }

    public void setSalesDate(String salesDate) {

        this.salesDate = salesDate;
    }

    public double getSales() {
        sales += sales;
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }



    public String toString(){

        return "\n\nSales Details. \n\nSales: "+getSales()+ "\nToday's date: "+getSalesDate();

    }
}
