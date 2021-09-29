package labsheet1;

import javax.swing.*;

public class PlanetGravity {
    public static void main(String[] args) {

        double g= 9.81;

        long earthMass= Long.parseLong(JOptionPane.showInputDialog("Please enter the mass of the planet Earth"));
        long earthRadius= Long.parseLong(JOptionPane.showInputDialog("Please enter the radius of the planet Earth"));
        long planetMass= Long.parseLong(JOptionPane.showInputDialog("Please enter the mass of the other planet "));
        long planetRadius= Long.parseLong(JOptionPane.showInputDialog("Please enter the radius of the other planet"));

        double acceleration= (g*planetMass*earthRadius*earthRadius)/(earthMass*planetRadius*planetRadius);

        System.out.println("Please enter the mass of the planet Earth: "+earthMass);
        System.out.println("Please enter the radius of the planet Earth: "+earthRadius);
        System.out.println("Please enter the mass of the other planet: "+planetMass);
        System.out.println("Please enter the radius of the other planet: "+planetRadius);

        System.out.println("The acceleration due to gravity on the other planet is: "+ String.format("%.2f",acceleration)+" m/s/s");
    }
}
