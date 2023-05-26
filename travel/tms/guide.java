package tms;

import javax.swing.*;
import java.awt.*;

public class guide extends JFrame {
    guide(){
        setBounds(300,150,492,509);
        setLayout(null);

        JPanel p = new JPanel();
        p.setBounds(0,0,492,509);
        p.setBackground(Color.ORANGE);
        add(p);

        ImageIcon img4 = new ImageIcon(ClassLoader.getSystemResource("icons/guide.png"));
        Image img5 = img4.getImage().getScaledInstance(492, 509, Image.SCALE_DEFAULT);
        ImageIcon img6 = new ImageIcon(img5);
        JLabel image2 = new JLabel(img6);
        image2.setBounds(0, 0, 492, 509);
        p.add(image2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new guide();
    }
}
