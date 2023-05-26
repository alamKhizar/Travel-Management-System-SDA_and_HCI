//5

package tms;

import javax.swing.*;
import java.awt.*;

public class confirmation extends JFrame implements Runnable {

    Thread t;
    JProgressBar progressBar;

    //for running progress bar
    public void run() {
        try {
            for (int i = 1; i <= 101; i++) {
                int max = progressBar.getMaximum();
                int value = progressBar.getValue();

                //check
                if (value < max) {
                    progressBar.setValue(progressBar.getValue() + 1);

                } else {
                    setVisible(false);
                    JOptionPane.showMessageDialog(null, "Person Updated Successfully");
//                    new dashboard();
                    //
                    //new signUP();
                    //object
                }
                Thread.sleep(100);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public confirmation() {

        t = new Thread(this);

        setSize(900, 360);
        setLocation(350, 200);
        setLayout(null);


        //panel

//         ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("icons/passport.png"));
        //Image i2 = image.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        //ImageIcon i3 = new ImageIcon(i2);
//         JLabel imgLABEL = new JLabel(image);

        //  imgLABEL.setBounds(50, 50, 500, 500);


//         panel1.
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/t.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(10, -50, 350, 400);

        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, 900, 300);
        panel1.setBackground(new Color(153, 0, 17));
        panel1.setLayout(null);
        add(panel1);


//new Color(252, 246, 245)


//Have patience, this will take some time..
        JPanel p4 = new JPanel();
        p4.setBounds(340, 0, 560, 300);
        p4.setBackground(new Color(252, 246, 245));
        p4.setLayout(null);
        panel1.add(p4);

        JPanel p5 = new JPanel();
        p5.setBounds(525, 0, 20, 300);
        p5.setBackground(new Color(153, 0, 17));
        p5.setLayout(null);
        p4.add(p5);


        JLabel l1 = new JLabel("HAVE PATIENCE,");
        JLabel l2 = new JLabel("Your data is updating :)");


        l1.setBounds(15, 135, 1000, 100);
        l2.setBounds(15, 180, 1000, 100);

        l1.setFont(new Font("OSWALD", Font.BOLD, 50));
        l1.setForeground(new Color(153, 0, 17));
        p4.add(l1);

        l2.setFont(new Font("OSWALD", Font.BOLD, 30));
        l2.setForeground(new Color(153, 0, 17));
        p4.add(l2);

        JPanel panel2 = new JPanel();
        panel2.setBounds(0, 300, 900, 100);
        panel2.setBackground(new Color(252, 246, 245));
        panel2.setLayout(null);
        add(panel2);


        //progress bar//////////////////////////

        progressBar = new JProgressBar();
        progressBar.setBounds(90, 17, 695, 20);
        progressBar.setBackground(new Color(252, 246, 245));
        progressBar.setForeground(new Color(153, 0, 17));
        // progressBAR.setForeground(new Color(252, 246, 245));
        progressBar.setFont(new Font("OSWALD", Font.BOLD, 15));
        progressBar.setStringPainted(true);
        panel2.add(progressBar);


        panel1.add(image);
        //add(image);


        setUndecorated(true);
        t.start();

        setVisible(true);

    }


    public static void main(String[] args) {
        new confirmation();
    }
}
