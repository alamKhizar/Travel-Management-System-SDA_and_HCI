package tms;

import javax.swing.*;
import java.awt.*;

public class sample extends JFrame {


    public sample(){
        setBounds(0,0,400,200);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBounds(0, 0,400,200);
        p1.setLayout(null);
        add(p1);

        JButton jb = new JButton("HI");
        jb.setBounds(0,0,100, 100);
        jb.setFont(new Font("OSWALD",Font.BOLD,11));
        p1.add(jb);

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/eye.png"));
        Image img2 = img1.getImage().getScaledInstance(17, 17, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel img = new JLabel(img3);
        img.setBounds(235,260,17,17);
        jb.add(img);

//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        jb.setIcon(new ImageIcon("icons/paper-plane.png"));
//        p1.add(jb);

        validate();

        setVisible(true);
    }
    public static void main(String[] args) {
        new sample();
    }
}
