//4
package tms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class create_account_confirmation extends JFrame implements ActionListener{

    
    JButton cancel_btn,create_btn ;
    
     create_account_confirmation() {
                setSize(500,200);
                setLocation(350,200);
                setLayout(null);


                JPanel p1 = new JPanel ();
                p1.setLayout(null);
                p1.setBounds(0,0, 500, 300);
                p1.setBackground(new Color(153,0,17));
                add(p1);
                
                
                JLabel text =new JLabel("ARE YOU SURE TO CREATE THE ACCOUNT ? ");
                text.setForeground(new Color(252, 246, 245));
                text.setBounds(35, 0, 400, 100);
                text.setFont(new Font("OSWALD", Font.BOLD,20));
                p1.add(text);
                
                
                //Adding buttons
                 create_btn = new JButton("CREATE");
                create_btn.setForeground(new Color(153,0,17) );
                create_btn.setBackground(new Color(252, 246, 245));
                create_btn.setFont(new Font("OSWALD", Font.BOLD,15));
                create_btn.setBounds(35, 100, 90, 30);
                create_btn.addActionListener(this);
                p1.add(create_btn);
                
                 cancel_btn = new JButton("CANCEL");
                cancel_btn.setForeground(new Color(153,0,17) );
                cancel_btn.setBackground(new Color(252, 246, 245));
                cancel_btn.setFont(new Font("OSWALD", Font.BOLD,15));
                cancel_btn.setBounds(290, 100, 90, 30);
                cancel_btn.addActionListener(this);
                p1.add(cancel_btn);
          //new Color(252, 246, 245)
    //new Color(153,0,17) 
         setVisible(true);
         setUndecorated(false);
    }
    
     public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == create_btn){
                JOptionPane.showMessageDialog(null, "Account Created Successfully");
                //setVisible(false);
                new login();
                setVisible(false);
            }else if(ae.getSource() == cancel_btn){
                    new signUP();
                    setVisible(false);
            }
     }
    
    
    public static void main(String[] args) {
     
        new create_account_confirmation();
    }
   
}
