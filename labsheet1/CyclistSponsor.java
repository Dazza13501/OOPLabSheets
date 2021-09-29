package labsheet1;

import javax.swing.*;

public class CyclistSponsor {
    public static void main(String[] args) {

        double cost=0;

        String name= JOptionPane.showInputDialog("Please enter your name ");
        int distance= Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of km you cycled "));

        if (distance<10){
            cost= distance * 1.75;
        }
        else if (distance>10){
            cost= 10 * 1.75 + (distance-10) * 2.5;
        }

        JOptionPane.showMessageDialog(null, "Name: "+name+" \nDistance cycled: "+distance+"km \nSponsorship amount due: €"+String.format("%.2f",cost), "Receipt", JOptionPane.INFORMATION_MESSAGE );
    }
}
