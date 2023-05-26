package tms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class verifyAdmin extends JFrame implements ActionListener {
    JButton verify;
    JTextField textField;

    verifyAdmin() {
        setSize(300, 300);
        setLocation(350, 200);
        setLayout(null);

        //panel
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(252, 246, 245));
        p1.setBounds(0, 0, 900, 400);

        p1.setLayout(null);
        add(p1);

        JLabel l = new JLabel("Verification:");
        l.setBounds(45, 90, 1000, 40);
        l.setBackground(new Color(252, 246, 245));
        l.setFont(new Font("OSWALD", Font.BOLD, 35));
        l.setForeground(new Color(0, 0, 0));
        p1.add(l);


        //adding
        JLabel userName = new JLabel("Pin :");
        userName.setBounds(45, 120, 500, 100);
        userName.setForeground(new Color(0, 98, 105));
        userName.setFont(new Font("OSWALD", Font.BOLD, 13));
        p1.add(userName);

        textField = new JTextField("Enter...");
        textField.setBounds(80, 160, 145, 22);
        textField.setFont(new Font("SAN SERIF", Font.BOLD, 12));
        p1.add(textField);


        verify = new JButton("Verify");
        verify.setBounds(45, 250, 180, 29);
        verify.setBackground(new Color(234, 71, 18));
        verify.setForeground(new Color(255, 252, 252));
        verify.setFont(new Font("SAN SERIF", Font.BOLD, 21));
        verify.addActionListener(this);
        p1.add(verify);



       // setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == verify) {
            if(textField.getText().equalsIgnoreCase("0981")){
            new adminLoginScreen();
            setVisible(false);
            //System.exit(0);
            } else{
                JOptionPane.showMessageDialog(null, "Wrong input given!!");
            }
        }
    }
    public static void main(String[] args) {
        new verifyAdmin();
    }
}
