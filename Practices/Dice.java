package Practices;

import javax.swing.*;

public class Dice {

    public static void main(String[] args) {


        int num1 = (int) (Math.random() * 6+1);
        int num2 = (int) (Math.random() * 6+1);
        int num3 = (int) (Math.random() * 6+1);
        int num4 = (int) (Math.random() * 6+1);

        int playerTotal= num1+num2;
        int computerTotal= num3+num4;


        JOptionPane.showMessageDialog(null, "Player \nDie 1: "+num1+" \nDie 2: "+num2+
                "\nComputer \nDie 1: "+num3+" \nDie 2: "+num4,"Results", JOptionPane.INFORMATION_MESSAGE);

        if(playerTotal>computerTotal) {
            JOptionPane.showMessageDialog(null, "Congratulations. With a score of " + playerTotal + " to " + computerTotal +
                    ", you beat the computer!!!", "Victory", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(playerTotal==computerTotal) {
            JOptionPane.showMessageDialog(null, "Honours Even. You both got a score of " + playerTotal +
                    ", so it's a draw!!!", "Stalemate", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Commiserations. With a score of " + playerTotal + " to " + computerTotal +
                    ", you lost to the computer!!!", "Defeat", JOptionPane.ERROR_MESSAGE);
        }
    }
}
