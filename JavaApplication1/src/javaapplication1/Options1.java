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

    
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed ayoub
 */
public class Options1  extends JFrame implements ActionListener{ 
    
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JLabel l1,l2,l3;
   Atm a;
    
      
  public  Options1(client c){ 
        
           a= new Atm(c);
        setLayout(null) ;
         btn1=new JButton("withdraw");
         btn1.setBackground(Color.YELLOW);
         btn2=new JButton("deposit");
         btn2.setBackground(Color.YELLOW);
         btn3=new JButton("current balance");
         btn3.setBackground(Color.YELLOW);
         btn4=new JButton("previous");
         btn4.setBackground(Color.YELLOW);
         btn5=new JButton("next");
         btn5.setBackground(Color.YELLOW);
        
         
         setLayout(null);
         btn1.setBounds(300,275,200,40);
         add(btn1); 
         btn2.setBounds(300,325,200,40);
         add(btn2);
          btn3.setBounds(300,375,200,40);
         add(btn3); 
         btn4.setBounds(300,425,200,40);
         add(btn4); 
         btn5.setBounds(300,475,200,40);
         add(btn5); 
         btn1.setForeground(Color.DARK_GRAY); 
         btn2.setForeground(Color.DARK_GRAY);
        btn3.setForeground(Color.DARK_GRAY);
        btn4.setForeground(Color.DARK_GRAY);
        btn5.setForeground(Color.DARK_GRAY);
        l1= new JLabel ("**********");
        l1.setBounds(200, 375,200, 40);
        
        add(l1);
        l2=new JLabel("**********");
        l2.setBounds(200,425,200,40);
                add(l2);
                l3=new JLabel("**********");
                l3.setBounds(200, 475, 200, 40);
                add(l3);
                
        
               
        
        
        getContentPane().setBackground(Color.GRAY);
        setSize(750, 750);
        setLocation(500, 200);
        setVisible(true);
        
    
btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                With w = new With(a);
                w.setVisible(true);
                w.setSize(650, 650);

            }
        });

      btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Deposit w = new Deposit(a);
                w.setVisible(true);
                w.setSize(750, 750);

            }
        });
      btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             l1.setText(c.getBalance()+"");
             
            }
        });
      btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l2.setText(a.prev());
             
    

            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l3.setText(a.next());
             
    

            }
        });

   
    }

  

    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
