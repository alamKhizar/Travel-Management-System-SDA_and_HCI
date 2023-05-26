
package tms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class view_hotel  extends JFrame implements Runnable{
    Thread t1;
    JLabel l1,l2,l3,l4,l5,caption;
    JLabel[] label = new JLabel[]{l1,l2,l3,l4,l5};
    
    
    public void run(){
        String[] text = new String[]{"Hotel A","Hotel B","Hotel C","Hotel D","Hotel E"};
        
        
            try {
            
                for (int i = 0; i < 5; i++) {
                    label[i].setVisible(true);
                    caption.setText(text[i]);
                    Thread.sleep(1700);
                     label[i].setVisible(false);
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
            setVisible(false);
        }
    
    
    public view_hotel(){
         setBounds(300,150, 800, 500);
//         setLayout(null);
        

JPanel p = new JPanel();
p.setBounds(0,10,200,60);
p.setBackground(new Color(153,0,17));
add(p);

caption = new JLabel();
caption.setBounds(0,0,200,90);
caption.setFont(new Font("OSWALD",Font.BOLD,40));
caption.setForeground(Color.white);
caption.setBackground(Color.red);
p.add(caption);


         ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null;
         ImageIcon[] image = new ImageIcon[]{i1,i2,i3,i4,i5};
        
         Image j1=null,j2=null,j3=null,j4=null,j5=null;
         Image[] image1 = new Image[]{j1,j2,j3,j4,j5};
         
         ImageIcon k1=null,k2=null,k3=null,k4=null,k5=null;
         ImageIcon[] image2 = new ImageIcon[]{k1,k2,k3,k4,k5};
         
         for (int i = 0; i < 5; i++) {
             image[i] = new ImageIcon(ClassLoader.getSystemResource("icons/a"+(i+1)+".jpg"));
            image1[i] = image[i].getImage().getScaledInstance(800,500, Image.SCALE_DEFAULT);
            image2[i] = new ImageIcon(image1[i]);
            label[i] = new JLabel(image2[i]);
            label[i].setBounds(0,0,800,500);
            add(label[i]);

         }
        
         t1 = new Thread(this);
         t1.start();

        setUndecorated(true);
        setVisible(true);
    
    
    }
    public static void main(String[] args) {
        new view_hotel();
    }
}
