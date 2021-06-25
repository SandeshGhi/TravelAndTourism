package travels.and.tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener{
    
    JButton b1, b2;
    
    Payment(){
        setBounds(450, 150, 620, 650);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travels/and/tourism/management/system/icons/esewa-nepal.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 580, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 600, 600);
        add(l1);
        
        b1 = new JButton("Pay");
        b1.setBounds(20, 550, 80, 40);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.red);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        l1.add(b1);
        
        b2 = new JButton("Cancel");
        b2.setBounds(500, 550, 80, 40);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.GREEN);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.addActionListener(this);
        l1.add(b2);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new Esewa().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Payment().setVisible(true);
    }
}
