package tms;

import javax.swing.*;
import java.awt.*;

public class about_info extends JFrame {
    about_info(){
        setBounds(300,150,994,296);
        setLayout(null);

        JPanel p = new JPanel();
        p.setBounds(0,0,994,296);
        p.setBackground(Color.ORANGE);
        add(p);

        ImageIcon img4 = new ImageIcon(ClassLoader.getSystemResource("icons/details.png"));
        Image img5 = img4.getImage().getScaledInstance(994, 296, Image.SCALE_DEFAULT);
        ImageIcon img6 = new ImageIcon(img5);
        JLabel image2 = new JLabel(img6);
        image2.setBounds(0, 0, 994, 296);
        p.add(image2);

        setVisible(true);
    }

    public static void main(String[] args) {
            new about_info();
    }
}
