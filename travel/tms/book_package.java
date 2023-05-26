
package tms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class book_package extends JFrame implements ActionListener{
     JLabel username_fetch,country_fetch,lID,price_fetch;
    JCheckBox check ;
    Choice packagE;
    JTextField no_of_ppl;
    
     JButton book,back;
     String userName;
    public book_package(String userName){
        this.userName = userName;
        System.out.println("Book package = "+ userName);
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
        p1.add(p2);
        
         JLabel d = new JLabel("BOOK A PACKAGE: ");
        d.setFont(new Font("OSWALD", Font.PLAIN,25));
        d.setBounds(20, 0, 300, 50);
        d.setForeground(Color.white);
        p2.add(d);
        
           JLabel username = new JLabel("Username            : ");
        username.setBounds(30, 40, 110, 50);
        p1.add(username);
        
        username_fetch = new JLabel(userName);
        username_fetch.setBounds(150, 50, 100, 30);
        p1.add(username_fetch);
        
        
        JLabel id = new JLabel("Select Package : ");
        id.setBounds(30, 75, 110, 50);
        p1.add(id);
        
        packagE = new Choice();
        packagE.add("Basic");
        packagE.add("Premium");
        packagE.add("Premium Pro");
        packagE.setBounds(150, 90, 100, 20);
        p1.add(packagE);
        
        
         JLabel id_identify = new JLabel("No.of Peoples     : ");
        id_identify.setBounds(30, 100, 100, 50);
        p1.add(id_identify);
        
        no_of_ppl = new JTextField("1");
        no_of_ppl.setBounds(150, 115, 100, 20);
        p1.add(no_of_ppl);
        
        
        JLabel iD = new JLabel("ID                           : ");
        iD.setBounds(30, 125, 100, 50);
        p1.add(iD);
        
         lID = new JLabel();
        lID.setBounds(150,140,100, 20);
        p1.add(lID);
        
        
        JLabel country = new JLabel("Country                : ");
        country.setBounds(30, 150, 100, 50);
        p1.add(country);
        
         country_fetch = new JLabel();
        country_fetch.setBounds(150, 165, 100, 20);
        p1.add(country_fetch);
        
           JLabel price = new JLabel("Price                    : ");
        price.setBounds(30, 175, 100, 50);
        p1.add(price);
        
        price_fetch = new JLabel("PKR/- "+0.00);
        price_fetch.setBounds(150, 190, 100, 20);
        p1.add(price_fetch);
        
           //Add button
     book = new JButton("BOOK");
     book.setBounds(150,250, 100, 20);
     book.setBackground(new Color(153,0,17));
     book.setForeground(Color.white);
     book.setFont(new Font("OSWALD", Font.BOLD,11));
     book.addActionListener(this);
     p1.add(book);
     
     //Back Button
      back = new JButton("BACK");
     back.setBounds(30,250,100, 20);
     back.setBackground(new Color(153,0,17));
     back.setForeground(Color.white);
     back.setFont(new Font("SAN SERIF", Font.PLAIN,10));
     back.addActionListener(this);
     p1.add(back);
        
      
     
     try {
            Conn c = new Conn();
            String query = "select * from customer where username = '"+"khizar"+"'";
            
            ResultSet rs =  c.s.executeQuery(query);
            while(rs.next()){
                    username_fetch.setText(rs.getString("username"));
                    lID.setText(rs.getString("id"));
                    country_fetch.setText(rs.getString("country"));                    
            }
            
        } catch (Exception e) {
                e.getStackTrace();
        }
    
     //image
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
    Image i2 = i1.getImage().getScaledInstance(600, 352, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(265, 0, 600, 352);
    p1.add(image);
     
     ////check
      check = new JCheckBox("update price");
     check.setBounds(29,215,100,20);
     check.setBackground(new Color(252, 246, 245));
     check.addActionListener(this);
     p1.add(check);

        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        
       
        if(ae.getSource()==book){
            
            try {
                Conn c = new Conn();
                c.s.executeUpdate("insert into book values('"+username_fetch.getText()+"', '"+packagE.getSelectedItem()+"', '"+no_of_ppl.getText()+"', '"+lID.getText()+"', '"+country_fetch.getText()+"', '"+price_fetch.getText()+"')");
                JOptionPane.showMessageDialog(null, "Booking Done :) ");
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Booking Failed :( ");
                e.getStackTrace();
            }
        } else if(ae.getSource()==back){
            setVisible(false);
            
        }
        
        
        //////////////////////////   packages ///////////////
         if (check.isSelected()){
             int pricE=0;
                String pack = packagE.getSelectedItem();
                 if(pack.equals("Basic")){
                    pricE+=14000;
         
                 }else if (pack.equals("Premium")){
                     pricE+=25000;
       
                 }else{
                        
                  pricE+=50000;
                }
      
        int members = Integer.parseInt(no_of_ppl.getText());
         pricE = pricE*members;
     
         price_fetch.setText("PKR/- "+pricE);
    }else{
          price_fetch.setText("PKR/- "+0.00);
         }
         /////////////////////////
    
    }
    
    public static void main(String[] args) {
        new book_package("");
    }
}
