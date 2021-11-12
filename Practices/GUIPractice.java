package Practices;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class GUIPractice extends JFrame {

    private JButton jb[];

    public GUIPractice (){
        super("Demonstrating BorderLayout & WindowEvent");

        BorderLayout layout = new BorderLayout(6,8);
        setLayout(layout);

        String regions[]= {BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.WEST, BorderLayout.EAST, BorderLayout.CENTER};

        jb= new JButton[regions.length];

        for (int i=0;i< regions.length;i++){

        jb[i]= new JButton(regions[i]);
        add(jb[i],regions[i]);
        }

        addWindowListener(new WindowEventHandler());
        setSize(400,300);

        setVisible(true);


    }

    public static void main(String[] args) {
        GUIPractice  G= new GUIPractice ();
    }

    private class WindowEventHandler implements WindowListener {

        public void windowOpened(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Window now opened ", "Window Opened", JOptionPane.INFORMATION_MESSAGE);

        }

        public void windowClosing(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Now closing window ", "Closing Window", JOptionPane.INFORMATION_MESSAGE);
            int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Exiting Application Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);

            if (choice == JOptionPane.YES_OPTION)
                dispose();//closes window

        }

        public void windowClosed(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Window closed ", "Window closed", JOptionPane.INFORMATION_MESSAGE);
        }

        public void windowIconified(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Window minimised ", "Window minimised", JOptionPane.INFORMATION_MESSAGE);

            // int random = (int)(Math.random()*5);

            // remove(jb[random]);//removes random button


        }

        public void windowDeiconified(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Window unminimised ", "Window unminimised", JOptionPane.INFORMATION_MESSAGE);
        }

        public void windowActivated(WindowEvent e) {
            System.out.println(("Window Activated"));
        }

        public void windowDeactivated(WindowEvent e) {
            System.out.println(("Window Deactivated"));
        }


    }
}

