//6
package tms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dashboard extends JFrame implements ActionListener {

    JButton details, update, view, delete, checkPackage, bookPackage, viewPackage, viewHotel, bookHotel, payment, calculate, logOut;
    JButton menu;
    JPanel menu_panel;


    JMenuBar m;
    JMenu file, help, custom;
    JMenuItem details1, find, login, note, openGuide, about1, customize1;
    String userName;

    dashboard(String userName) {
        this.userName= userName;
        System.out.println("DashBoard username = "+userName);
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
        JLabel home = new JLabel("HOME");
        home.setForeground(new Color(37, 70, 54));
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
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/grassBlur.jpg"));
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
            new menu_panel(userName);

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
        new dashboard("");
    }
}

//////// toolbar code
/**
 * JButton close;
 * <p>
 * //    JCheckBox menu;
 * JComboBox menu;
 * JMenuBar m;
 * JMenu file, help, custom;
 * JMenuItem details, find, login, note, openGuide, about, customize;
 * <p>
 * menu_panel() {
 * setBounds(900, 230, 200, 420);
 * setLayout(null);
 * <p>
 * //p1
 * JPanel p1 = new JPanel();
 * p1.setBackground(new Color(37, 70, 54));
 * p1.setBounds(0, 0, 200, 420);
 * p1.setLayout(null);
 * add(p1);
 * <p>
 * <p>
 * // tool label
 * JLabel tools = new JLabel("MENU");
 * tools.setBounds(10, 30, 60, 25);
 * tools.setFont(new Font("OSWALD", Font.BOLD, 25));
 * tools.setForeground(new Color(213, 236, 255));
 * p1.add(tools);
 * <p>
 * close = new JButton();
 * close.setBounds(160, 15, 60, 60);
 * close.setBackground(new Color(37, 70, 54));
 * close.setForeground(new Color(153, 0, 17));
 * //        logOut.setBackground(new Color(252, 246, 245));
 * close.setBorder(null);
 * close.addActionListener(this);
 * p1.add(close);
 * <p>
 * ImageIcon a = new ImageIcon(ClassLoader.getSystemResource("icons/close.png"));
 * Image a1 = a.getImage().getScaledInstance(19, 19, Image.SCALE_DEFAULT);
 * ImageIcon a2 = new ImageIcon(a1);
 * JLabel a3 = new JLabel(a2);
 * a3.setBounds(0, 0, 19, 19);
 * close.add(a3);
 * <p>
 * <p>
 * m = new JMenuBar();
 * <p>
 * m.setBounds(0, 80, 200, 30);
 * m.setBackground(new Color(236, 138, 11));
 * m.setFont(new Font("OSWALD", Font.BOLD, 22));
 * <p>
 * /////////////////////////////////
 * file = new JMenu("File");
 * details = new JMenuItem("check details ");
 * details.addActionListener(this);
 * details.setBackground(new Color(236, 138, 11));
 * <p>
 * find = new JMenuItem("find file in pc");
 * find.setBackground(new Color(236, 138, 11));
 * find.addActionListener(this);
 * <p>
 * login = new JMenuItem("Open Login Page");
 * login.addActionListener(this);
 * login.setBackground(new Color(236, 138, 11));
 * <p>
 * <p>
 * note = new JMenuItem("Open Notepad");
 * note.addActionListener(this);
 * note.setBackground(new Color(236, 138, 11));
 * <p>
 * file.add(details);
 * file.add(find);
 * file.add(login);
 * file.add(note);
 * <p>
 * ////////////////////////////////////////////////////////////////
 * <p>
 * help = new JMenu("Help");
 * about = new JMenuItem("About us");
 * about.setBackground(new Color(236, 138, 11));
 * help.add(about);
 * <p>
 * openGuide = new JMenuItem("Open Guide");
 * openGuide.setBackground(new Color(236, 138, 11));
 * openGuide.setBackground(new Color(236, 138, 11));
 * <p>
 * <p>
 * m.add(file);
 * m.add(help);
 * ////////////////////////////////////////////////////////////////////
 * custom = new JMenu("System");
 * customize = new JMenuItem("Customize font");
 * customize.setBackground(new Color(236, 138, 11));
 * custom.add(customize);
 * <p>
 * m.add(custom);
 * <p>
 * p1.add(m);
 * <p>
 * //        m.add("acc");
 * <p>
 * setUndecorated(true);
 * setVisible(true);
 * <p>
 * }
 * <p>
 * public void actionPerformed(ActionEvent e) {
 * if (e.getSource() == close) {
 * setVisible(false);
 * } else if (e.getSource() == note) {
 * try {
 * Runtime.getRuntime().exec("notepad.exe");
 * } catch (IOException ex) {
 * ex.printStackTrace();
 * }
 * }else if (e.getSource() == details){
 * JPanel p1 = new JPanel();
 * p1.setBackground(new Color(245, 251, 248));
 * p1.setBounds(0, 0, 200, 420);
 * p1.setLayout(null);
 * add(p1);
 * <p>
 * //            ImageIcon a = new ImageIcon(ClassLoader.getSystemResource("icons/details.png"));
 * //            Image a1 = a.getImage().getScaledInstance(200, 420, Image.SCALE_DEFAULT);
 * //            ImageIcon a2 = new ImageIcon(a1);
 * //            JLabel a3 = new JLabel(a2);
 * //            a3.setBounds(0, 0, 200, 420);
 * //            p1.add(a3);
 * <p>
 * setVisible(true);
 * <p>
 * }
 * }
 * <p>
 * public static void main(String[] args) {
 * new menu_panel();
 * }
 * }
 */