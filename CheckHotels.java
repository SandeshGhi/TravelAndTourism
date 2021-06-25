package travels.and.tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckHotels extends JFrame implements Runnable{
    Thread t1;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    JLabel[] label = new JLabel[]{l1, l2, l3, l4, l5, l5, l7, l8, l9, l10};
    JLabel caption;  
    public void run(){
        String[] text = new String[]{"Soaltee Crowne Plaza, Kathmandu", "Fulbari Resort, Pokhara", "Hotel Annapurna", "Hotel Marriott, Kathmandu", "Hotel ALoft", "Tiger Palace Resort", "Hotel Malla", "Pokhara Grande Hotel", "Hyatt Regency, Kathmandu", "Hotel Everest, Kathmandu"};
    
        try{
            for(int i = 0; i <= 9; i++){
                this.label[i].setVisible(true);
                caption.setText(text[i]);
                this.label[i].add(caption);
                Thread.sleep(2800);
                this.label[i].setVisible(false);
            }
        }catch(Exception e){
            
        }
    }
    
    CheckHotels(){
        setBounds(450, 200, 900, 550);
        setLayout(null);
        
        ImageIcon i1 = null, i2 = null, i3 = null, i4 = null, i5 = null, i6 = null, i7 = null, i8 = null, i9 = null, i10 = null;
        ImageIcon[] image = new ImageIcon[]{i1, i2, i3, i4, i5, i6, i7, i8, i9, i10};
        
        Image j1 = null, j2 = null, j3 = null, j4 = null, j5 = null, j6 = null, j7 = null, j8 = null, j9 = null, j10 = null;
        Image[] jimage = new Image[]{j1, j2, j3, j4, j5, j6, j7, j8, j9, j10};
        
        ImageIcon i11 = null, i12 = null, i13 = null, i14 = null, i15 = null, i16 = null, i17 = null, i18 = null, i19 = null, i20 = null;
        ImageIcon[] iimage = new ImageIcon[]{i11, i12, i13, i14, i15, i16, i17, i18, i19, i20};
        
        caption = new JLabel();
        caption.setBounds(50, 450, 1000,70);
        caption.setForeground(Color.WHITE);
        caption.setFont(new Font("Tahoma",Font.PLAIN, 40));
        add(caption);
        
        for(int i = 0; i <= 9; i++){
            image[i] = new ImageIcon(ClassLoader.getSystemResource("travels/and/tourism/management/system/icons/hotel"+(i+1)+".jpg"));
            jimage[i] = image[i].getImage().getScaledInstance(900, 550, Image.SCALE_DEFAULT);
            iimage[i] = new ImageIcon(jimage[i]);
            this.label[i] = new JLabel(iimage[i]);
            this.label[i].setBounds(0, 0, 900, 550);
            add(this.label[i]);
        }
        
        t1 = new Thread(this);
        t1.start();
        
    }
    
    public static void main(String[] args){
        new CheckHotels().setVisible(true);
    }
}
