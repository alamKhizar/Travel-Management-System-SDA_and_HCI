package tms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//shorturl.at/ipr37
public class feedback extends JFrame implements ActionListener {
    JButton back;
    JButton link_btn;
    JButton exit;
    feedback() {
        setBounds(486,269,600,332);
//        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 600, 352);
        p1.setLayout(null);
        p1.setBackground(new Color(252, 246, 245));
        add(p1);

        JLabel l = new JLabel("Link for Feedback : ");
        l.setBounds(30, 40, 190, 50);
        l.setFont(new Font("OSWALD", Font.BOLD, 20));
        l.setForeground(new Color(2, 2, 2));
        p1.add(l);


//

        JTextField link = new JTextField("shorturl.at/ipr37  ");
        link.setBounds(190, 55, 140, 25);
        link.setForeground(new Color(153, 0, 17));
        link.setFont(new Font("OSWALD", Font.BOLD, 15));
        p1.add(link);


        link_btn = new JButton("Go");
        link_btn.setBounds(190, 100, 145, 30);
        link_btn.setBackground(new Color(153, 0, 17));
        link_btn.setFont(new Font("OSWALD", Font.PLAIN, 15));
        link_btn.setForeground(new Color(252, 246, 245));
        link_btn.addActionListener(this);
        p1.add(link_btn);

         exit = new JButton("Exit");
        exit.setBounds(190, 150, 145, 30);
        exit.setBackground(new Color(153, 0, 17));
        exit.setFont(new Font("OSWALD", Font.PLAIN, 15));
        exit.setForeground(new Color(252, 246, 245));
        exit.addActionListener(this);
        p1.add(exit);

        //image panel //t2 -> grass
        ImageIcon img4 = new ImageIcon(ClassLoader.getSystemResource("icons/hi.jpg"));
        Image img5 = img4.getImage().getScaledInstance(600, 352, Image.SCALE_DEFAULT);
        ImageIcon img6 = new ImageIcon(img5);
        JLabel image2 = new JLabel(img6);
        image2.setBounds(0, 0, 600, 352);
        p1.add(image2);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        JEditorPane p;
        if (ae.getSource() == link_btn) {
//            try {
//                p = new JEditorPane();
//                p.setEditable(false);
//
//                p.setPage("https://google.com ");
//            } catch (Exception e) {
////                p.setContentType("text/html");
////                p.setText("<html>Servers are down please comeback later</html>");
//            }
//            JScrollPane s = new JScrollPane(p);
//            getContentPane().add(s);
            new linkForPay();

        } else if (ae.getSource() == exit) {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new feedback();
    }


}
