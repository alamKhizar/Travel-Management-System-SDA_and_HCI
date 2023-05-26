package tms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class linkForPay extends JFrame implements ActionListener {
    JButton back;
    linkForPay(){
        setBounds(300, 150, 800, 500);
//        setLayout(null);

        JEditorPane p = new JEditorPane();
        p.setEditable(false);

        try{
            p.setPage("https://google.com/");
        }catch(Exception e) {
          p.setContentType("text/html");
          p.setText("<html>Servers are down please comeback later</html>");
        }
        JScrollPane s = new JScrollPane(p);
        getContentPane().add(s);

         back = new JButton("BACK");
        back.setBounds(30, 350, 100, 30);
        back.setBackground(new Color(153, 0, 17));
        back.setForeground(Color.white);
        back.setFont(new Font("SAN SERIF", Font.PLAIN, 10));
        back.addActionListener(this);
        p.add(back);

        setVisible(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
       if (ae.getSource() == back) {
            setVisible(false);
        }


    }
    public static void main(String[] args) {
            new linkForPay();
    }
}
