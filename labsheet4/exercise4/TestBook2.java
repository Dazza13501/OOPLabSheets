package labsheet4.exercise4;

import labsheet4.exercise4.Book2;

import javax.swing.*;
import java.awt.*;

public class TestBook2 {
    public static void main(String[] args) {

        String title, ISBN, output  = "";
        double price=0;
        int pages=0;

        JTextArea textArea= new JTextArea();
        Font font= new Font("Monospaced", Font.PLAIN, 12);
        textArea.setFont(font);

        textArea.setText(String.format("%-25s%-9s-%-15s%s", "Title", "Price", "ISBN", "Pages" ));


        title= JOptionPane.showInputDialog("Please enter the title of your favourite book");

        price= Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your favourite book"));

        ISBN= JOptionPane.showInputDialog("Please enter the ISBN of your favourite book");

        pages= Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages in your favourite book"));

        Book2 favBook= new Book2(title,price,ISBN,pages);

        output += String .format("\n\n%-25s%-9.2f-%-15s%d", favBook.getTitle(),favBook.getPrice(),favBook.getISBN(),favBook.getPages());

        title= JOptionPane.showInputDialog("Please enter the title of your least favourite book");

        price= Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your least favourite book"));

        ISBN= JOptionPane.showInputDialog("Please enter the ISBN of your least favourite book");

        pages= Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages in your least favourite book"));

        Book2 leastBook= new Book2(title,price,ISBN,pages);

        output += String.format("\n\n%-25s%-9.2f-%-15s%d", leastBook.getTitle(),leastBook.getPrice(),leastBook.getISBN(),leastBook.getPages());

        textArea.append(output);

        JOptionPane.showMessageDialog(null, textArea, "Book Object Data ", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
