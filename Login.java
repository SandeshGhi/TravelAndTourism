package travels.and.tourism.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton b1, b2, b3;
    JTextField t1;
    JPasswordField t2;
    
    Login(){
        
        setLayout(null);
        getContentPane().setBackground(Color.blue);
        setBounds(400,200,800,425);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(0, 0, 300, 425);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travels/and/tourism/management/system/icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(275, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(50, 50, 200, 300);
        p1.add(l1);
         
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(300, 45, 450, 300);
        add(p2);
        
        // Label For Username
        JLabel l2 = new JLabel("Username");
        l2.setBounds(60, 30, 100, 25);
        l2.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        p2.add(l2);
        
        t1 = new JTextField();
        t1.setBounds(60, 60, 300, 30);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t1);
        
        // Label For Password
        
        JLabel l3 = new JLabel("Password");
        l3.setBounds(60, 120, 100, 25);
        l3.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        p2.add(l3);
        
        t2 = new JPasswordField();
        t2.setBounds(60, 150, 300, 30);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t2);
        
        // Buttons for Login
        
        b1 = new JButton("Login");
        b1.setBounds(60, 200, 130, 30);
        b1.setBackground(Color.green);
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        p2.add(b1);
        
        // Buttons for Sign UP
        
        b2 = new JButton("Signup");
        b2.setBounds(230, 200, 130, 30);
        b2.setForeground(Color.green);
        b2.setBackground(Color.WHITE);
        b2.setBorder(new LineBorder(Color.green));
        b2.addActionListener(this);
        p2.add(b2);
        
        // Buttons for Sign UP
        
        b3 = new JButton("Forgot Password");
        b3.setBounds(130, 250, 160, 30);
        b3.setForeground(Color.white);
        b3.setBackground(Color.red);
        b3.setBorder(BorderFactory.createEmptyBorder());
        b3.addActionListener(this);
        p2.add(b3);
        
        JLabel l4 = new JLabel("Trouble Login?");
        l4.setForeground(Color.red);
        l4.setBounds(300, 255, 100, 20);
        p2.add(l4);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            try{
                String username = t1.getText();
                String password = t2.getText();
                String sql = "select * from myaccount where username='"+username+"' AND password = '"+password+"'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(sql);
                if(rs.next()){
                    this.setVisible(false);
                    new Loading(username).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Login Credentials");
                } 
            }catch(Exception e){
            
            }
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Signup().setVisible(true);
        }else if(ae.getSource() == b3){
            this.setVisible(false);
            new ForgotPassword().setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
}
