package Practices;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIPractice2 extends JFrame implements ActionListener {
    JMenu fileMenu;
    JMenu editMenu;
    JLabel response;

    public GUIPractice2() {
        super("Demonstrating Menus");
        setLayout(new GridBagLayout());

        createFileMenu();
        createEditMenu();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.yellow);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        response = new JLabel("Menu Tester");
        add(response);

        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(250, 200);
        setVisible(true);

    }


    public static void main(String[] args) {
        GUIPractice2 frame = new GUIPractice2();
    }
        public void actionPerformed (ActionEvent event){
            String menuName;
            menuName = event.getActionCommand();

            if (menuName.equals("Quit")) System.exit(0);
            else
                response.setText("Menu Item '" + menuName + "' is selected.");
        }

        private void createFileMenu(){
            JMenuItem item;

            fileMenu = new JMenu("File");

            item = new JMenuItem("New");
            item.addActionListener(this);
            fileMenu.add(item);

            item = new JMenuItem("Open");
            item.addActionListener(this);
            fileMenu.add(item);

            item = new JMenuItem("Save");
            item.addActionListener(this);
            fileMenu.add(item);

            item = new JMenuItem("Save As");
            item.addActionListener(this);
            fileMenu.add(item);
            fileMenu.addSeparator();
            item = new JMenuItem("Quit");
            item.addActionListener(this);
            fileMenu.add(item);
        }

        private void createEditMenu(){

            JMenuItem item;
            editMenu = new JMenu("Edit");

            item = new JMenuItem("Cut");
            item.addActionListener( this );
            editMenu.add( item );

            item = new JMenuItem("Copy");
            item.addActionListener( this );
            editMenu.add( item );

            item = new JMenuItem("Paste");
            item.addActionListener( this );
            editMenu.add( item );
        }


}