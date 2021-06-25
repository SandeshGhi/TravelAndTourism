package travels.and.tourism.management.system;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{
    JProgressBar p; 
    Thread t;
    String username;
    
    // Progress Bar Runnable Run Functions
    public void run(){
        try{
            for(int i = 1; i <= 101; i++){
                int m = p.getMaximum();
                int n = p.getValue();
                if(n<m){
                    p.setValue(p.getValue() + 1);
                }else{
                    i = 101;
                    setVisible(false);
                    // Dashboard
                    new Dashboard(username).setVisible(true);
                }
                Thread.sleep(50);
            }
        }catch(Exception e){}
    }
    Loading(String user){
        username = user;
        t = new Thread(this);
        
        setBounds(400, 250, 650, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // Project Name Label
        JLabel l1 = new JLabel("Travels And Tourism Application");
        l1.setBounds(45, 20, 600, 40);
        l1.setFont(new Font("Raleway", Font.BOLD, 35));
        l1.setForeground(Color.BLUE);
        add(l1);
        
        // Progress Bar
        p = new JProgressBar();
        p.setStringPainted(true);
        p.setBounds(150, 100, 300, 25);
        add(p);
        
        // Please Wait
        JLabel l2 = new JLabel("Please Wait....");
        l2.setBounds(250, 130, 150, 25);
        l2.setFont(new Font("Tahoma", Font.BOLD, 16));
        l2.setForeground(Color.RED);
        add(l2);
        
        // Welcome Label
        JLabel l3 = new JLabel("Welcome! " + username);
        l3.setBounds(20, 310, 200, 25);
        l3.setFont(new Font("Tahoma", Font.BOLD, 16));
        l3.setForeground(Color.GREEN);
        add(l3);
    
        t.start();
    }
    public static void main(String[] args){
        new Loading("").setVisible(true);
    }
}
