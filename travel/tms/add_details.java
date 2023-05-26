//7

package tms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class add_details extends JFrame implements ActionListener {

    JLabel username_fetch;
    JComboBox comboID;
    JTextField idNUMBER, country_field, address_field, email_field, phone_field;
    JRadioButton male, female;
    JButton add, back;
    String userName;

    public add_details(String userName) {
        this.userName = userName;
        System.out.println("Add details username = "+userName);
        setBounds(486, 269, 600, 332);
        setLayout(null);


        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 600, 352);
        p1.setLayout(null);
        p1.setBackground(new Color(252, 246, 245));
        add(p1);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(10, 0, 600, 40);
        p2.setBackground(new Color(153, 0, 17));

        JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBounds(300, 80, 5, 176);
        p3.setBackground(new Color(153, 0, 17));

        // -> USER NAME
        JLabel username = new JLabel("Username : ");
        username.setBounds(30, 40, 100, 50);
        p1.add(username);

        username_fetch = new JLabel(userName);
        username_fetch.setBounds(110, 40, 100, 50);
        p1.add(username_fetch);
        System.out.println(userName);

        //-> ID
        JLabel id = new JLabel("ID                 : ");
        id.setBounds(30, 65, 100, 50);
        p1.add(id);

        comboID = new JComboBox(new String[]{"CNIC", "PASSPORT", "BIOMETRIC", "E-SIM"});
        comboID.setBounds(110, 80, 100, 20);
        comboID.setBackground(new Color(252, 246, 245));
        comboID.setForeground(new Color(153, 0, 17));
        comboID.setFont(new Font("OSWALD", Font.BOLD, 12));
        p1.add(comboID);


        // -> ID indentify
        JLabel id_identify = new JLabel("Number      : ");
        id_identify.setBounds(30, 90, 100, 50);
        p1.add(id_identify);

        idNUMBER = new JTextField();
        idNUMBER.setBounds(110, 105, 100, 20);
        idNUMBER.setFont(new Font("OSWALD", Font.BOLD, 12));
        idNUMBER.setForeground(new Color(153, 0, 17));
        p1.add(idNUMBER);


        // ->GENDER
        JLabel gender = new JLabel("Gender       : ");
        gender.setBounds(30, 115, 100, 50);
        p1.add(gender);

        male = new JRadioButton("MALE");
        male.setBounds(110, 130, 50, 20);
        male.setBackground(new Color(252, 246, 245));
        male.setFont(new Font("OSWALD", Font.BOLD, 11));
        p1.add(male);

        female = new JRadioButton("FEMALE");
        female.setBounds(155, 130, 70, 20);
        female.setBackground(new Color(252, 246, 245));
        female.setFont(new Font("OSWALD", Font.BOLD, 11));
        p1.add(female);

        ButtonGroup b = new ButtonGroup();
        b.add(male);
        b.add(female);


        //-> COUNTRY 
        JLabel country = new JLabel("Country      : ");
        country.setBounds(30, 140, 100, 50);
        p1.add(country);


        country_field = new JTextField();
        country_field.setBounds(110, 155, 100, 20);
        country_field.setFont(new Font("OSWALD", Font.BOLD, 12));
        country_field.setForeground(new Color(153, 0, 17));
        p1.add(country_field);


        //-> ADDRESS
        JLabel address = new JLabel("Address     : ");
        address.setBounds(30, 165, 100, 50);
        p1.add(address);


        address_field = new JTextField();
        address_field.setBounds(110, 180, 100, 20);
        address_field.setFont(new Font("OSWALD", Font.BOLD, 12));
        address_field.setForeground(new Color(153, 0, 17));
        p1.add(address_field);


        //-> MOBILE NUM
        JLabel mobile_num = new JLabel("Phone         : ");
        mobile_num.setBounds(30, 190, 100, 50);
        p1.add(mobile_num);


        phone_field = new JTextField();
        phone_field.setBounds(110, 205, 100, 20);
        phone_field.setFont(new Font("OSWALD", Font.BOLD, 12));
        phone_field.setForeground(new Color(153, 0, 17));
        p1.add(phone_field);


        //-> EMAIL
        JLabel email = new JLabel("Email           : ");
        email.setBounds(30, 215, 100, 50);
        p1.add(email);


        email_field = new JTextField();
        email_field.setBounds(110, 230, 100, 20);
        email_field.setFont(new Font("OSWALD", Font.PLAIN, 12));
        email_field.setForeground(new Color(153, 0, 17));
        p1.add(email_field);


        //Add button
        add = new JButton("ADD [+]");
        add.setBounds(140, 280, 69, 19);
        add.setBackground(new Color(153, 0, 17));
        add.setForeground(Color.white);
        add.setFont(new Font("OSWALD", Font.BOLD, 11));
        add.addActionListener(this);
        p1.add(add);

        //Back Button
        back = new JButton("BACK");
        back.setBounds(30, 280, 72, 19);
        back.setBackground(new Color(153, 0, 17));
        back.setForeground(Color.white);
        back.setFont(new Font("SAN SERIF", Font.PLAIN, 10));
        back.addActionListener(this);
        p1.add(back);


        // -> J-lABEL FOR ADD DETAILS:
        JLabel d = new JLabel("ADD PERSONAL DETAILS: ");
        d.setFont(new Font("OSWALD", Font.PLAIN, 25));
        d.setBounds(20, 0, 300, 50);
        d.setForeground(Color.white);
        p2.add(d);

        // -> Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/add-user.png"));
        Image i2 = i1.getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(250, -35, 400, 400);

        p1.add(image);
        p1.add(p2);
        p1.add(p3);


//        try {
//            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery("select * from account where username= '" + userName + "'");
//
//            while (rs.next()) {
//                username_fetch.setText(rs.getString("username"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        setUndecorated(true);
        setVisible(true);
//        setBackground(new Color(153,0,17));

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {


            String username = username_fetch.getText();
            String id = (String) comboID.getSelectedItem();
            String number = idNUMBER.getText();
            String gender = null;
            if (male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }

            String country = country_field.getText();
            String address = address_field.getText();
            String mobileNumber = phone_field.getText();
            String email = email_field.getText();

            int flag = 0;

            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    flag = 1;
                }
            }

            if (flag == 1) {
                new confirmation_for_add_details();
                try {
                    Conn c = new Conn();
                    String query = "insert into customer values('" + username + "', '" + id + "','" + number + "','" + gender + "','" + country + "','" + address + "','" + mobileNumber + "','" + email + "')";
                    c.s.executeUpdate(query);

//                    JOptionPane.showMessageDialog(null, "Person Added Successfully");
                    setVisible(false);


                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                email_field.setBackground(new Color(243, 13, 13));
                email_field.setForeground(new Color(236, 229, 229));
                JOptionPane.showMessageDialog(null, "Email format is not correct..");
            }

        } else {
            setVisible(false);
            //new dashboard();
        }
    }

    public static void main(String[] args) {
        new add_details("");
    }

}
