package tms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class forget_passowrd extends JFrame implements ActionListener {

    JButton retrive, back;
    JButton search;
    JTextField userNAME_field, userNAME_signup_field, passWORD_signup_field, answer_signup_field;
    JTextField security_field;

    public forget_passowrd() {
        setSize(900, 400);
        setLocation(350, 200);
        setLayout(null);


        JPanel p1 = new JPanel();
        p1.setBackground(new Color(246, 221, 178));
        p1.setBounds(0, 0, 530, 400);

        p1.setLayout(null);
        add(p1);

        //image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgot.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(10, -30, 400, 400);


        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(18, 35, 56));
        p2.setBounds(500, -10, 500, 400);
        add(p2);
        p2.add(image);


        //////
        //Add image 2
        ImageIcon im1 = new ImageIcon(ClassLoader.getSystemResource("icons/img2.png"));
        Image im2 = im1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon im3 = new ImageIcon(im2);
        JLabel image1 = new JLabel(im3);
        image1.setBounds(200, 10, 90, 90);
        p1.add(image1);

        JLabel systemName = new JLabel("TRAVEL MANAGEMENT SYSTEM");
        JLabel signUpNAME = new JLabel("FORGET");

        systemName.setBounds(135, 120, 1000, 30);
        systemName.setForeground(new Color(153, 0, 17));
        systemName.setFont(new Font("OSWALD", Font.PLAIN, 20));
        p1.add(systemName);

        signUpNAME.setBounds(215, 150, 1000, 30);
        signUpNAME.setForeground(new Color(153, 0, 17));
        signUpNAME.setFont(new Font("OSWALD", Font.BOLD, 20));
        p1.add(signUpNAME);


        //////////////////////// more fields /////////////////////////////////////////

        JLabel userName_signup = new JLabel("USERNAME :");
        userName_signup.setBounds(135, 155, 230, 100);
        signUpNAME.setForeground(new Color(0, 98, 105));
        userName_signup.setFont(new Font("OSWALD", Font.BOLD, 13));
        p1.add(userName_signup);

        userNAME_field = new JTextField("Enter User-Name");
        userNAME_field.setBounds(215, 195, 145, 22);
        userNAME_field.setFont(new Font("SAN SERIF", Font.BOLD, 12));
        p1.add(userNAME_field);

        search = new JButton("Search");
        search.setBounds(375, 195, 90, 22);
        search.setBackground(new Color(237, 97, 90));
        search.setForeground(new Color(0, 0, 0));
        search.setFont(new Font("SAN SERIF", Font.BOLD, 11));
        search.addActionListener(this);
        search.setBorder(null);
        p1.add(search);


        JLabel name = new JLabel("NAME           :");
        name.setBounds(135, 190, 230, 100);
        name.setFont(new Font("OSWALD", Font.BOLD, 13));
        p1.add(name);

        userNAME_signup_field = new JTextField();
        userNAME_signup_field.setBounds(215, 227, 145, 22);
        userNAME_signup_field.setFont(new Font("SAN SERIF", Font.BOLD, 12));
        p1.add(userNAME_signup_field);


        JLabel securIty = new JLabel("SECURITY    :");
        securIty.setBounds(135, 230, 100, 100);
        securIty.setFont(new Font("OSWALD", Font.BOLD, 13));
        p1.add(securIty);

        security_field = new JTextField("");
        security_field.setBounds(215, 273, 145, 22);
        security_field.setFont(new Font("SAN SERIF", Font.BOLD, 12));
        p1.add(security_field);

        JLabel answer_signup = new JLabel("ANSWER       :");
        answer_signup.setBounds(135, 280, 500, 100);
        answer_signup.setFont(new Font("OSWALD", Font.BOLD, 13));
        p1.add(answer_signup);

        // answer_signup_field
        answer_signup_field = new JTextField("");
        answer_signup_field.setBounds(215, 317, 145, 22);
        answer_signup_field.setFont(new Font("SAN SERIF", Font.BOLD, 12));
        p1.add(answer_signup_field);


        retrive = new JButton("Retrieve");
        retrive.setBounds(375, 317, 90, 22);
        retrive.setBackground(new Color(237, 97, 90));
        retrive.setForeground(new Color(0, 0, 0));
        retrive.setFont(new Font("SAN SERIF", Font.BOLD, 11));
        retrive.addActionListener(this);
        retrive.setBorder(null);
        p1.add(retrive);

        JLabel password = new JLabel("Password       :");
        password.setBounds(135, 320, 500, 100);
        password.setFont(new Font("OSWALD", Font.BOLD, 13));
        p1.add(password);

        // answer_signup_field
        passWORD_signup_field = new JTextField("");
        passWORD_signup_field.setBounds(215, 365, 145, 22);
        passWORD_signup_field.setFont(new Font("SAN SERIF", Font.BOLD, 12));
        p1.add(passWORD_signup_field);


        back = new JButton();
        back.setBounds(20, 330, 90, 60);
        back.setBackground(new Color(246, 221, 178));
        back.setForeground(new Color(0, 0, 0));
        back.setFont(new Font("SAN SERIF", Font.BOLD, 11));
        back.addActionListener(this);
        back.setBorder(null);
        p1.add(back);

        //Add image 2
        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/left-arrow.png"));
        Image a2 = a1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel img1 = new JLabel(a3);
        img1.setBounds(0, 0, 30, 30);
        back.add(img1);

        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == search) {
            try {
                String query = "select * from account where username = '" + userNAME_field.getText() + "'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                while (rs.next()) {
                    userNAME_signup_field.setText(rs.getString("name"));
                    security_field.setText(rs.getString("security"));
                }

            } catch (Exception ea) {
                ea.printStackTrace();
            }
        } else if (e.getSource() == retrive) {
            try {
                String query = "select * from account where answer = '" + answer_signup_field.getText() + "' AND  username =  '" + userNAME_field.getText() + "'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                while (rs.next()) {
                    passWORD_signup_field.setText(rs.getString("password"));
                }

            } catch (Exception ea) {
                ea.printStackTrace();
            }
        } else if (e.getSource() == back) {
            new login();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new forget_passowrd();
    }

}
