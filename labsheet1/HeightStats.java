package labsheet1;

import javax.swing.*;

public class HeightStats {
    public static void main(String[] args) {

        int user=1;
        double sum=0;
        int range=0;
        double overGlobal=0;
        double height=0, maxHeight = -1, minHeight = 3;
        double global= 1.665;

        while(user <=6 ){
            height= Double.parseDouble(JOptionPane.showInputDialog("Please enter the height of user "+user+": "));


            while(height<0.54 || height>2.72) {
                height = Double.parseDouble(JOptionPane.showInputDialog("Invalid height entered!!! Please re-enter the height of user "+user+"!! "));
            }

            user++;
            sum += height;
            if(height >=1.3 && height<= 1.9) {
                range++;
            }

            if(height > global){
                overGlobal++;

            }

            if(height>maxHeight)
                maxHeight = height;
            else if(height<minHeight)
                minHeight = height;


        }


        double average= sum/6;
        double percentage= (overGlobal/6) *100;
        JOptionPane.showMessageDialog(null, "The average of the heights is: "+String.format("%.1f",average)+"\nThe smallest height value entered is: "+minHeight+
                "\nThe number of height values between 1.3m and 1.9m inclusive is: "+range+" \nThe percentage of height values exceeding the global average height is: "+percentage+"%");

        System.exit(0);
    }

}
