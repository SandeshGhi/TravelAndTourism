package travels.and.tourism.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class ForgotPassword extends JFrame implements ActionListener{
    
    JTextField t1, t2, t3, t4;
    JPasswordField t5;
    JButton b1, b2, b3;
    
    ForgotPassword(){
        setBounds(400, 200, 850, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travels/and/tourism/management/system/icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l6 = new JLabel(i3);
        l6.setBounds(580, 70, 200, 200);
        add(l6);
        
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBounds(30, 30, 500, 290);
        add(p);
        
        // Email Label
        JLabel l1 = new JLabel("Username");
        l1.setBounds(40, 20, 100, 25);
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        p.add(l1);
        
        // Email TextField
        t1 = new JTextField();
        t1.setBounds(180, 20, 180, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p.add(t1);
        
        // Search from DB Button
        b1 = new JButton("Search");
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.setBounds(370, 20, 100, 25);
        b1.addActionListener(this);
        p.add(b1);
        
        // Email Label
        JLabel l2 = new JLabel("Email");
        l2.setBounds(40, 65, 100, 25);
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        p.add(l2);
        
        // Email TextField
        t2 = new JTextField();
        t2.setBounds(180, 65, 180, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p.add(t2);
        
        // Sec.Quest Label
        JLabel l3 = new JLabel("SecurityQuestion");
        l3.setBounds(40, 110, 100, 25);
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        p.add(l3);
        
        // Securtiy Quest TextField
        t3 = new JTextField();
        t3.setBounds(180, 110, 180, 25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p.add(t3);
        
        // Answer Label
        JLabel l4 = new JLabel("Answer");
        l4.setBounds(40, 155, 100, 25);
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        p.add(l4);
               
        // Answer TextField
        t4 = new JTextField();
        t4.setBounds(180, 155, 180, 25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p.add(t4);
        
        // Retrieve Button
        b2 = new JButton("Retrieve");
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.GRAY);
        b2.setBounds(370, 155, 100, 25);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.addActionListener(this);
        p.add(b2);
        
        // Password Label
        JLabel l5 = new JLabel("Password");
        l5.setBounds(40, 200, 100, 25);
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        p.add(l5);
        
        // Password TextField
        t5 = new JPasswordField();
        t5.setBounds(180, 200, 180, 25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p.add(t5);
              
        // Cancel Button
        b3 = new JButton("Cancel");
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.RED);
        b3.setBounds(260, 250, 100, 25);
        b3.setBorder(BorderFactory.createEmptyBorder());
        b3.addActionListener(this);
        p.add(b3);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        Conn c = new Conn();
        if(ae.getSource() == b1){
            try{
                String sql = "select * from myaccount where username= '"+t1.getText()+"'";
                ResultSet rs = c.s.executeQuery(sql);
                while(rs.next()){
                    t2.setText(rs.getString("email"));
                    t3.setText(rs.getString("security"));
                }
            }catch(Exception e){
                
            }
        }else if(ae.getSource() == b2){
            try{
                String sql = "select * from myaccount where answer= '"+t4.getText()+"' AND username = '"+t1.getText()+"'";
                ResultSet rs = c.s.executeQuery(sql);
                while(rs.next()){
                    t5.setText(rs.getString("password"));
                }
            }catch(Exception e){
                
            }
        }else if(ae.getSource() == b3){
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }
    public static void main(String[] args){
        new ForgotPassword().setVisible(true);
    }
}
