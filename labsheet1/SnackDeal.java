package labsheet1;

import javax.swing.*;

public class SnackDeal {
    public static void main(String[] args) {

        int snacks= 2;

        String name= JOptionPane.showInputDialog("Please enter your name");
        String course= JOptionPane.showInputDialog("Please enter your course");
        int snacksNo= Integer.parseInt(JOptionPane.showInputDialog("How many snacks would you like?"));

        JOptionPane.showMessageDialog(null, "Name: "+name+" \nCourse: "+course+" \nSnacks: "+snacksNo+"\nCost: €"+(snacks * snacksNo), "Receipt", JOptionPane.INFORMATION_MESSAGE);
    }
}
