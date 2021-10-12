package labsheet5;

import javax.swing.*;

public class TestBankAccount2 {
    public static void main(String[] args) {

        String output="";

        BankAccount2 c1= new BankAccount2();

        output+= "\n\nCalling the no-argument BankAccount constructor. The first Bank account details are: "+c1.toString();

        BankAccount2 c2= new BankAccount2("John Doe", 1234556789, 0.75);

        output+= "\n\nCalling the multi-argument BankAccount constructor. The second Bank account details are: "+c2.toString();

        BankAccount2 c3= new BankAccount2();

        c3.setInterestRate(0.5);

        output+= "\n\nCalling another multi-argument BankAccount constructor. The third Bank account details are: "+c3.toString();

        BankAccount2 c4= new BankAccount2("John Doe", 1234556789, 0.75);

        c4.setInterestRate(0.5);

        output+= "\n\nCalling yet another multi-argument BankAccount constructor. The fourth Bank account details are: "+c4.toString()+
                "\n\nThe number of Bank accounts created are: "+BankAccount2.getCount();

        JOptionPane.showMessageDialog(null, output,"BankAccount Object Data", JOptionPane.INFORMATION_MESSAGE );

    }
}
