package tms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class cumtomize extends JFrame implements ActionListener {
    JButton add,back,submit;
    JComboBox comboID;
    JLabel f;
    JTextArea t ;
    JRadioButton male,female;

    cumtomize() {
        setBounds(486,269,600,332);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBounds(0, 0,600,352);
        p1.setLayout(null);
        p1.setBackground(new Color(252, 246, 245));
        add(p1);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(10, 0, 600, 40);
        p2.setBackground(new Color(153,0,17));


        JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBounds(300, 80,5 , 176);
        p3.setBackground(new Color(153,0,17));

        JLabel d = new JLabel("REVIEW: ");
        d.setFont(new Font("OSWALD", Font.PLAIN,25));
        d.setBounds(20, 0, 300, 50);
        d.setForeground(Color.white);
        p2.add(d);


        add = new JButton("Customize");
        add.setBounds(140,200, 80, 19);
        add.setBackground(new Color(153,0,17));
        add.setForeground(Color.white);
        add.setFont(new Font("OSWALD", Font.BOLD,11));
        add.addActionListener(this);
        p1.add(add);


        //Back Button
        back = new JButton("BACK");
        back.setBounds(30,200, 72, 19);
        back.setBackground(new Color(153,0,17));
        back.setForeground(Color.white);
        back.setFont(new Font("SAN SERIF", Font.PLAIN,10));
        back.addActionListener(this);
        p1.add(back);

        JLabel id = new JLabel("FONT             : ");
        id.setBounds(30, 65, 100, 50);
        p1.add(id);

        f = new JLabel("Thoughts: ");
        f.setBounds(350, 65, 150, 50);
        f.setFont(new Font("AMETIC",Font.BOLD,20));
        p1.add(f);

        t = new JTextArea();
        t.setBounds(350, 120, 150,60 );
        t.setBackground(new Color(236, 159, 50));
        p1.add(t);

        comboID = new JComboBox(new String []{"OSWALD",  "SANSERIF", "ARIAL"});
        comboID.setBounds(110, 80, 100, 20);
        comboID.setBackground(new Color(252, 246, 245));
        comboID.setForeground(new Color(153,0,17));
        comboID.setFont(new Font("OSWALD",Font.BOLD,12));
        p1.add(comboID);

        submit = new JButton("submit");
        submit.setBounds(430, 200, 72, 19);
        submit.setBackground(new Color(255, 252, 252));
        submit.setForeground(new Color(153, 0, 17));
        submit.setFont(new Font("OSWALD", Font.BOLD, 10));
//        submit.setBorder(null);
//        logOutsetBorderPainted(true);
        submit.addActionListener(this);
        p1.add(submit);

        JLabel gender = new JLabel("Style       : ");
        gender.setBounds(30, 100, 100, 50);
        p1.add(gender);

        male = new JRadioButton("Bold");
        male.setBounds(110,115,50, 20);
        male.setBackground(new Color(252, 246, 245));
        male.setFont(new Font("OSWALD",Font.BOLD,11));
        p1.add(male);

        female = new JRadioButton("Italic");
        female.setBounds(155,115,70, 20);
        female.setBackground(new Color(252, 246, 245));
        female.setFont(new Font("OSWALD",Font.BOLD,11));
        p1.add(female);

        ButtonGroup b = new ButtonGroup();
        b.add(male);
        b.add(female);


        p1.add(p2);
        p1.add(p3);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add) {
            if (comboID.getSelectedItem() == "OSWALD" && male.isSelected()) {
               f.setFont(new Font("OSWALD", Font.BOLD,15));
                f.setForeground(Color.black);
                t.setFont(new Font("OSWALD", Font.BOLD,13));

            } else if (comboID.getSelectedItem() == "OSWALD" && female.isSelected()) {
                f.setForeground(Color.red);
                f.setFont(new Font("OSWALD", Font.ITALIC,15));
                t.setFont(new Font("OSWALD", Font.ITALIC,13));
            }

            if (comboID.getSelectedItem() == "SANSERIF" && male.isSelected()) {

                f.setForeground(Color.black);
                f.setFont(new Font("SANSERIF", Font.BOLD,15));
                t.setFont(new Font("SANSERIF", Font.BOLD,13));

            } else if (comboID.getSelectedItem() == "SANSERIF" && female.isSelected()) {
                f.setForeground(Color.red);
                f.setFont(new Font("SANSERIF", Font.ITALIC,15));
                t.setFont(new Font("SANSERIF", Font.ITALIC,13));
            }


            if (comboID.getSelectedItem() == "ARIAL" && male.isSelected()) {
                f.setForeground(Color.black);
                f.setFont(new Font("ARIAL", Font.BOLD,15));
                t.setFont(new Font("ARIAL", Font.BOLD,11));

            } else if (comboID.getSelectedItem() == "ARIAL" && female.isSelected()) {
                f.setForeground(Color.red);
                f.setFont(new Font("ARIAL", Font.ITALIC,15));
                t.setFont(new Font("ARIAL", Font.ITALIC,11));
            }

        }

        if(e.getSource() == submit){
            String str = "";
            str = t.getText();

            File f = new File("Review.txt");
            try {
                FileWriter fw = new FileWriter(f);

                fw.write(str);
                fw.close();
                JOptionPane.showMessageDialog(null, "Response added Successfully");

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(e.getSource() == back ){
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new cumtomize();
    }
}

