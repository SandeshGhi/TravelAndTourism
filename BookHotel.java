package travels.and.tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class BookHotel extends JFrame implements ActionListener{
    
    JLabel l21, l22, l23, l24, l25;
    JTextField t1, t2;
    JButton b1, b2, b3;
    Choice c1, c2, c3;
    
    BookHotel(String username){
        setBounds(450, 200, 900, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("BOOK HOTEL");
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        l1.setBounds(100, 0, 300, 30);
        add(l1);
        
        JLabel l2 = new JLabel("Username: ");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(40, 50, 120, 30);
        add(l2);
        
        l21 = new JLabel();
        l21.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l21.setBounds(170, 50, 210, 30);
        add(l21);
        
        JLabel l3 = new JLabel("Select Hotel: ");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l3.setBounds(40, 90, 120, 30);
        add(l3);
        
        c1 = new Choice();
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from myhotel");
            while(rs.next()){
                c1.add(rs.getString("name"));
            }
        }catch(Exception e){
            
        }
        c1.setBounds(170, 90, 210, 30);
        add(c1);

        JLabel l4 = new JLabel("Total Persons");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l4.setBounds(40, 130, 120, 30);
        add(l4);
        
        t1 = new JTextField("1");
        t1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        t1.setBounds(170, 130, 210, 25);
        add(t1);
        
        
        JLabel l5 = new JLabel("No. of Days");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l5.setBounds(40, 170, 120, 30);
        add(l5);
        
        t2 = new JTextField("1");
        t2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        t2.setBounds(170, 170, 210, 25);
        add(t2);
        
        JLabel l6 = new JLabel("AC/NonAC Room");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l6.setBounds(40, 210, 120, 30);
        add(l6);
        
        c2 = new Choice();
        c2.add("Yes");
        c2.add("No");
        c2.setBounds(170, 210, 210, 25);
        add(c2);
        
        JLabel l7 = new JLabel("Food Included");
        l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l7.setBounds(40, 250, 120, 30);
        add(l7);
        
        c3 = new Choice();
        c3.add("Yes");
        c3.add("No");
        c3.setBounds(170, 250, 210, 25);
        add(c3);
        
        JLabel l8 = new JLabel("ID: ");
        l8.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l8.setBounds(40, 290, 120, 30);
        add(l8);
        
        l22 = new JLabel();
        l22.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l22.setBounds(170, 290, 210, 30);
        add(l22);
        
        JLabel l9 = new JLabel("Number: ");
        l9.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l9.setBounds(40, 330, 120, 30);
        add(l9);
        
        l23 = new JLabel();
        l23.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l23.setBounds(170, 330, 210, 30);
        add(l23);
        
        JLabel l10 = new JLabel("Phone: ");
        l10.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l10.setBounds(40, 370, 120, 30);
        add(l10);
        
        l24 = new JLabel();
        l24.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l24.setBounds(170, 370, 210, 30);
        add(l24);
        
        JLabel l11 = new JLabel("Price: ");
        l11.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l11.setBounds(40, 410, 120, 30);
        add(l11);
        
        l25 = new JLabel();
        l25.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l25.setBounds(170, 410, 220, 30);
        l25.setForeground(Color.red);
        add(l25);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from mycustomer where username = '"+username+"'");
            while(rs.next()){
                l21.setText(rs.getString("username"));
                l22.setText(rs.getString("id"));
                l23.setText(rs.getString("number"));
                l24.setText(rs.getString("phone"));
            }
        }catch(Exception e){
            
        }
        
        b1 = new JButton("Check Price");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.setBounds(55, 460, 120, 30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Book");
        b2.setBackground(Color.GREEN);
        b2.setForeground(Color.WHITE);
        b2.setBounds(195, 460, 120, 30);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("Back");
        b3.setBackground(Color.RED);
        b3.setForeground(Color.WHITE);
        b3.setBounds(335, 460, 120, 30);
        b3.addActionListener(this);
        add(b3);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travels/and/tourism/management/system/icons/hotel4.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(400, 30, 500, 400);
        add(l12);
    }
   
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            try{
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery("select * from myhotel where name = '"+c1.getSelectedItem()+"'");
                while(rs.next()){
                    int cost = Integer.parseInt(rs.getString("cost_per_day_$"));
                    int food = Integer.parseInt(rs.getString("food_charges_$"));
                    int ac = Integer.parseInt(rs.getString("ac_charges_$"));
                    
                    int persons = Integer.parseInt(t1.getText());
                    int days = Integer.parseInt(t2.getText());
                    
                    String acprice = c2.getSelectedItem();
                    String foodprice = c3.getSelectedItem();
                    
                    if(persons * days > 0){
                        int total = 0;
                        total += acprice.equals("Yes") ? ac : 0;
                        total += foodprice.equals("Yes") ? food : 0;
                        total += cost;
                        total = total * persons * days;
                        l25.setText("$ "+total); // ""+ converts into String
                    }else{
                        l25.setText("Please! Enter a Valid Number.");
                    }
                }
            }catch(Exception e){
                
            }
        }else if(ae.getSource() == b2){
            try{
                Conn c = new Conn();
                c.s.executeUpdate("insert into mybookhotel values('"+l21.getText()+"', '"+c1.getSelectedItem()+"', '"+t1.getText()+"', '"+t2.getText()+"', '"+c2.getSelectedItem()+"', '"+c3.getSelectedItem()+"', '"+l22.getText()+"', '"+l23.getText()+"', '"+l24.getText()+"', '"+l25.getText()+"')");
                
                JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
                this.setVisible(false);
                
            }catch(Exception e){
                
            }
        }else if(ae.getSource() == b3){
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new BookHotel("").setVisible(true);
    }
}