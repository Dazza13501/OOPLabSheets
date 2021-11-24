package MiniProject;




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class GameStore extends JFrame implements ActionListener {

    private JMenu staffMenu;
    private JMenu gameMenu;
    private JMenu salesMenu;
    private JLabel welLabel;
    private JLabel imgLabel;


    public GameStore() {
        setTitle("DL's Video Game Store");
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("controller.png")).getImage());
        BorderLayout layout= new BorderLayout(2,2);
        setLayout(layout);

        createGameMenu();
        createStaffMenu();
        createSalesMenu();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.RED);
        menuBar.add(staffMenu);
        menuBar.add(gameMenu);
        menuBar.add(salesMenu);



        welLabel = new JLabel("Welcome");
        add(welLabel);
        /*try {
            imgLabel = new JLabel();
            imgLabel.setIcon(new ImageIcon(getClass().getResource("controller.png")));

            imgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            add(imgLabel);
        }
        catch(Exception ex) {

            JOptionPane.showMessageDialog(null,"Invalid Image File in Main Screen");
        }*/

        setSize(450,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


    }


    public static void main(String[] args) {

        GameStore store = new GameStore();
    }

    public void actionPerformed(ActionEvent event) {

        String menuName;
        menuName = event.getActionCommand();

        if (menuName.equals("Exit"))
            System.exit(0);
        else
            welLabel.setText("Menu item " + menuName + " is selected");

    }



    private void createStaffMenu() {
        JMenuItem item;

        staffMenu = new JMenu("Staff");

        item= new JMenuItem("Add staff");
        item.addActionListener(this);
        staffMenu.add(item);

        item= new JMenuItem("View staff");
        item.addActionListener(this);
        staffMenu.add(item);

        item= new JMenuItem("Update staff");
        item.addActionListener(this);
        staffMenu.add(item);

        item= new JMenuItem("Delete staff");
        item.addActionListener(this);
        staffMenu.add(item);

    }

    private void createGameMenu() {

        JMenuItem item;

        gameMenu = new JMenu("Game");

        item= new JMenuItem("Add game");
        item.addActionListener(this);
        gameMenu.add(item);

        item= new JMenuItem("View game");
        item.addActionListener(this);
        gameMenu.add(item);

        item= new JMenuItem("Update game");
        item.addActionListener(this);
        gameMenu.add(item);

        item= new JMenuItem("Delete game");
        item.addActionListener(this);
        gameMenu.add(item);

    }

    private void createSalesMenu() {
        JMenuItem item;

        salesMenu = new JMenu("Sales");

        item= new JMenuItem("Add sales");
        item.addActionListener(this);
        salesMenu.add(item);

        item= new JMenuItem("View sales");
        item.addActionListener(this);
        salesMenu.add(item);

        item= new JMenuItem("Update sales");
        item.addActionListener(this);
        salesMenu.add(item);

        item= new JMenuItem("Delete sales");
        item.addActionListener(this);
        salesMenu.add(item);

    }

}   /*
    String output="";

        Game g1 = new Game();
        output+= "\n Value of first Game is: "+g1;

        output+= "\n Calling Game multi constructor.";

        String category = JOptionPane.showInputDialog("Please enter the category of the game ");
        String name = JOptionPane.showInputDialog("Please enter the name of the game ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter the age group of the game "));
        double price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the game "));

        Game g2 = new Game(category, name, age, price);
        output+= "\n Value of second Game is: "+g2;

        Staff s1 = new Staff();
        output+= "\n Value of first Staff is: "+s1;

        output+= "\n Calling Staff multi constructor. ";
         String forename = JOptionPane.showInputDialog("Please enter your forename");
         String surname = JOptionPane.showInputDialog("Please enter your surname");
         String gender = JOptionPane.showInputDialog("Please enter your gender");
         String address = JOptionPane.showInputDialog("Please enter your address");
         int PhoneNo = Integer.parseInt(JOptionPane.showInputDialog("Please enter your phone number"));
         String DOB = (JOptionPane.showInputDialog("Please enter your DOB in the format dd/mm/yyyy"));



         int day = Integer.parseInt(DOB.substring(0,2));
         int month = Integer.parseInt(DOB.substring(3,5));
         int year = Integer.parseInt(DOB.substring(6,10));

         GregorianCalendar birthDate = new GregorianCalendar(year, month, day);

         Staff s2= new Staff(forename,surname,gender,birthDate,address,PhoneNo);

         output+= "\n Value of first Game is: "+s2;

        Sales sa1 = new Sales();
        output+= "\n Value of first Sales is: "+sa1;

        output+= "\n Calling Game multi constructor.";

        String salesDate = Sales.getSalesDate();
        double sales = Double.parseDouble(JOptionPane.showInputDialog("Please enter today's sales "));

        Sales sa2 = new Sales(salesDate, sales);
        output+= "\n Value of second Sales is: "+sa2;

        JOptionPane.showMessageDialog(null, output,"Game Store Details", JOptionPane.INFORMATION_MESSAGE);







*/
