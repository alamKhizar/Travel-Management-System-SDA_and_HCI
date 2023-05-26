
package tms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class delete_data extends JFrame implements ActionListener {


    JLabel username_fetch;
    JComboBox comboID;
    JTextField idNUMBER, country_field, address_field, email_field, phone_field, tfID, tfGender;
    JRadioButton male, female;
    JButton update, back;
    String userName;

    public delete_data(String userName) {
        this.userName = userName;
        System.out.println("Deleting username = "+ userName);
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


        //-> ID
        JLabel id = new JLabel("ID                 : ");
        id.setBounds(30, 65, 100, 50);
        p1.add(id);


        tfID = new JTextField();
        tfID.setBounds(110, 80, 100, 20);
        tfID.setFont(new Font("OSWALD", Font.BOLD, 12));
        tfID.setForeground(new Color(153, 0, 17));
        p1.add(tfID);

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

        tfGender = new JTextField();
        tfGender.setBounds(110, 130, 100, 20);
        tfGender.setFont(new Font("OSWALD", Font.BOLD, 12));
        tfGender.setForeground(new Color(153, 0, 17));
        p1.add(tfGender);

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
        update = new JButton("DELETE [-]");
        update.setBounds(140, 280, 85, 19);
        update.setBackground(new Color(153, 0, 17));
        update.setForeground(Color.white);
        update.setFont(new Font("OSWALD", Font.BOLD, 11));
        update.addActionListener(this);
        p1.add(update);

        //Back Button
        back = new JButton("BACK");
        back.setBounds(30, 280, 72, 19);
        back.setBackground(new Color(153, 0, 17));
        back.setForeground(Color.white);
        back.setFont(new Font("SAN SERIF", Font.PLAIN, 10));
        back.addActionListener(this);
        p1.add(back);


        // -> J-lABEL FOR ADD DETAILS:
        JLabel d = new JLabel("DELETE PERSONAL DETAILS: ");
        d.setFont(new Font("OSWALD", Font.PLAIN, 25));
        d.setBounds(20, 0, 300, 50);
        d.setForeground(Color.white);
        p2.add(d);

        // -> Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
        Image i2 = i1.getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(250, -35, 400, 400);

        p1.add(image);
        p1.add(p2);
        p1.add(p3);


        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username='"+userName+"'");


            while (rs.next()) {
                username_fetch.setText(rs.getString("username"));
                tfID.setText(rs.getString("id"));
                idNUMBER.setText(rs.getString("number"));
                tfGender.setText(rs.getString("gender"));
                country_field.setText(rs.getString("country"));
                address_field.setText(rs.getString("address"));
                phone_field.setText(rs.getString("mobileNumber"));
                email_field.setText(rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        setUndecorated(true);
        setVisible(true);
////        setBackground(new Color(153,0,17));
//        
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == update) {

            String username = username_fetch.getText();
            String id = tfID.getText();
            String number = idNUMBER.getText();
            String gender = tfGender.getText();
            String country = country_field.getText();
            String address = address_field.getText();
            String mobileNumber = phone_field.getText();
            String email = email_field.getText();

            try {
                Conn c = new Conn();
                String query = "delete from customer ";
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Person Deleted Successfully");
                setVisible(false);


            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            //new dashboard();
        }
    }


    public static void main(String[] args) {
        new delete_data("");
    }
}
