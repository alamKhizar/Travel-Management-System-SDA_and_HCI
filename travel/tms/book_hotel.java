
package tms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class book_hotel extends JFrame implements ActionListener {

    JLabel username_fetch, lID, country_fetch, price_fetch; //lbl
    JButton book, back,pricing,up,down; //btn;
    Choice packagE;
    int counter =0;
    JTextField no_of_ppl;
    JCheckBox check,checkAc, theatreCheck,panoromicViewsCheck,hotelTourCheck,mealsCheck;
    int acPrice, mealPrice, theatrePrice , hotelTourPrice, eagleViews ;

    String AC, mealsCHECKING,theatreCHECKING,viewsCHECKING,tourCHECKING;
    String userName;
    public book_hotel(String userName) {
        this.userName = userName;
        System.out.println("bh username = "+userName);
        setBounds(486,269,600,332);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 600, 352);
        p1.setLayout(null);
        p1.setBackground(new Color(252, 246, 245));
        add(p1);



        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(10, 0, 600, 40);
        p2.setBackground(new Color(153, 0, 17));
        p1.add(p2);

        JLabel d = new JLabel("BOOK A HOTEL: ");
        d.setFont(new Font("OSWALD", Font.PLAIN, 25));
        d.setBounds(20, 0, 300, 50);
        d.setForeground(Color.white);
        p2.add(d);


        JLabel username = new JLabel("Username        : ");
        username.setBounds(30, 40, 130, 50);
        username.setFont(new Font("OSWALD", Font.BOLD, 15));
        p1.add(username);

        JLabel feature = new JLabel("- HOTEL FEATURES -");
        feature.setBounds(300, 40, 150, 50);

        feature.setFont(new Font("OSWALD", Font.BOLD, 15));
        p1.add(feature);

        JLabel ac = new JLabel("AC                              : ");
        ac.setBounds(300, 70, 120, 50);
        p1.add(ac);
        ////check
        checkAc = new JCheckBox("+");
        checkAc.setBounds(420, 85, 100, 20);
        checkAc.setBackground(new Color(252, 246, 245));
        checkAc.addActionListener(this);
        p1.add(checkAc);

        JLabel meals = new JLabel("Free-Meals               : ");
        meals.setBounds(300, 100, 120, 50);
        p1.add(meals);

        ////check
        mealsCheck = new JCheckBox("+");
        mealsCheck.setBounds(420, 115, 100, 20);
        mealsCheck.setBackground(new Color(252, 246, 245));
        mealsCheck.addActionListener(this);
        p1.add(mealsCheck);

        JLabel theatre = new JLabel("Theatre                     : ");
        theatre.setBounds(300, 130, 120, 50);
        p1.add(theatre);

        ////check
        theatreCheck = new JCheckBox("+");
        theatreCheck.setBounds(420, 145, 100, 20);
        theatreCheck.setBackground(new Color(252, 246, 245));
        theatreCheck.addActionListener(this);
        p1.add(theatreCheck);



        JLabel panoromicViews = new JLabel("Eagle eye views       : ");
        panoromicViews.setBounds(300, 160, 120, 50);
        p1.add(panoromicViews);

        ////check
        panoromicViewsCheck = new JCheckBox("+");
        panoromicViewsCheck.setBounds(420, 175, 100, 20);
        panoromicViewsCheck.setBackground(new Color(252, 246, 245));
        panoromicViewsCheck.addActionListener(this);
        p1.add(panoromicViewsCheck);


        JLabel hotelTour = new JLabel("HOTEL TOUR           : ");
        hotelTour.setBounds(300, 190, 120, 50);
        p1.add(hotelTour);

        ////check
        hotelTourCheck = new JCheckBox("+");
        hotelTourCheck.setBounds(420, 205, 100, 20);
        hotelTourCheck.setBackground(new Color(252, 246, 245));
        hotelTourCheck.addActionListener(this);
        p1.add(hotelTourCheck);

        JLabel id_identify = new JLabel("No.of Stays      : ");
        id_identify.setBounds(30, 100, 70, 50);
        p1.add(id_identify);

        up = new JButton("+");
        up.setBounds(215, 115, 40, 20);
        up.setBackground(new Color(252, 246, 245));
        up.setForeground(Color.BLACK);
        up.setFont(new Font("OSWALD", Font.BOLD, 12));
        up.addActionListener(this);
        up.setBorder(null);
        p1.add(up);

        down = new JButton("-");
        down.setBounds(240, 115, 40, 20);
        down.setBackground(new Color(252, 246, 245));
        down.setForeground(Color.BLACK);
        down.setFont(new Font("OSWALD", Font.BOLD, 12));
        down.addActionListener(this);
        down.setBorder(null);
        p1.add(down);

        no_of_ppl = new JTextField("1");
        no_of_ppl.setBounds(150, 115, 65, 20);
        p1.add(no_of_ppl);


//        int acPrice = 25000, mealPrice = 5000, theatrePrice = 2000, hotelTourPrice = 10000, eagleViews = 9000;

        ///////////////////////////
        username_fetch = new JLabel(userName);
        username_fetch.setBounds(150, 50, 100, 30);
        username_fetch.setFont(new Font("OSWALD", Font.BOLD, 15));
        p1.add(username_fetch);


        JLabel id = new JLabel("Select Hotel        : ");
        id.setBounds(30, 75, 110, 50);
        p1.add(id);

        packagE = new Choice();
        packagE.add("Hotel A");
        packagE.add("Hotel B");
        packagE.add("Hotel C");
        packagE.add("Hotel D");
        packagE.add("Hotel E");
        packagE.setBounds(150, 90, 100, 20);
        p1.add(packagE);




        JLabel iD = new JLabel("ID                           : ");
        iD.setBounds(30, 125, 100, 50);
        p1.add(iD);

        lID = new JLabel();
        lID.setBounds(150, 140, 100, 20);
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


        price_fetch = new JLabel("PKR/- " + 0.00);
        price_fetch.setBounds(150, 190, 100, 20);
        p1.add(price_fetch);

        //Add button
        book = new JButton("BOOK");
        book.setBounds(150, 250, 100, 20);
        book.setBackground(new Color(153, 0, 17));
        book.setForeground(Color.white);
        book.setFont(new Font("OSWALD", Font.BOLD, 11));
        book.addActionListener(this);
        p1.add(book);

        //Back Button
        back = new JButton("BACK");
        back.setBounds(30, 250, 100, 20);
        back.setBackground(new Color(153, 0, 17));
        back.setForeground(Color.white);
        back.setFont(new Font("SAN SERIF", Font.PLAIN, 10));
        back.addActionListener(this);
        p1.add(back);

//        pricing = new JButton("CHECK FEATURE PRICING");
//        pricing.setBounds(300, 250, 180, 20);
//        pricing.setBackground(new Color(153, 0, 17));
//        pricing.setForeground(Color.white);
//        pricing.setFont(new Font("SAN SERIF", Font.PLAIN, 10));
//        pricing.addActionListener(this);
//        p1.add(pricing);



        try {
            Conn c = new Conn();
            String query = "select * from customer where username = '" + "khizar" + "'";

            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                username_fetch.setText(rs.getString("username"));
                lID.setText(rs.getString("id"));
                country_fetch.setText(rs.getString("country"));
            }

        } catch (Exception e) {
            e.getStackTrace();
        }

        //image
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(600, 352, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(265, 0, 600, 352);
//        p1.add(image);

        ////check
        check = new JCheckBox("view price");
        check.setBounds(29, 215, 100, 20);
        check.setBackground(new Color(252, 246, 245));
        check.addActionListener(this);
        p1.add(check);

        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {


        if (ae.getSource() == book) {

            try {
                Conn c = new Conn();
                c.s.executeUpdate("insert into books values('"+username_fetch.getText()+"', '"+packagE.getSelectedItem()+"', '"+no_of_ppl.getText()+"', '"+lID.getText()+"', '"+country_fetch.getText()+"', '"+price_fetch.getText()+"')");
                JOptionPane.showMessageDialog(null, "Booking Done :) ");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Booking Failed :( ");
                e.getStackTrace();
            }
        } else if (ae.getSource() == back) {
            setVisible(false);

        }


        //////////////////////////   packages ///////////////
//        int stayPricing = Integer.parseInt(no_of_ppl.getText());

        if(checkAc.isSelected()){
            acPrice = 25000;
            AC ="AC-CHECKED";

        }else{
            acPrice = 0;
            AC = "NO-CHECKED";
        }

        if(mealsCheck.isSelected()){
            mealPrice = 5000;

            mealsCHECKING ="MEALS-CHECKED";
        }else{
            mealPrice = 0;
            mealsCHECKING = "NO-CHECKED";
        }

        if(theatreCheck.isSelected()){
            theatrePrice = 2000;

            theatreCHECKING ="Theatre-CHECKED";
        }else{
            theatrePrice = 0;
            theatreCHECKING = "NO-CHECKED";
        }

        if(panoromicViewsCheck.isSelected()){
            eagleViews = 9000;

            viewsCHECKING ="Eagle Eye Views-CHECKED";
        }else{
            eagleViews = 0;
            viewsCHECKING = "NO-CHECKED";
        }

        if(hotelTourCheck.isSelected()){
            hotelTourPrice = 10000;

            tourCHECKING ="TOUR-CHECKED";
        }else{
            hotelTourPrice = 0;
            tourCHECKING = "NO-CHECKED";
        }


        if (check.isSelected()) {
            int pricE = 0;
            String pack = packagE.getSelectedItem();
            if (pack.equals("Hotel A")) {
                pricE =pricE + 10000 + acPrice+mealPrice+hotelTourPrice+eagleViews+theatrePrice;

            } else if (pack.equals("Hotel B")) {
                pricE =pricE + 20000+ acPrice+mealPrice+hotelTourPrice+eagleViews+theatrePrice;

            }else if (pack.equals("Hotel C")) {
                pricE =pricE + 30000+ acPrice+mealPrice+hotelTourPrice+eagleViews+theatrePrice;

            }else if (pack.equals("Hotel D")) {
                pricE =pricE + 40000+ acPrice+mealPrice+hotelTourPrice+eagleViews+theatrePrice;

            }else if (pack.equals("Hotel E")) {
                pricE =pricE + 30000+ acPrice+mealPrice+hotelTourPrice+eagleViews+theatrePrice;

            } else {
                pricE =pricE + 50000+ acPrice+mealPrice+hotelTourPrice+eagleViews+theatrePrice;
            }

            int members = Integer.parseInt(no_of_ppl.getText());
            pricE = pricE * members;

            price_fetch.setText("PKR/- " + pricE);
        } else {
            price_fetch.setText("PKR/- " + 0.00);
        }

        if(ae.getSource() == up){
            counter = counter+1;
            String a = Integer.toString(counter);
            no_of_ppl.setText(a);
        } else if (ae.getSource() == down) {

//            String b = no_of_ppl.getText();
//            int a = Integer.valueOf(b);
            if(counter>0) {
                counter = counter - 1;
                String a = Integer.toString(counter);
                no_of_ppl.setText(a);
            }else {
                JOptionPane.showMessageDialog(null, "Please select the range from greater than ZERO");
            }
        }
        /////////////////////////

    }

    public static void main(String[] args) {
        new book_hotel("");
    }
}
