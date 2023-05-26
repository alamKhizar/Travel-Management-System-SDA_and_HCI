package tms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class adminMenuPanel extends JFrame implements ActionListener {

    JButton close;
    JButton details, find, update, view, delete, checkPackage, bookPackage, viewPackage, viewHotel, bookHotel, payment, calculate;
    //    JCheckBox menu;
    JComboBox menu;

    String userName;

    adminMenuPanel(String userName) {

        this.userName = userName;

        System.out.println("Menu panel username = " + userName);
        setBounds(300, 250, 175, 365);
        setLayout(null);

        //p1
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(28, 54, 84));
        p1.setBounds(0, 0, 175, 365);
        p1.setLayout(null);
        add(p1);


        JLabel tools = new JLabel("MENU");
        tools.setBounds(70, 5, 60, 25);
        tools.setFont(new Font("OSWALD", Font.BOLD, 18));
        tools.setForeground(new Color(213, 236, 255));
        p1.add(tools);

        close = new JButton();
        close.setBounds(20, 7, 20, 20);
        close.setBackground(new Color(28, 54, 84));
        close.setForeground(new Color(153, 0, 17));
//        logOut.setBackground(new Color(252, 246, 245));
        close.setBorder(null);
        close.addActionListener(this);
        p1.add(close);

        ImageIcon a = new ImageIcon(ClassLoader.getSystemResource("icons/close.png"));
        Image a1 = a.getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT);
        ImageIcon a2 = new ImageIcon(a1);
        JLabel a3 = new JLabel(a2);
        a3.setBounds(0, 0, 15, 15);
        close.add(a3);


/////////////////////////////////////////////////////////


        find = new JButton("Confirm");
        find.setBounds(20, 65, 170, 30);
        find.setBackground(new Color(153, 0, 17));
        find.setFont(new Font("OSWALD", Font.PLAIN, 17));
        find.setForeground(new Color(252, 246, 245));
        find.addActionListener(this);
        find.setBorder(null);
        p1.add(find);


        ImageIcon z = new ImageIcon(ClassLoader.getSystemResource("icons/s1.png"));
        Image z1 = z.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon z2 = new ImageIcon(z1);
        JLabel z3 = new JLabel(z2);
        z3.setBounds(0, 0, 25, 25);
        find.add(z3);
        //////////////////////////////////////////////////////////////////////////

        //Button 2 update:
        update = new JButton("Update Details");
        update.setBounds(20, 95, 170, 30);
        update.setBackground(new Color(153, 0, 17));
        update.setFont(new Font("OSWALD", Font.PLAIN, 15));
        update.setForeground(new Color(252, 246, 245));
//        update.setMargin(new Insets(0, 0, 0, 25));
        update.addActionListener(this);
        update.setBorder(null);
        p1.add(update);

        ImageIcon c = new ImageIcon(ClassLoader.getSystemResource("icons/t.png"));
        Image c1 = c.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon c2 = new ImageIcon(c1);
        JLabel c3 = new JLabel(c2);
        c3.setBounds(0, 0, 25, 25);
        update.add(c3);
        ///////////////////////////////////////////////////////////////////////////////////

        //Button 3 View:
        view = new JButton("View Details");
        view.setBounds(20, 125, 170, 30);
        view.setBackground(new Color(153, 0, 17));
        view.setFont(new Font("OSWALD", Font.PLAIN, 15));
        view.setForeground(new Color(252, 246, 245));
//        view.setMargin(new Insets(0, 0, 0, 25));
        view.setBorder(null);
        view.addActionListener(this);
        p1.add(view);

        ImageIcon d = new ImageIcon(ClassLoader.getSystemResource("icons/v2.png"));
        Image d1 = d.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon d2 = new ImageIcon(d1);
        JLabel d3 = new JLabel(d2);
        d3.setBounds(0, 0, 25, 25);
        view.add(d3);
        ///////////////////////////////////////////////////////////////

        //Button 3 delete:
        delete = new JButton("Delete Details");
        delete.setBounds(20, 155, 170, 30);
        delete.setBackground(new Color(153, 0, 17));
        delete.setFont(new Font("OSWALD", Font.PLAIN, 15));
        delete.setForeground(new Color(252, 246, 245));
//        delete.setMargin(new Insets(0, 0, 0, 25));
        delete.setBorder(null);
        delete.addActionListener(this);
        p1.add(delete);

        ImageIcon e = new ImageIcon(ClassLoader.getSystemResource("icons/du.png"));
        Image e1 = e.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon e2 = new ImageIcon(e1);
        JLabel e3 = new JLabel(e2);
        e3.setBounds(0, 0, 25, 25);
        delete.add(e3);
        ///////////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////
        //800 80

        setUndecorated(true);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == view) {
            new view_details(userName);
        } else if (ae.getSource() == update) {
            new update_details(userName);
        } else if (ae.getSource() == delete) {
            System.out.println("User = "+ userName);
            new delete_data(userName);
        } else if (ae.getSource() == close) {
            setVisible(false);
        } else if (ae.getSource() == find) {
            new check_id(userName);
        }

    }

    public static void main(String[] args) {
        new adminMenuPanel("");
    }
}

