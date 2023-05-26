package tms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class payment extends JFrame implements ActionListener {
    JButton pay, back;

    payment() {
        setBounds(486,269,600,332);
        setLayout(null);

        pay = new JButton("PAY");
        pay.setBounds(400, 250, 100, 30);
        pay.setBackground(new Color(153, 0, 17));
        pay.setForeground(Color.white);
        pay.setFont(new Font("OSWALD", Font.BOLD, 11));
        pay.addActionListener(this);
        add(pay);

        //Back Button
        back = new JButton("BACK");
        back.setBounds(30, 250, 100, 30);
        back.setBackground(new Color(153, 0, 17));
        back.setForeground(Color.white);
        back.setFont(new Font("SAN SERIF", Font.PLAIN, 10));
        back.addActionListener(this);
        add(back);

        //image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/pay.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 352, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 600, 352);
        add(image);
        //Add button

        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == pay) {
            new confirmation_payment();
        } else if (ae.getSource() == back) {
            setVisible(false);
        }


    }

    public static void main(String[] args) {
        new payment();
    }
}
