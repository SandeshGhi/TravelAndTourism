package travels.and.tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ViewBookedHotel extends JFrame implements ActionListener{
    
    JButton b1;
    
    ViewBookedHotel(String username){
        setBounds(400, 240, 900, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travels/and/tourism/management/system/icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(550, 490, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l30 = new JLabel(i3);
        l30.setBounds(300, 10, 550, 490);
        add(l30);
        
        JLabel heading = new JLabel("VIEW BOOKED HOTEL");
        heading.setBounds(50, 0, 250, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);
        
        JLabel l1 = new JLabel("Username: ");
        l1.setBounds(30, 50, 100, 30);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l1);
        
        JLabel l11 = new JLabel();
        l11.setBounds(150, 50, 200, 25);
        l11.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l11);
        
        JLabel l2 = new JLabel("Hotel Name: ");
        l2.setBounds(30, 90, 100, 30);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l2);
        
        JLabel l12 = new JLabel();
        l12.setBounds(150, 90, 200, 25);
        l12.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l12);
        
        JLabel l3 = new JLabel("Total Persons: ");
        l3.setBounds(30, 130, 110, 30);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l3);
        
        JLabel l13 = new JLabel();
        l13.setBounds(150, 130, 200, 25);
        l13.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l13);
        
        JLabel l4 = new JLabel("Total Days: ");
        l4.setBounds(30, 170, 100, 30);
        l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l4);
        
        JLabel l14 = new JLabel();
        l14.setBounds(150, 170, 200, 25);
        l14.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l14);
        
        JLabel l5 = new JLabel("AC Included?");
        l5.setBounds(30, 210, 100, 30);
        l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l5);
        
        JLabel l15 = new JLabel();
        l15.setBounds(150, 210, 200, 25);
        l15.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l15);
        
        JLabel l6 = new JLabel("Food Included?");
        l6.setBounds(30, 250, 110, 30);
        l6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l6);
        
        JLabel l16 = new JLabel();
        l16.setBounds(150, 250, 200, 25);
        l16.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l16);
        
        JLabel l7 = new JLabel("ID: ");
        l7.setBounds(30, 290, 100, 30);
        l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l7);
        
        JLabel l17 = new JLabel();
        l17.setBounds(150, 290, 200, 25);
        l17.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l17);
        
        JLabel l8 = new JLabel("Number: ");
        l8.setBounds(30, 330, 100, 30);
        l8.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l8);
        
        JLabel l18 = new JLabel();
        l18.setBounds(150, 330, 200, 25);
        l18.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l18);
        
        JLabel l9 = new JLabel("Phone: ");
        l9.setBounds(30, 370, 100, 30);
        l9.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l9);
        
        JLabel l19 = new JLabel();
        l19.setBounds(150, 370, 200, 25);
        l19.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l19);
        
        JLabel l10 = new JLabel("Total Cost:");
        l10.setBounds(30, 410, 100, 30);
        l10.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l10);
        
        JLabel l20 = new JLabel();
        l20.setBounds(150, 410, 200, 25);
        l20.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l20);
        
        try{
            Conn c =new Conn();
            ResultSet rs = c.s.executeQuery("select * from mybookhotel where username ='"+username+"'");
            while(rs.next()){
                l11.setText(rs.getString(1));// 1 is col. no. for username
                l12.setText(rs.getString(2));
                l13.setText(rs.getString(3));
                l14.setText(rs.getString(4));
                l15.setText(rs.getString(5));
                l16.setText(rs.getString(6));
                l17.setText(rs.getString(7));
                l18.setText(rs.getString(8));
                l19.setText(rs.getString(9));
                l20.setText(rs.getString(10));
            }
        }catch(Exception e){
            
        }
        
        b1 = new JButton("Back");
        b1.setBounds(30, 450, 200, 30);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);
    }
    
    public void actionPerformed(ActionEvent ae){
            this.setVisible(false);
    }
    
    public static void main(String[] args){
        new ViewBookedHotel("").setVisible(true);
    }
}

