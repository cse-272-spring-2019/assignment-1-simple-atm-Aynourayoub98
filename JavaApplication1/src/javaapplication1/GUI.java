/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Aynour
 */
import javaapplication1.Options1;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed ayoub
 */
public class GUI  extends JFrame implements ActionListener {
    JLabel lbl1 , lbl2;
    JTextField txt1;
    JButton btn1; 
    client c = new client(25000,"5487");
   Atm a= new Atm(c) ;
   static Boolean check ;
    
    GUI()
    {  
        
        setLayout(null);
        lbl1=new JLabel("Hello");
        lbl1.setFont(new Font("Oswaard",Font.ITALIC,70));
        lbl2 =new JLabel ("ID");
        lbl2.setFont(new Font("Oswaard",Font.ITALIC,28));
         txt1 =new JTextField(15);
         btn1=new JButton("Login");
         btn1.setBackground(Color.YELLOW);
          btn1.setForeground(Color.DARK_GRAY);
         lbl1.setBounds(300, 50, 450, 200);
         add(lbl1);
         lbl2.setBounds(200, 150, 375, 200);
         add(lbl2);
         txt1.setFont(new Font("Oswaard",Font.ITALIC,15)); 
         txt1.setBounds(300, 235, 200, 40);
         add(txt1);
            btn1.setBounds(300,275,200,40);
         add(btn1);
         btn1.addActionListener(this);
         
         getContentPane().setBackground(Color.GRAY);
         setSize(750,750);
         setLocation(500, 200);
         setVisible(true); 
         
      
    }  
          
       
    @Override
    public void actionPerformed(ActionEvent ae) {
        String x = txt1.getText();
        check = a.login(x);
        if (check) {
           Options1  o= new Options1(c);
            o.setVisible(true);
        }

    } 
    
    
    
    
    
    
    
         
    
    
   

    
    public static void main(String[] args) {
        GUI g=new GUI();
        g.setVisible(true);
        
    }

    
  
    
    
    
}
    

