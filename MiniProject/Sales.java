package MiniProject;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Sales {

    private String salesDate;
    private double sales = 0;
    private double totalSales = 0;


    public Sales() {
        this(null, 0,0);
    }


    public Sales(String salesDate, double sales, double totalSales) {
        setSalesDate(salesDate);
        setSales(sales);
        setTotalSales(totalSales);
    }

    public String getSalesDate() {
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

    public double getTotalSales() {
        totalSales += sales;
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public String toString(){

        return "Sales: "+getSales();

    }
}
