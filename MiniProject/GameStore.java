package MiniProject;




import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.time.LocalDate;
import java.util.*;


public class GameStore extends JFrame implements ActionListener {

    private JMenu staffMenu;
    private JMenu gameMenu;
    private JMenu salesMenu;
    private JLabel welLabel;
    private JLabel imgLabel;
    private JLabel dateLabel;
    private JPanel mainPanel;
    private JPanel imgPanel;
    private JPanel buttonPanel;
    private JButton gameButton;
    private JButton staffButton;
    private JButton salesButton;


    TitledBorder border;
    ArrayList<Game> games = new ArrayList<>();
    private Game game;

    ArrayList<Staff> staffs = new ArrayList<>();
    private Staff staff;


    public GameStore() {
        setTitle("DL's Video Game Store");
        setSize(600, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("controller.png")).getImage());
        BorderLayout layout = new BorderLayout();
        setLayout(layout);

        createFileMenu();
        createGameMenu();
        createStaffMenu();
        createSalesMenu();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.RED);
        menuBar.add(staffMenu);
        menuBar.add(gameMenu);
       // menuBar.add(salesMenu);


        mainPanel = new JPanel();
        mainPanel.add(Box.createVerticalStrut(5));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        welLabel = new JLabel("Welcome");
        welLabel.setFont(new Font("sanserif", 1, 30));
        welLabel.setForeground(Color.GREEN);

        mainPanel.setLayout(new FlowLayout((FlowLayout.CENTER)));//https://www.tutorialspoint.com/what-is-a-layoutmanager-and-types-of-layoutmanager-in-java
        mainPanel.add(welLabel);
        welLabel.setAlignmentX(Component.CENTER_ALIGNMENT);//https://www.tutorialspoint.com/what-is-a-layoutmanager-and-types-of-layoutmanager-in-java
        mainPanel.add(Box.createVerticalStrut(65));

        LocalDate dateNow= LocalDate.now();
        dateLabel  = new JLabel("Today's date is "+dateNow);
        dateLabel.setFont(new Font("sanserif", 1, 10));
        dateLabel.setForeground(Color.BLUE);
        dateLabel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        //mainPanel.add(dateLabel);

       /*try {
            imgLabel = new JLabel();
            imgLabel.setIcon(new ImageIcon(getClass().getResource("controller.png")));

            imgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            add(imgLabel);
        }
        catch(Exception ex) {

            JOptionPane.showMessageDialog(null,"Invalid Image File in Main Screen");
        }
*/
/*
        imgPanel= new JPanel();

        try {
            imgLabel = new JLabel();
            imgLabel.setIcon(new ImageIcon(getClass().getResource("controller.png")));

            imgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            add(imgLabel);
        }
        catch(Exception ex) {

            JOptionPane.showMessageDialog(null,"Invalid Image File in Main Screen");
        }
        */

        mainPanel.setLayout(new FlowLayout((FlowLayout.CENTER)));

        buttonPanel = new JPanel();

        border = new TitledBorder("Shortcut Button");
        border.setTitleColor(Color.RED);

        buttonPanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));

        buttonPanel.setPreferredSize(new Dimension(350, 50));
        buttonPanel.setBorder(border);
        buttonPanel.setLayout(new GridLayout(1, 3));

        staffButton = new JButton("Register Staff");
        staffButton.addActionListener(this);
        staffButton.setBackground(Color.red);


        gameButton = new JButton("Add Game");
        gameButton.addActionListener(this);
        gameButton.setBackground(Color.green);


        salesButton = new JButton("Add Sales");
        salesButton.addActionListener(this);
        salesButton.setBackground(Color.white);

        buttonPanel.setLayout(new FlowLayout((FlowLayout.CENTER)));//https://www.tutorialspoint.com/what-is-a-layoutmanager-and-types-of-layoutmanager-in-java

        buttonPanel.add(staffButton);
        buttonPanel.add(gameButton);
       // buttonPanel.add(salesButton);



        add(mainPanel, BorderLayout.NORTH);//https://www.tutorialspoint.com/what-is-a-layoutmanager-and-types-of-layoutmanager-in-java
        add(dateLabel,BorderLayout.WEST);
        add(buttonPanel, BorderLayout.SOUTH);//https://www.tutorialspoint.com/what-is-a-layoutmanager-and-types-of-layoutmanager-in-java

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        open();


    }


    public static void main(String[] args) throws Exception{
        new GameStore();

    }


    private void createStaffMenu() {
        JMenuItem item;

        staffMenu = new JMenu("Staff");

        item = new JMenuItem("Add staff");
        item.addActionListener(this);
        staffMenu.add(item);

        item = new JMenuItem("View staff");
        item.addActionListener(this);
        staffMenu.add(item);

       /* item = new JMenuItem("Update staff");
        item.addActionListener(this);
        staffMenu.add(item);
*/
        item = new JMenuItem("Delete staff");
        item.addActionListener(this);
        staffMenu.add(item);

    }

    private void createGameMenu() {

        JMenuItem item;

        gameMenu = new JMenu("Game");

        item = new JMenuItem("Add game");
        item.addActionListener(this);
        gameMenu.add(item);

        item = new JMenuItem("View game");
        item.addActionListener(this);
        gameMenu.add(item);

     /*   item = new JMenuItem("Update game");
        item.addActionListener(this);
        gameMenu.add(item);
*/
        item = new JMenuItem("Delete game");
        item.addActionListener(this);
        gameMenu.add(item);

    }

    private void createSalesMenu() {
        JMenuItem item;

        salesMenu = new JMenu("Sales");

    /*    item = new JMenuItem("Add sales");
        item.addActionListener(this);
        salesMenu.add(item);

        item = new JMenuItem("View sales");
        item.addActionListener(this);
        salesMenu.add(item);

        item = new JMenuItem("Update sales");
        item.addActionListener(this);
        salesMenu.add(item);

        item = new JMenuItem("Delete sales");
        item.addActionListener(this);
        salesMenu.add(item);
*/
    }

    public void createFileMenu() {

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    try {
                        save();
                        JOptionPane.showMessageDialog(null, "Data saved successfully", "Saved", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException e1) {
                        JOptionPane.showMessageDialog(null, "Not able to save the file");
                        e1.printStackTrace();
                    }

                    System.exit(0);
                }
            }
        });

    }

    public void save() throws IOException {

        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("games.dat"));
        os.writeObject(games);
        os.close();

        ObjectOutputStream outstr = new ObjectOutputStream(new FileOutputStream("staff.dat"));
        outstr.writeObject(staff);
        outstr.close();


    }


    public void open() {
        try {

            File file = new File("games.dat");
            File file2 = new File("staff.dat");


            if (file.exists() && file2.exists()) {

                ObjectInputStream game = new ObjectInputStream(new FileInputStream(file));
                games = (ArrayList<Game>) game.readObject();
                game.close();


                ObjectInputStream staff = new ObjectInputStream(new FileInputStream(file));
                staffs = (ArrayList<Staff>) staff.readObject();
                System.out.println(staffs.size());
                staff.close();


                JOptionPane.showMessageDialog(null, file.getName() + " file loaded into the system", "Open", JOptionPane.INFORMATION_MESSAGE);
            } else {
                file.createNewFile();
                JOptionPane.showMessageDialog(null, "File just created!!", "Created " + file.getName() + " file", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (ClassNotFoundException classNotFoundException) {
            JOptionPane.showMessageDialog(null, "Class of object deserialised not a match for anything used in this application", "Error", JOptionPane.ERROR_MESSAGE);
            classNotFoundException.printStackTrace();
        } catch (FileNotFoundException fileNotFoundException) {
            JOptionPane.showMessageDialog(null, "File not found", "Error", JOptionPane.ERROR_MESSAGE);
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            JOptionPane.showMessageDialog(null, "Problem reading from the file", "Error", JOptionPane.ERROR_MESSAGE);
            ioException.printStackTrace();
        }
    }


    public void addStaff() {
        final String[] genderList = {"Male", "Female"};
        int ID;
        String forename;
        String surname;
        String DOB;
        String gender;
        String address;
        int PhoneNo;

        ID=Integer.parseInt(JOptionPane.showInputDialog("Enter staffs ID"));

        forename = (JOptionPane.showInputDialog("Enter staffs forename"));
        surname = JOptionPane.showInputDialog("Enter staffs name");
        gender = (String) JOptionPane.showInputDialog(null, "Genre", "Genre", JOptionPane.QUESTION_MESSAGE, null, genderList, genderList[0]);
        DOB =(JOptionPane.showInputDialog("Please enter your DOB in the format dd/mm/yyyy"));
        address = JOptionPane.showInputDialog("Enter staffs address");
        PhoneNo = Integer.parseInt(JOptionPane.showInputDialog("Enter staffs PhoneNo"));

        staff = new Staff(ID,forename, surname,gender,DOB, address, PhoneNo);
        staffs.add(staff);

        JOptionPane.showMessageDialog(null, "Staff '" + forename + surname + "' added to the system");
    }


    public void displayStaff() {
        JComboBox<String> staffCombo = new JComboBox<>();
        JTextArea output = new JTextArea();

        output.setText("Staff Details:\n\n");

        if (staffs.size() < 1) {
            JOptionPane.showMessageDialog(null, "No staff are added to the system yet. Feel free to 'Add' new staff.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Iterator<Staff> iterator = staffs.iterator();

            while (iterator.hasNext()) {
                staffCombo.addItem(String.valueOf(iterator.next().getID()));//+ "\n");
            }

            JOptionPane.showMessageDialog(null, staffCombo, "Select staff to view details", JOptionPane.PLAIN_MESSAGE);

            int selected = staffCombo.getSelectedIndex();
            output.append(staffs.get(selected).toString());

            JOptionPane.showMessageDialog(null, output, "Staff Details", JOptionPane.PLAIN_MESSAGE);
        }
    }


    public void deleteStaff() {
        JComboBox staffList = new JComboBox();

        for (Staff c : staffs) {
            staffList.addItem(c.getID());
        }

        JOptionPane.showMessageDialog(null, "Select Staff to be removed", "Remove Staff", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, staffList, "Remove Staff", JOptionPane.INFORMATION_MESSAGE);

        int selected = staffList.getSelectedIndex();

        staffs.remove(selected);

        JOptionPane.showMessageDialog(null, "Staff Removed", "Removed", JOptionPane.INFORMATION_MESSAGE);
    }


    public void addGame() {

        final String[] categoryList = {"Horror", "Action-adventure", "RPG", "Sports"};
        String genre;
        String title;
        int age;
        double price;

        genre = (String) JOptionPane.showInputDialog(null, "Genre", "Genre", JOptionPane.QUESTION_MESSAGE, null, categoryList, categoryList[0]);
        title = JOptionPane.showInputDialog("Enter games name");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter games age group"));
        price = Double.parseDouble(JOptionPane.showInputDialog("Enter games price"));

        game = new Game(genre,title, age, price);
        games.add(game);

        JOptionPane.showMessageDialog(null, "Video game '" + title + "' added to the system");
    }


    public void displayGame() {
        JComboBox gameCombo = new JComboBox();
        JTextArea output = new JTextArea();

        output.setText("Game Details:\n\n");

        if (games.size() < 1) {
            JOptionPane.showMessageDialog(null, "No games are added to the system yet. Feel free to 'Add' new games.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Iterator<Game> iterator = games.iterator();

            while (iterator.hasNext()) {
                gameCombo.addItem(iterator.next().getTitle() + "\n");
            }

            JOptionPane.showMessageDialog(null, gameCombo, "Select game to view details", JOptionPane.PLAIN_MESSAGE);

            int selected = gameCombo.getSelectedIndex();
            output.append(games.get(selected).toString());

            JOptionPane.showMessageDialog(null, output, "Game Details", JOptionPane.PLAIN_MESSAGE);
        }
    }


    public void deleteGame() {

        JComboBox gameList = new JComboBox();

        for (Game c : games) {
            gameList.addItem(c.getTitle());
        }

        JOptionPane.showMessageDialog(null, "Select game to be removed", "Remove Game", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, gameList, "Remove Game", JOptionPane.INFORMATION_MESSAGE);

        int selected = gameList.getSelectedIndex();

        games.remove(selected);

        JOptionPane.showMessageDialog(null, "Game Removed", "Removed", JOptionPane.INFORMATION_MESSAGE);
    }




    public void actionPerformed(ActionEvent event) {

        String menuName =event.getActionCommand();
        if (menuName.equals("Add staff") || event.getSource() == staffButton) {
            addStaff();
        } else if (menuName.equals("View staff")) {
            displayStaff();
        } else if (menuName.equals("Delete staff")) {
            deleteStaff();
        } else if (menuName.equals("Add game")|| event.getSource() == gameButton) {
            addGame();
        } else if (menuName.equals("View game")) {
            displayGame();
        } else if (menuName.equals("Delete game")) {
            deleteGame();
        }

        if (menuName.equals("Exit"))
            System.exit(0);
        else
            welLabel.setText("Menu item " + menuName + " is selected");

    }

}

/*
}
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



