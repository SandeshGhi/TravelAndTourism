package travels.and.tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ViewCustomer extends JFrame implements ActionListener{

    JButton b2;
    
    ViewCustomer(String username){
        setBounds(375, 200, 850, 500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l11 = new JLabel("CUSTOMER DETAILS");
        l11.setBounds(45, 0, 400, 25);
        l11.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l11);
        
        // Username Label
        JLabel l1 = new JLabel("Username:");
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        l1.setBounds(30, 50, 150, 25);
        add(l1);
        
        // Username Label1
        JLabel l12 = new JLabel();
        l12.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l12.setBounds(220, 50, 150, 25);
        add(l12);
        
        // ID Label
        JLabel l2 = new JLabel("Id:");
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setBounds(30, 110, 150, 25);
        add(l2);
        
        // ID Label1
        JLabel l13 = new JLabel();
        l13.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l13.setBounds(220, 110, 150, 25);
        add(l13);        
        
        // Number Label
        JLabel l3 = new JLabel("Number:");
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setBounds(30, 170, 150, 25);
        add(l3);
        
        // Number Label1
        JLabel l14 = new JLabel();
        l14.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l14.setBounds(220, 170, 150, 25);
        add(l14);
        
        // Name Label
        JLabel l4 = new JLabel("Full Name:");
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setBounds(30, 230, 150, 25);
        add(l4);
        
        // Name Label1
        JLabel l15 = new JLabel();
        l15.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l15.setBounds(220, 230, 150, 25);
        add(l15);
        
        // Gender Label
        JLabel l5 = new JLabel("Gender:");
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setBounds(30, 290, 150, 25);
        add(l5);
        
        // Gender Label1
        JLabel l16 = new JLabel();
        l16.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l16.setBounds(220, 290, 150, 25);
        add(l16);
        
        // Country Label
        JLabel l6 = new JLabel("Country:");
        l6.setFont(new Font("Tahoma", Font.BOLD, 14));
        l6.setBounds(450, 50, 100, 25);
        add(l6);
        
        // Country Label1
        JLabel l17 = new JLabel();
        l17.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l17.setBounds(600, 50, 150, 25);
        add(l17);
        
        // Address Label
        JLabel l7 = new JLabel("Address:");
        l7.setFont(new Font("Tahoma", Font.BOLD, 14));
        l7.setBounds(450, 110, 100, 25);
        add(l7);
        
        // Address Label1
        JLabel l18 = new JLabel();
        l18.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l18.setBounds(600, 110, 150, 25);
        add(l18);
        
        // Ph.No. Label
        JLabel l8 = new JLabel("ContactNo.:");
        l8.setFont(new Font("Tahoma", Font.BOLD, 14));
        l8.setBounds(450, 170, 100, 25);
        add(l8);
        
        // ContactNo. Label1
        JLabel l19 = new JLabel();
        l19.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l19.setBounds(600, 170, 150, 25);
        add(l19);
        
        // Email Label
        JLabel l9 = new JLabel("Email:");
        l9.setFont(new Font("Tahoma", Font.BOLD, 14));
        l9.setBounds(450, 230, 100, 25);
        add(l9);
        
        // Email Label1
        JLabel l20 = new JLabel("shyamghimire2025@gmail.com");
        l20.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l20.setBounds(600, 230, 300, 25);
        add(l20);
        
        // Back Button
        b2 = new JButton("Back");
        b2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.setBackground(Color.RED);
        b2.setForeground(Color.WHITE);
        b2.setBounds(365, 350, 125, 35);
        b2.addActionListener(this);
        add(b2);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from mycustomer where username = '"+username+"'");
            while(rs.next()){
                l12.setText(rs.getString("username"));
                l13.setText(rs.getString("id"));
                l14.setText(rs.getString("number"));
                l15.setText(rs.getString("name"));
                l16.setText(rs.getString("gender"));
                l17.setText(rs.getString("country"));
                l18.setText(rs.getString("address"));
                l19.setText(rs.getString("phone"));
                l20.setText(rs.getString("email"));
            }
        }catch(Exception e){
        
        }
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b2){
            this.setVisible(false);
        }
    }
           
    public static void main(String[] args){
        new ViewCustomer("").setVisible(true);
    }
}
