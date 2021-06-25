package travels.and.tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class DeleteCustomer extends JFrame implements ActionListener{
    
    JLabel l11, l12, l13, l14, l15, l16, l17, l18, l19;
    JButton b1, b2;
    String username;
    
    DeleteCustomer(String user){
        
        this.username = user;
        
        setBounds(440, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading = new JLabel("DELETE YOUR DETAILS");
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        heading.setBounds(50, 10, 400, 30);
        add(heading);
        
        JLabel l1 = new JLabel("Username: ");
        l1.setFont(new Font("Tahoma", Font.BOLD, 16));
        l1.setBounds(40, 60, 150, 30);
        add(l1);
        
        l11 = new JLabel();
        l11.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l11.setBounds(200, 60, 200, 30);
        add(l11);
        
        JLabel l2 = new JLabel("Name: ");
        l2.setFont(new Font("Tahoma", Font.BOLD, 16));
        l2.setBounds(40, 100, 150, 30);
        add(l2);
        
        l12 = new JLabel();
        l12.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l12.setBounds(200, 100, 200, 30);
        add(l12);
        
        JLabel l3 = new JLabel("ID: ");
        l3.setFont(new Font("Tahoma", Font.BOLD, 16));
        l3.setBounds(40, 140, 150, 30);
        add(l3);
        
        l13 = new JLabel();
        l13.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l13.setBounds(200, 140, 200, 30);
        add(l13);
        
        JLabel l4 = new JLabel("Number: ");
        l4.setFont(new Font("Tahoma", Font.BOLD, 16));
        l4.setBounds(40, 180, 150, 30);
        add(l4);
        
        l14 = new JLabel();
        l14.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l14.setBounds(200, 180, 200, 30);
        add(l14);
        
        JLabel l5 = new JLabel("Gender: ");
        l5.setFont(new Font("Tahoma", Font.BOLD, 16));
        l5.setBounds(40, 220, 150, 30);
        add(l5);
        
        l15 = new JLabel();
        l15.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l15.setBounds(200, 220, 200, 30);
        add(l15);
        
        JLabel l6 = new JLabel("Country");
        l6.setFont(new Font("Tahoma", Font.BOLD, 16));
        l6.setBounds(40, 260, 150, 30);
        add(l6);
        
        l16 = new JLabel();
        l16.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l16.setBounds(200, 260, 200, 30);
        add(l16);
        
        JLabel l7 = new JLabel("Address");
        l7.setFont(new Font("Tahoma", Font.BOLD, 16));
        l7.setBounds(40, 300, 150, 30);
        add(l7);
        
        l17 = new JLabel();
        l17.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l17.setBounds(200, 300, 200, 30);
        add(l17);
        
        JLabel l8 = new JLabel("Phone");
        l8.setFont(new Font("Tahoma", Font.BOLD, 16));
        l8.setBounds(40, 340, 150, 30);
        add(l8);
        
        l18 = new JLabel();
        l18.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l18.setBounds(200, 340, 200, 30);
        add(l18);
        
        JLabel l9 = new JLabel("Email: ");
        l9.setFont(new Font("Tahoma", Font.BOLD, 16));
        l9.setBounds(40, 380, 150, 30);
        add(l9);
        
        l19 = new JLabel();
        l19.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l19.setBounds(200, 380, 300, 30);
        add(l19);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from mycustomer where username = '"+username+"'");
            while(rs.next()){
                l11.setText(rs.getString("username"));
                l12.setText(rs.getString("name"));
                l13.setText(rs.getString("id"));
                l14.setText(rs.getString("number"));
                l15.setText(rs.getString("gender"));
                l16.setText(rs.getString("country"));
                l17.setText(rs.getString("address"));
                l18.setText(rs.getString("phone"));
                l19.setText(rs.getString("email"));
            }
        }catch(Exception e){
            
        }
        
        // Buttons
        b1 = new JButton("Delete");
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.red);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b1.setBounds(125, 450, 100, 30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Cancel");
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b2.setBounds(375, 450, 100, 30);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travels/and/tourism/management/system/icons/delete.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l20 = new JLabel(i3);
        l20.setBounds(485, 40, 300, 400);
        add(l20);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            try{
                Conn c = new Conn();
                c.s.executeUpdate("delete from myaccount where username = '"+username+"'");
                c.s.executeUpdate("delete from mybookhotel where username = '"+username+"'");
                c.s.executeUpdate("delete from mybookpackage where username = '"+username+"'");
                c.s.executeUpdate("delete from mycustomer where username = '"+username+"'");
                
                JOptionPane.showMessageDialog(null, "Uh,Oh!!Details Successfully Deleted");
                System.exit(0);
                
            }catch(Exception e){
                
            }
        }else if(ae.getSource() == b2){
            this.setVisible(false);
        }   
    }
    
    public static void main(String[] args){
        new DeleteCustomer("").setVisible(true);
    }    
    
}
