package travels.and.tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateCustomer extends JFrame implements ActionListener{
   
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9;
    JComboBox c1;
    JRadioButton r1, r2, r3;
    JButton b1, b2;
    
    UpdateCustomer(String username){
        setBounds(375, 200, 800, 500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l11 = new JLabel("UPDATE CUSTOMER DETAILS");
        l11.setBounds(45, 0, 400, 25);
        l11.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l11);
        
        // Username Label
        JLabel l1 = new JLabel("Username");
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        l1.setBounds(50, 30, 100, 25);
        add(l1);
        
        // Username TextField
        t1 = new JTextField();
        t1.setBounds(170, 30, 215, 25);
        add(t1);
        
        // ID Label
        JLabel l2 = new JLabel("Id");
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setBounds(50, 70, 100, 25);
        add(l2);
        
        // Id ComboBox to text
        t8 = new JTextField();
        t8.setBounds(170, 70, 215, 25);
        add(t8);        
        
        // Number Label
        JLabel l3 = new JLabel("Number");
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setBounds(50, 110, 100, 25);
        add(l3);
        
        // Number TextField
        t2 = new JTextField();
        t2.setBounds(170, 110, 215, 25);
        add(t2);
        
        // Name Label
        JLabel l4 = new JLabel("Full Name");
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setBounds(50, 150, 100, 25);
        add(l4);
        
        // Name TextField
        t3 = new JTextField();
        t3.setBounds(170, 150, 215, 25);
        add(t3);
        
        // Gender Label
        JLabel l5 = new JLabel("Gender");
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setBounds(50, 190, 100, 25);
        add(l5);
        
        // Gender RadioButton to Text
        t9 = new JTextField();
        t9.setBounds(170, 190, 215, 25);
        add(t9);
        
        // Country Label
        JLabel l6 = new JLabel("Country");
        l6.setFont(new Font("Tahoma", Font.BOLD, 14));
        l6.setBounds(50, 230, 100, 25);
        add(l6);
        
        // Country TextField
        t4 = new JTextField();
        t4.setBounds(170, 230, 215, 25);
        add(t4);
        
        // Address Label
        JLabel l7 = new JLabel("Address");
        l7.setFont(new Font("Tahoma", Font.BOLD, 14));
        l7.setBounds(50, 270, 100, 25);
        add(l7);
        
        // Address TextField
        t5 = new JTextField();
        t5.setBounds(170, 270, 215, 25);
        add(t5);
        
        // Ph.No. Label
        JLabel l8 = new JLabel("ContactNo.");
        l8.setFont(new Font("Tahoma", Font.BOLD, 14));
        l8.setBounds(50, 310, 100, 25);
        add(l8);
        
        // ContactNo. TextField
        t6 = new JTextField();
        t6.setBounds(170, 310, 215, 25);
        add(t6);
        
        // Email Label
        JLabel l9 = new JLabel("Email");
        l9.setFont(new Font("Tahoma", Font.BOLD, 14));
        l9.setBounds(50, 350, 100, 25);
        add(l9);
        
        // Email TextField
        t7 = new JTextField();
        t7.setBounds(170, 350, 215, 25);
        add(t7);
        
        // Add Button
        b1 = new JButton("Update");
        b1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(110, 400, 100, 25);
        b1.addActionListener(this);
        add(b1);
        
        // Back Button
        b2 = new JButton("Back");
        b2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.BLACK);
        b2.setBounds(285, 400, 100, 25);
        b2.addActionListener(this);
        add(b2);
        
        // Image Label
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travels/and/tourism/management/system/icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(450, 80, 300, 300);
        add(l10);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from mycustomer where username = '"+username+"'");
            while(rs.next()){
                t1.setText(rs.getString("username"));
                t2.setText(rs.getString("number"));
                t3.setText(rs.getString("name"));
                t4.setText(rs.getString("country"));
                t5.setText(rs.getString("address"));
                t6.setText(rs.getString("phone"));
                t7.setText(rs.getString("email"));
                t8.setText(rs.getString("id"));
                t9.setText(rs.getString("gender"));
            }
        }catch(Exception e){
        
        }
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String username = t1.getText();
            String id = t8.getText();
            String number = t2.getText();
            String name = t3.getText();
            String radio = t9.getText();
            String country = t4.getText();
            String address = t5.getText();
            String phone = t6.getText();
            String email = t7.getText();
            
            String q = "update mycustomer set username = '"+username+"', id = '"+id+"', number = '"+number+"', name = '"+name+"', gender = '"+radio+"', country = '"+country+"', address = '"+address+"', phone = '"+phone+"', email = '"+email+"'";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(q);
                
                JOptionPane.showMessageDialog(null, "Your Details Updated Successfully");
                this.setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }    
        }else if(ae.getSource() == b2){
            this.setVisible(false);
        }
    }
           
    public static void main(String[] args){
        new UpdateCustomer("").setVisible(true);
    }
}
