//1
package tms;
//import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class adminLoginScreen extends JFrame implements ActionListener {

    JButton signupBTN, loginBTN, forgot;
    JCheckBox checkpass;
    JTextField userNAME;
    JPasswordField passWORD;

    adminLoginScreen() {
        setSize(900, 400);
        setLocation(350, 200);
        setLayout(null);


        //panel
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(252, 246, 245));
        p1.setBounds(0, 0, 530, 400);

        p1.setLayout(null);
        add(p1);


        //image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/airplane.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(10, -30, 400, 400);


        //panel 2

        JPanel p2 = new JPanel();
        p2.setLayout(null);

        p2.setBackground(new Color(153, 0, 17));
//    p2.setBackground(Color.blue);
        p2.setBounds(500, -10, 500, 400);
        add(p2);

        p2.add(image);

        //////////////////////////////////////////////////////////////////////////////////


        JLabel textLabel = new JLabel("WELCOME TO \n TRAVEL");
        textLabel.setBounds(110, 300, 500, 50);
        //
        // textLabel.setBounds(60, 20, 100, 25);
        textLabel.setForeground(new Color(252, 246, 245));
        textLabel.setFont(new Font("OSWALD", Font.BOLD, 25));
        //textLabel.setSize(50, 50);
        p2.add(textLabel);


        //Add image 2
        ImageIcon im1 = new ImageIcon(ClassLoader.getSystemResource("icons/img2.png"));
        Image im2 = im1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon im3 = new ImageIcon(im2);
        JLabel image1 = new JLabel(im3);
        image1.setBounds(200, 10, 90, 90);

        p1.add(image1);


        //adding signups
        JLabel systemName = new JLabel("TRAVEL MANAGEMENT SYSTEM");
        JLabel signUpNAME = new JLabel("ADMIN- LOGIN");

        systemName.setBounds(135, 120, 1000, 30);
        systemName.setForeground(new Color(153, 0, 17));
        systemName.setFont(new Font("OSWALD", Font.PLAIN, 20));
        p1.add(systemName);

        signUpNAME.setBounds(215, 150, 1000, 30);
        signUpNAME.setForeground(new Color(153, 0, 17));
        signUpNAME.setFont(new Font("OSWALD", Font.BOLD, 20));
        p1.add(signUpNAME);

        //adding user name
        JLabel userName = new JLabel("USERNAME :");
        userName.setBounds(135, 160, 500, 100);
        signUpNAME.setForeground(new Color(0, 98, 105));
        userName.setFont(new Font("OSWALD", Font.BOLD, 13));
        p1.add(userName);

        userNAME = new JTextField("Enter User-Name");
        userNAME.setBounds(215, 200, 145, 22);
        userNAME.setFont(new Font("SAN SERIF", Font.BOLD, 12));
        p1.add(userNAME);

        //adding passwordField
        JLabel passName = new JLabel("PASSWORD:");
        passName.setBounds(135, 195, 500, 100);
        passName.setForeground(new Color(0, 98, 105));
        passName.setFont(new Font("OSWALD", Font.BOLD, 13));
        p1.add(passName);

        passWORD = new JPasswordField();
        passWORD.setBounds(215, 232, 145, 22);
//     passWORD.setBorder(border);
        p1.add(passWORD);


        forgot = new JButton("Forget password");
        forgot.setBounds(365, 215, 60, 60);
        forgot.setBackground(new Color(252, 246, 245));
        forgot.setForeground(Color.white);
        forgot.setFont(new Font("SAN SERIF", Font.BOLD, 11));
        forgot.addActionListener(this);
        forgot.setBorder(null);
        p1.add(forgot);

        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgot-password.png"));
        Image a2 = a1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel imgn = new JLabel(a3);
        imgn.setBounds(0, 0, 25, 25);
        forgot.add(imgn);

        //Jcheck box for show password
        checkpass = new JCheckBox();
        checkpass.setBounds(212, 260, 20, 15);
        //checkpass.setBackground(new Color (255,130,0));
        checkpass.addActionListener(this);
        p1.add(checkpass);

//
//        ImageIcon im1 = new ImageIcon(ClassLoader.getSystemResource("icons/img2.png"));
//    Image im2 = im1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//    ImageIcon im3 = new ImageIcon(im2);
//    JLabel image1 = new JLabel(im3);
//    image1.setBounds(200, 10, 90,90);
//
//     p1.add(image1);

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/eye.png"));
        Image img2 = img1.getImage().getScaledInstance(17, 17, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel img = new JLabel(img3);
        img.setBounds(235, 260, 17, 17);
        p1.add(img);

//     JLabel showPass = new JLabel("SHOW PASSWORD");
//     showPass.setBounds(235,242,100,50);
//     showPass.setFont(new Font("OSWALD", Font.PLAIN,12));
//     p1.add(showPass);
//

        //login button

        JLabel login = new JLabel("Already a member : ");
        login.setBounds(135, 295, 150, 30);
        login.setForeground(new Color(107, 85, 1));
        login.setFont(new Font("OSWALD", Font.BOLD, 13));
        p1.add(login);

        loginBTN = new JButton("Login");
        loginBTN.setBounds(260, 300, 100, 19);
        loginBTN.setBackground(new Color(153, 0, 17));
        loginBTN.setForeground(Color.white);
        loginBTN.setFont(new Font("SAN SERIF", Font.BOLD, 11));
        loginBTN.addActionListener(this);
        p1.add(loginBTN);

        //Sign-up
        JLabel sign = new JLabel("Become a member : ");
        sign.setBounds(135, 325, 150, 30);
        sign.setForeground(new Color(107, 85, 1));
        sign.setFont(new Font("OSWALD", Font.BOLD, 13));
        p1.add(sign);

        signupBTN = new JButton("Sign-up");
        signupBTN.setBounds(260, 330, 100, 19);
        signupBTN.setBackground(new Color(236, 236, 236));
        signupBTN.setForeground(new Color(153, 0, 17));
        signupBTN.setFont(new Font("SAN SERIF", Font.PLAIN, 11));
        signupBTN.addActionListener(this);
        p1.add(signupBTN);


        //panel-3
        JPanel p3 = new JPanel();
        p3.setBounds(0, 0, 15, 400);
        p3.setBackground(new Color(153, 0, 17));
        p1.add(p3);

        setVisible(true);

    }
//
//    JButton signupBTN,loginBTN;
//    JCheckBox checkpass;
//    JTextField userNAME;
//    JPasswordField passWORD;

    public void actionPerformed(ActionEvent ae) {

        String str = "";
        String str1 = passWORD.getText();

        if (ae.getSource() == loginBTN) {
            if (str1.equals(str)) {

                passWORD.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Password field is empty :");

            } else {
//                String s = passWORD.getText();
//                int length = s.length(), special = 0, number = 0, character = 0;
//                int ascii = 0;
//
//                for (int i = 0; i < s.length(); i++) {
//
//                    ascii = (int) s.charAt(i);
//
//                    if (ascii <= 57 && ascii >= 48) {
//                        number = 1;
//                    }
//                    if (ascii <= 90 && ascii >= 65 || ascii <= 122 && ascii >= 97) {
//                        character = 1;
//                    }
//                    if (ascii <= 47 && ascii >= 33 || ascii <= 63 && ascii >= 58 || ascii <= 96 && ascii >= 91) {
//                        special = 1;
//                    }
//                }


//                if (length >= 8 && number ==1 && character ==1 && special ==1) {
                if(str1.length()<8){
                    passWORD.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Password Length is less than 8 characters:");
                }else {

                    try {
                        String username = userNAME.getText();
                        String password = passWORD.getText();


                        //query
                        String query = "select * from account where username = '" + username + "' AND password = '" + password + "'";
                        Conn c = new Conn();

                        ResultSet rs = c.s.executeQuery(query);
                        if (rs.next()) {
                            setVisible(false);
                            System.out.println("Login username = "+ username);
                            new adminLoading(username);
//                            new abce(username);

                        } else {
                            passWORD.setBackground(Color.red);
                            passWORD.setForeground(Color.white);
                            JOptionPane.showMessageDialog(null, "Incorrect User Name or Password :");
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
//                }
//                else{
//                    if(number == 0){
//                        JOptionPane.showMessageDialog(null, "Weak password, Digit  is missing in the password field");
//                    }
//                    else if(special ==0){
//                        JOptionPane.showMessageDialog(null, "Weak password, special character and character is missing in the password field");
//                    }
//                    else if(character ==0){
//                        JOptionPane.showMessageDialog(null, "Weak password, character and digit is missing in the password field");
//                    }
//                    else if(length <8 && character ==1 && special == 1 && number  ==1){
//                        JOptionPane.showMessageDialog(null, "Weak password, your password length should be greater than 8");
//                    }
//
//                }
            }
        }

        if (ae.getSource() == signupBTN) {
            setVisible(false);
            new signUP();
        } else if (ae.getSource() == forgot) {
            setVisible(false);
            new forget_passowrd();
        }
        if (checkpass.isSelected()) {
//            String showPass = checkpass.getText();
//            String blank=" ";
//            checkpass.setText(showPass);
            passWORD.setEchoChar((char) 0);
        } else {
            passWORD.setEchoChar('*');
        }


    }

    public static void main(String[] args) {
        new adminLoginScreen();
    }
}
