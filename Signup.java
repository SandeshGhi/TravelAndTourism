package travels.and.tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener{
    JButton b1, b2;
    JTextField t1, t2, t3;
    JPasswordField t4;
    Choice c1;
    
    Signup(){
        setBounds(300, 200, 900, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);
        
        // Label for Username
        JLabel l1 = new JLabel("Username");
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        l1.setBounds(50, 20, 100, 25);
        l1.setLayout(null);
        p1.add(l1);
        
        t1 = new JTextField();
        t1.setBounds(165, 20, 200, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);
        
         // Label for Email
        JLabel l2 = new JLabel("Email");
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setBounds(50, 80, 100, 25);
        p1.add(l2);
        
        t2 = new JTextField();
        t2.setBounds(165, 80, 200, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);
        
        
         // Label for Choice
        JLabel l3 = new JLabel("SecurityQuestion");
        l3.setFont(new Font("Tahoma", Font.BOLD, 13));
        l3.setBounds(50, 140, 100, 25);
        p1.add(l3);
        
        c1= new Choice();
        c1.add("Your fav Character?");
        c1.add("Iron man or Captain America?");
        c1.add("Your Lucky Number?");
        c1.add("Your Childhood SuperHero?");
        c1.setBounds(165, 140, 200, 25);
        p1.add(c1);
        
         // Label for Country
        JLabel l4 = new JLabel("Answer");
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setBounds(50, 200, 100, 25);
        p1.add(l4);
        
        t3 = new JTextField();
        t3.setBounds(165, 200, 200, 25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3);
        
        // Label for Password
        JLabel l5 = new JLabel("Password");
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setBounds(50, 260, 100, 25);
        p1.add(l5);
        
        t4= new JPasswordField();
        t4.setBounds(165, 260, 200, 25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);
                
        // For Image in Right hand Side
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travels/and/tourism/management/system/icons/signup.png"));
        JLabel l6 = new JLabel(i1);
        l6.setBounds(565, 20, 300, 300);
        add(l6);
        
        // Create Button
        b1 = new JButton("Create");
        b1.setFont(new Font("Tahoma", Font.BOLD, 13));
        b1.setBackground(Color.green);
        b1.setForeground(Color.white);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.setBounds(50, 300, 115, 25);
        b1.addActionListener(this);
        p1.add(b1);
        
        // Back Button
        b2 = new JButton("Back");
        b2.setFont(new Font("Tahoma", Font.BOLD, 13));
        b2.setForeground(Color.green);
        b2.setBackground(Color.white);
        b2.setBounds(250, 300, 115, 25);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.addActionListener(this);
        p1.add(b2);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String username = t1.getText();
            String email = t2.getText();
            String security = c1.getSelectedItem();
            String answer = t3.getText();
            String password = t4.getText();
            
            String query = "insert into myaccount values('"+username+"', '"+email+"', '"+security+"', '"+answer+"', '"+password+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Account Created Successfully");
                
                this.setVisible(false);
                new Login().setVisible(true);
            }catch(Exception e){
                e.printStackTrace();
            }

        }else if(ae.getSource() == b2){
            new Login().setVisible(true);
            this.setVisible(false);
            
        }
    }
    
    public static void main(String[] args){
        new Signup().setVisible(true);
    }
}
