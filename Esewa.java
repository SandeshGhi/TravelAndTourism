package travels.and.tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Esewa extends JFrame implements ActionListener{
    
    JButton b1;
    
    Esewa(){
        JEditorPane j = new JEditorPane();
        j.setEditable(false);
        try{    
            j.setPage("https://esewa.com.np");
        }catch(Exception e){
            j.setContentType("text/html");
            j.setText("<html>Couldn't Load, ERROR 404</html>");
        }
        
        JScrollPane js = new JScrollPane(j);
        getContentPane().add(js);
        
        b1 = new JButton("Back");
        b1.setBounds(600, 400, 100, 40);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.red);
        b1.addActionListener(this);
        b1.setBorder(BorderFactory.createEmptyBorder());
        j.add(b1);
        
        setBounds(450,200,750,500);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new Payment().setVisible(true);
    }
    
    public static void main(String[] args){
        new Esewa().setVisible(true);
    }
}
