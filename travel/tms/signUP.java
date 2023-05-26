//3

package tms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class signUP extends JFrame implements ActionListener {


    JButton clear_btn;
    JButton signup_btn;
    JTextField userNAME, userNAME_signup_field, passWORD_signup_field, answer_signup_field;
    Choice security;

    signUP() {
        setSize(900, 400);
        setLocation(350, 200);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(252, 246, 245));
        p1.setBounds(0, 0, 530, 400);
        p1.setLayout(null);
        add(p1);

        JPanel p2 = new JPanel();

        p2.setBackground(new Color(153, 0, 17));
        p2.setBounds(500, -10, 500, 400);
        p2.setLayout(null);
        add(p2);


        //sign up image

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/sign-up.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(10, -20, 400, 400);
        p2.add(l1);


        //map image
        //Add image 2
        ImageIcon im1 = new ImageIcon(ClassLoader.getSystemResource("icons/img2.png"));
        Image im2 = im1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon im3 = new ImageIcon(im2);
        JLabel image1 = new JLabel(im3);
        image1.setBounds(200, 10, 90, 90);

        p1.add(image1);


        //sign up

        //adding signups
        JLabel systemName = new JLabel("TRAVEL MANAGEMENT SYSTEM");
        JLabel signUpNAME = new JLabel("SIGNUP");

        systemName.setBounds(135, 105, 230, 30);
        systemName.setForeground(new Color(153, 0, 17));
        systemName.setFont(new Font("OSWALD", Font.PLAIN, 20));
        p1.add(systemName);

        signUpNAME.setBounds(215, 135, 230, 30);
        signUpNAME.setForeground(new Color(153, 0, 17));
        signUpNAME.setFont(new Font("OSWALD", Font.BOLD, 20));
        p1.add(signUpNAME);


        //adding user name
        JLabel userName_signup = new JLabel("USERNAME :");
        userName_signup.setBounds(135, 135, 230, 100);
        signUpNAME.setForeground(new Color(0, 98, 105));
        userName_signup.setFont(new Font("OSWALD", Font.BOLD, 13));
        p1.add(userName_signup);

        userNAME = new JTextField("Enter User-Name");
        userNAME.setBounds(215, 175, 145, 22);
        userNAME.setFont(new Font("SAN SERIF", Font.BOLD, 12));
        p1.add(userNAME);


        //adding name
        JLabel name = new JLabel("NAME           :");
        name.setBounds(135, 170, 230, 100);
        name.setFont(new Font("OSWALD", Font.BOLD, 13));
        p1.add(name);

        userNAME_signup_field = new JTextField("Enter Name");
        userNAME_signup_field.setBounds(215, 207, 145, 22);
        userNAME_signup_field.setFont(new Font("SAN SERIF", Font.BOLD, 12));
        p1.add(userNAME_signup_field);

        security = new Choice();
        security.add("Place of Birth?");
        security.add("Marvel hero?");
        security.add("Iphone or andriod?");
        security.add("Your college place?");
        security.setBounds(215, 280, 145, 500);
        p1.add(security);


        //adding password
        JLabel passName_signup = new JLabel("PASSWORD:");
        passName_signup.setBounds(135, 200, 230, 100);
        passName_signup.setForeground(new Color(0, 98, 105));
        passName_signup.setFont(new Font("OSWALD", Font.BOLD, 13));
        p1.add(passName_signup);

        passWORD_signup_field = new JPasswordField();
        passWORD_signup_field.setBounds(215, 240, 145, 22);
        p1.add(passWORD_signup_field);


        //security Q/A
        JLabel securIty = new JLabel("SECURITY    :");
        securIty.setBounds(135, 237, 100, 100);
        securIty.setFont(new Font("OSWALD", Font.BOLD, 13));
        p1.add(securIty);


        JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBackground(new Color(153, 0, 17));
        p3.setBounds(0, 0, 15, 400);
        p1.add(p3);


        //Answer
        JLabel answer_signup = new JLabel("ANSWER       :");
        answer_signup.setBounds(135, 280, 500, 100);
        answer_signup.setFont(new Font("OSWALD", Font.BOLD, 13));
        p1.add(answer_signup);

        // answer_signup_field
        answer_signup_field = new JTextField("");
        answer_signup_field.setBounds(215, 317, 145, 22);
        answer_signup_field.setFont(new Font("SAN SERIF", Font.BOLD, 12));
        p1.add(answer_signup_field);


        //button
        signup_btn = new JButton("SIGN-IN");
        signup_btn.setBackground(new Color(153, 0, 17));
        signup_btn.setForeground(new Color(252, 246, 245));
        signup_btn.setBounds(390, 280, 100, 18);
        signup_btn.setFont(new Font("OSWALD", Font.BOLD, 13));
        signup_btn.addActionListener(this);
        p1.add(signup_btn);


        clear_btn = new JButton("BACK");
        clear_btn.setBackground(Color.white);
        clear_btn.setForeground(new Color(153, 0, 17));
        clear_btn.setBounds(390, 310, 100, 18);
        clear_btn.setFont(new Font("OSWALD", Font.BOLD, 13));
        clear_btn.addActionListener(this);
        p1.add(clear_btn);

        //new Color(252, 246, 245)
        //new Color(153,0,17)


        setUndecorated(true);
        setVisible(true);
    }

    boolean checkChar(String s) {
        int length = s.length(), special = 0, number = 0, character = 0;
        int ascii = 0;
        for (int i = 0; i < s.length(); i++) {
            ascii = (int) s.charAt(i);

            if (ascii <= 57 && ascii >= 48) {
                number = 1;
            }
            if (ascii <= 90 && ascii >= 65 || ascii <= 122 && ascii >= 97) {
                character = 1;
            }
            if (ascii <= 47 && ascii >= 33 || ascii <= 63 && ascii >= 58 || ascii <= 96 && ascii >= 91) {
                special = 1;
            }
        }

        if (number == 1 && special == 1 && character == 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean check(String username) {
        int flag = 0;
        String a = "";
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username='"+username+"'");


            while (rs.next()) {
                a = rs.getString("username");
                System.out.println(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (username.equals(a)) {
            System.out.println("flag = 1");
            flag = 1;
        }
        if (flag == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == signup_btn) {

            int special = 0, digit = 0, characters = 0;

            String str = userNAME.getText();
            int s = str.length();

            String pass = passWORD_signup_field.getText();
            int password_length = pass.length();

            String ans = answer_signup_field.getText();
            int ans_length = ans.length();


//                if (length >= 8 && number ==1 && character ==1 && special ==1) {

            if (check(str)) {
                userNAME.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Username already exist try another one:");
            } else {
                if (password_length < 8) {
                    passWORD_signup_field.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Password length should be greater than 8:");
                } else if (ans_length < 1) {
                    answer_signup_field.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Answer field is empty");
                } else if (!checkChar(pass)) {
                    answer_signup_field.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Your password is weak\nUse the combination of diffrent characters instead...");
                } else {
                    passWORD_signup_field.setBackground(Color.green);
                    answer_signup_field.setBackground(Color.green);
                    userNAME.setBackground(Color.green);

                    String username = userNAME.getText();

                    String name = userNAME_signup_field.getText();
                    String password = passWORD_signup_field.getText();
                    String question = security.getSelectedItem();
                    String answer = answer_signup_field.getText();


                    //[]writing the query now
                    String query = "insert into account values ('" + username + "', '" + name + "', '" + password + "' , '" + question + "','" + answer + "')";

                    //[]try catch to run the sql query
                    try {
                        //making connction eastablish by making the [connection class object]

                        Conn c = new Conn();


                        //[STEP 4 ] Executing the SQL queries by the help of statements
                        c.s.executeUpdate(query);

                        //for pop up
                        setVisible(false);
                        new create_account_confirmation();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }
        } else if (ae.getSource() == clear_btn) {
            //closing the current tab
            setVisible(false);

            //showing the log screen
            new login();
        }
    }


    public static void main(String[] args) {
        new signUP();
    }
}
