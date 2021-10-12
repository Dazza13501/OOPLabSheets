package labsheet5;

import javax.swing.*;

public class TestBankAccount {

    public static void main(String[] args) {

        String output="";

       BankAccount c1= new BankAccount();

       output+= "\n\nCalling the no-argument BankAccount constructor. The first Bank account details are: "+c1.toString();

        BankAccount c2= new BankAccount("John Doe", 1234556789, 0.75);

        output+= "\n\nCalling the multi-argument BankAccount constructor. The second Bank account details are: "+c2.toString();

        BankAccount c3= new BankAccount();

        c3.setInterestRate(0.5);

        output+= "\n\nCalling another multi-argument BankAccount constructor. The third Bank account details are: "+c3.toString();

        BankAccount c4= new BankAccount("John Doe", 1234556789, 0.75);

        c4.setInterestRate(0.5);

        output+= "\n\nCalling yet another multi-argument BankAccount constructor. The fourth Bank account details are: "+c4.toString();

        JOptionPane.showMessageDialog(null, output,"BankAccount Object Data", JOptionPane.INFORMATION_MESSAGE );

    }
}
