
package tms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class check_packages  extends JFrame {

    public check_packages() {
        setBounds(486,269,600,332);
       // setLayout(null);
        
       String[] plan1={"BASIC PLAN","5-DAYS and 5-NIGHTS","2-DAYS FREE MEAL","FREE MAP GUIDE","1-DAYS FREE ASSISTANCE","1-DAY FREE CHECK-INS","TOTAL PRICE : 14,000/- PKR","icons/package2.jpg"};
       String[] plan2={"PREMIUM PLAN","10-DAYS and 10-NIGHTS","3-DAYS FREE MEAL","FREE LANGUAGE GUIDE","3-DAYS FREE ASSISTANCE","3-DAY FREE CHECK-INS","TOTAL PRICE : 25,000/- PKR","icons/package3.jpg"};
       String[] plan3={"PREMIUM PRO PLAN","20-DAYS and 20-NIGHTS","5-DAYS FREE MEAL","FREE MULTI-GUIDE","4-DAYS FREE ASSISTANCE","5-DAY FREE CHECK-INS","TOTAL PRICE : 50,000/- PKR","icons/package1.jpg"};
       
       
        JTabbedPane tab = new JTabbedPane();
        JPanel p1 = create(plan1);
        tab.addTab("Basic ", null, p1);
        
        JPanel p2 = create(plan2);
        tab.addTab("Premium ", null, p2);
        
        JPanel p3 = create(plan3);
        tab.addTab("Pre-Pro ", null, p3);
        
        
        add(tab);

        setUndecorated(true);
        setVisible(true);

    }
    
    public JPanel create(String[] plan){
        JPanel p1 = new JPanel();
        p1.setBounds(0, 0,600,352);
        p1.setLayout(null);
        p1.setBackground(new Color(252, 246, 245));
        add(p1);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0, 0, 600, 30);
        p2.setBackground(new Color(153,0,17));
        p1.add(p2);
        
        JLabel l1 = new JLabel(plan[0]);
        l1.setBounds(220,-8,250,50);
        l1.setForeground(new Color(252, 246, 245));
        l1.setFont(new Font("OSWALD",Font.BOLD,20));
        p2.add(l1);
        
        //feature
         JLabel l0 = new JLabel("FEATURES:");
        l0.setBounds(10,30,250,50);
        l0.setForeground(new Color(153,0,17));
        l0.setFont(new Font("OSWALD",Font.BOLD,17));
        p1.add(l0);
        
        JLabel l2 = new JLabel(plan[1]);
        l2.setBounds(10,60,250,50);
//        l2.setForeground(new Color(252, 246, 245));
        l2.setFont(new Font("OSWALD",Font.BOLD,14));
        p1.add(l2);
        
        JLabel l3 = new JLabel(plan[2]);
        l3.setBounds(10,90,250,50);
//        l2.setForeground(new Color(252, 246, 245));
        l3.setFont(new Font("OSWALD",Font.BOLD,14));
        p1.add(l3);
       
        JLabel l4 = new JLabel(plan[3]);
        l4.setBounds(10,120,250,50);
//        l2.setForeground(new Color(252, 246, 245));
        l4.setFont(new Font("OSWALD",Font.BOLD,14));
        p1.add(l4);
        
        JLabel l5 = new JLabel(plan[4]);
        l5.setBounds(10,150,250,50);
//        l2.setForeground(new Color(252, 246, 245));
        l5.setFont(new Font("OSWALD",Font.BOLD,14));
        p1.add(l5);
        
        
        JLabel l6 = new JLabel(plan[5]);
        l6.setBounds(10,180,250,50);
//        l2.setForeground(new Color(252, 246, 245));
        l6.setFont(new Font("OSWALD",Font.BOLD,14));
        p1.add(l6);
        
        JLabel l7 = new JLabel(plan[6]);
        l7.setBounds(10,235,250,50);
        l7.setForeground(new Color(153,0,17));
        l7.setFont(new Font("OSWALD",Font.BOLD,17));
        p1.add(l7);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(plan[7]));
        Image i2 = i1.getImage().getScaledInstance(600, 352, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(270,0,600,352);
        p1.add(img);
        
        return p1;
    }
    
    public static void main(String[] args) {
        new check_packages();
    }
}
