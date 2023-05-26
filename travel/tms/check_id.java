package tms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class check_id extends JFrame implements ActionListener {
    JButton check, back;
    JTextField idNUMBER;
    JLabel email_fetch;
    JTextField idNUMBER1;
    String userName;
    check_id(String userName) {
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




        JLabel d = new JLabel("Check id : ");
        d.setFont(new Font("OSWALD", Font.PLAIN, 25));
        d.setBounds(20, 0, 300, 50);
        d.setForeground(Color.white);
        p2.add(d);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/s1.png"));
        Image i2 = i1.getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(250, -35, 400, 400);
        p1.add(image);


        //Add button
        check = new JButton("Find");
        check.setBounds(140, 200, 69, 19);
        check.setBackground(new Color(153, 0, 17));
        check.setForeground(Color.white);
        check.setFont(new Font("OSWALD", Font.BOLD, 11));
        check.addActionListener(this);
        p1.add(check);

        //Back Button
        back = new JButton("BACK");
        back.setBounds(30, 200, 72, 19);
        back.setBackground(new Color(153, 0, 17));
        back.setForeground(Color.white);
        back.setFont(new Font("SAN SERIF", Font.PLAIN, 10));
        back.addActionListener(this);
        p1.add(back);


//        JLabel d1 = new JLabel("Enter UserName : ");
//        d1.setFont(new Font("OSWALD", Font.PLAIN, 25));
//        d1.setBounds(0, 50, 300, 50);
//        d1.setForeground(Color.white);
//        p2.add(d1);

        idNUMBER1 = new JTextField("Enter UserName");
        idNUMBER1.setBounds(30, 80, 180, 20);
        idNUMBER1.setFont(new Font("OSWALD", Font.BOLD, 12));
        idNUMBER1.setForeground(new Color(153, 0, 17));
        p1.add(idNUMBER1);

        JLabel id_identify = new JLabel("Find      : ");
        id_identify.setBounds(30, 90, 100, 50);
        p1.add(id_identify);

        idNUMBER = new JTextField("Type you email");
        idNUMBER.setBounds(110, 105, 100, 20);
        idNUMBER.setFont(new Font("OSWALD", Font.BOLD, 12));
        idNUMBER.setForeground(new Color(153, 0, 17));
        p1.add(idNUMBER);

        p1.add(p2);
        p1.add(p3);

        email_fetch = new JLabel();
        email_fetch.setBounds(110, 120, 100, 20);

//        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            setVisible(false);
        } else if (e.getSource() == check) {
            String s = idNUMBER.getText();
            String name= idNUMBER1.getText();
            try {
                Conn c = new Conn();
                String query = "select * from customer where username = '" + name + "'";

                ResultSet rs = c.s.executeQuery(query);
                while (rs.next()) {
                    email_fetch.setText(rs.getString("email"));
                }

            } catch (Exception ae) {
                ae.getStackTrace();
            }

            String a1 = email_fetch.getText();
            System.out.println("fetched = " + a1);
            System.out.println("typed   = " + s);

            if (s.equals(a1)) {
                JOptionPane.showMessageDialog(null, "Your ID is registered.");
            } else {
                JOptionPane.showMessageDialog(null, "Your Email is not registered.");
            }
        }
    }

    public static void main(String[] args) {
        new check_id("");
    }


}
