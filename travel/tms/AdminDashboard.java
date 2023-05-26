package tms;
//AdminDashboard
//6
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminDashboard extends JFrame implements ActionListener {

    JButton details, update, view, delete, checkPackage, bookPackage, viewPackage, viewHotel, bookHotel, payment, calculate, logOut;
    JButton menu;
    JPanel menu_panel;


    JMenuBar m;
    JMenu file, help, custom;
    JMenuItem details1, find, login, note, openGuide, about1, customize1;
    String userName,name;

    AdminDashboard(String userName) {
        this.userName= userName;
        this.name=name;
        name = "Ahmed";
        System.out.println("DashBoard username = "+name);
        setBounds(300, 150, 800, 500);
        setLayout(null);

        //p1
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        //p1.setBackground(new Color(153,0,17));
        p1.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.2f));
        p1.setBounds(0, 0, 800, 80);
        add(p1);

        JPanel p3 = new JPanel();
        p3.setLayout(null);
        //p3.setBackground(new Color(153,0,17));
        p3.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.1f));
        p3.setBounds(0, 80, 800, 420);
        add(p3);

        /////// menu ///////
//        menu_panel = new JPanel();
//        menu_panel.setBackground(new Color(45, 75, 111));
//        menu_panel.setBounds(0, 0, 170, 420);
//        menu_panel.setLayout(null);
//        p3.add(menu_panel);


        //home
        JLabel home = new JLabel("ADMIN");
        home.setForeground(new Color(255, 255, 255));
        home.setBounds(350, 20, 300, 40);
        home.setFont(new Font("OSWALD", Font.BOLD, 35));
        p1.add(home);

        //p2
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.CYAN);
        p2.setBounds(0, 0, 800, 500);
        p2.setLayout(null);
        add(p2);

        JPanel p4 = new JPanel();
        p4.setLayout(null);
        //p1.setBackground(new Color(153,0,17));
        p4.setBackground(new Color(255, 252, 252));
        p4.setBounds(0, 385, 800, 35);
        p3.add(p4);
        //image panel //t2 -> grass
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/123'.jpg"));
        Image img2 = img.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image1 = new JLabel(img3);
        image1.setBounds(0, 0, 800, 500);
        p2.add(image1);
//    p2.add(p1);


        //////////////////////////////// menu button ///////////////////////

        menu = new JButton();
        menu.setBounds(0, 0, 20, 20);
        menu.setBackground(new Color(28, 54, 84));
        menu.setForeground(new Color(153, 0, 17));
//        logOut.setBackground(new Color(252, 246, 245));
        menu.addActionListener(this);
        menu.setBorder(null);
        p3.add(menu);


        ImageIcon a = new ImageIcon(ClassLoader.getSystemResource("icons/m1.png"));
        Image a1 = a.getImage().getScaledInstance(18, 18, Image.SCALE_DEFAULT);
        ImageIcon a2 = new ImageIcon(a1);
        JLabel a3 = new JLabel(a2);
        a3.setBounds(5, 0, 18, 18);
        menu.add(a3);


        ///////////////////////////////////////////////////////////////////////////////////////////////////////
        m = new JMenuBar();
        m.setBounds(20, 0, 900, 20);
        m.setBackground(new Color(255, 252, 252));
        m.setFont(new Font("OSWALD", Font.BOLD, 22));

        /////////////////////////////////
        file = new JMenu("File");
        details1 = new JMenuItem("check Guide ");
        details1.addActionListener(this);
        details1.setBackground(new Color(255, 252, 252));

//        find = new JMenuItem("find file ");
//        find.setBackground(new Color(255, 252, 252));
//        find.addActionListener(this);

        login = new JMenuItem("Go for login");
        login.addActionListener(this);
        login.setBackground(new Color(255, 252, 252));


        note = new JMenuItem("Note your plans");
        note.addActionListener(this);
        note.setBackground(new Color(255, 252, 252));

        file.add(details1);
//        file.add(find);
        file.add(login);
        file.add(note);

        ////////////////////////////////////////////////////////////////

        help = new JMenu("Help");
        about1 = new JMenuItem("About us");
        about1.addActionListener(this);
        about1.setBackground(new Color(255, 252, 252));

        help.add(about1);


        m.add(file);
        m.add(help);

        ////////////////////////////////////////////////////////////////////
        custom = new JMenu("Thoughts");
        customize1 = new JMenuItem("Review");
        customize1.addActionListener(this);
        customize1.setBackground(new Color(255, 252, 252));
        custom.add(customize1);

        m.add(custom);
        p3.add(m);


        p3.setLayout(null);

        ImageIcon z = new ImageIcon(ClassLoader.getSystemResource("icons/airplane.png"));
        Image z1 = z.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon z2 = new ImageIcon(z1);
        JLabel z3 = new JLabel(z2);
        z3.setBounds(250, 60, 250, 250);
        p3.add(z3);


        ///////////////  MENU  PANEL //////////////////////////////////////////////////////////////////////////

        logOut = new JButton("LOGOUT");
        logOut.setBounds(20, 5, 120, 30);
        logOut.setBackground(new Color(255, 252, 252));
        logOut.setForeground(new Color(153, 0, 17));
//        logOut.setBackground(new Color(252, 246, 245));
        logOut.setFont(new Font("OSWALD", Font.BOLD, 15));
        logOut.setBorder(null);
//        logOut.setBorderPainted(true);
        logOut.addActionListener(this);
        p4.add(logOut);

        //image panel //t2 -> grass
        ImageIcon img4 = new ImageIcon(ClassLoader.getSystemResource("icons/logout.png"));
        Image img5 = img4.getImage().getScaledInstance(19, 19, Image.SCALE_DEFAULT);
        ImageIcon img6 = new ImageIcon(img5);
        JLabel image2 = new JLabel(img6);
        image2.setBounds(0, 0, 19, 19);
        logOut.add(image2);


        setUndecorated(true);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == menu) {
            System.out.println("User = "+ name);
            new adminMenuPanel(name);

        } else if (ae.getSource() == logOut) {
            setVisible(false);
            new logout_confirm();
        } else if (ae.getSource() == note) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == about1) {
            new about_info();
        } else if (ae.getSource() == login) {
            setVisible(false);
            new login();
        } else if (ae.getSource() == find) {
            try {
                Runtime.getRuntime().exec("run.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == details1) {
            new guide();
        }


        if (ae.getSource() == customize1) {
            System.out.println("hello");
            new cumtomize();
        }
    }

    public static void main(String[] args) {
        new AdminDashboard("");
    }
}
