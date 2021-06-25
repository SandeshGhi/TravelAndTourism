package travels.and.tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckPackage extends JFrame{
    CheckPackage(){
        setBounds(375, 200, 900, 550);
        
        String[] package1 = new String[]{"GOLD PACKAGE", "6 Days 7 Nights", "Airport Assistance", "Half Day Tour", "Daily Buffet", "Welcome Drinks on Arrivals", "Full Day Tour", "Guide", "BOOK NOW!!!", "SUMMER SPECIAL", "Price: $100", "package1.jpg"};
        String[] package2 = new String[]{"SILVER PACKAGE", "5 Days 6 Nights", "Entrance Free Tickets", "Meet and Greet at Airport", "Welcome Drinks on Arrivals", "Night Safari", "Full Day Tour", "Dinner", "BOOK NOW!!!", "WINTER SPECIAL", "Price: $240", "package2.jpg"};
        String[] package3 = new String[]{"BRONZE PACKAGE", "6 Days 5 Nights", "Return Airfare", "Free Horse Ridings" ,"Welcome Drinks on Arrivals", "Daily Buffet", "Stay in 5-Star Hotel", "BBQ Dinner", "BOOK NOW!!!", "WINTER SPECIAL", "Price: $320", "package3.jpg"};
        
        JTabbedPane pane = new JTabbedPane();
        JPanel p1 = createPackage(package1);
        pane.addTab("Package 1", null, p1);
               
        JPanel p2 = createPackage(package2);
        pane.addTab("Package 2", null, p2);
        
        JPanel p3 = createPackage(package3);
        pane.addTab("Package 3", null, p3);
        
        add(pane, BorderLayout.CENTER);
    }
    
    public JPanel createPackage(String[] pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(30, 5, 300, 30);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(l1);
        
        JLabel l2 = new JLabel(pack[1]);
        l2.setBounds(30, 60, 300, 30);
        l2.setForeground(Color.red);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l2);
        
        JLabel l3 = new JLabel(pack[2]);
        l3.setBounds(30, 115, 300, 30);
        l3.setForeground(Color.blue);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l3);
        
        JLabel l4 = new JLabel(pack[3]);
        l4.setBounds(30, 170, 300, 30);
        l4.setForeground(Color.red);
        l4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l4);
        
        JLabel l5 = new JLabel(pack[4]);
        l5.setBounds(30, 225, 300, 30);
        l5.setForeground(Color.blue);
        l5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l5);
        
        JLabel l6 = new JLabel(pack[5]);
        l6.setBounds(30, 280, 300, 30);
        l6.setForeground(Color.red);
        l6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l6);
        
        JLabel l7 = new JLabel(pack[6]);
        l7.setBounds(30, 335, 300, 30);
        l7.setForeground(Color.blue);
        l7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l7);
        
        JLabel l8 = new JLabel(pack[7]);
        l8.setBounds(30, 390, 300, 30);
        l8.setForeground(Color.red);
        l8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l8);
        
        JLabel l9 = new JLabel(pack[8]);
        l9.setBounds(30, 435, 300, 30);
        l9.setForeground(Color.green);
        l9.setFont(new Font("Tahoma", Font.PLAIN, 30));
        p1.add(l9);
        
        JLabel l10 = new JLabel(pack[9]);
        l10.setBounds(340, 450, 300, 30);
        l10.setForeground(Color.red);
        l10.setFont(new Font("Tahoma", Font.PLAIN, 30));
        p1.add(l10);
        
        JLabel l11 = new JLabel(pack[10]);
        l11.setBounds(700, 450, 300, 30);
        l11.setForeground(Color.blue);
        l11.setFont(new Font("Tahoma", Font.PLAIN, 30));
        p1.add(l11);
                       
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travels/and/tourism/management/system/icons/"+pack[11]));
        Image i2 = i1.getImage().getScaledInstance(550, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(300, 35, 550, 400);
        p1.add(l12);
        
        return p1;
    }
    
    public static void main(String[] args){
        new CheckPackage().setVisible(true);
    }
}
