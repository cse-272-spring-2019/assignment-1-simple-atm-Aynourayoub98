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
 * @author LENOVO
 */
public class Deposit extends JFrame implements ActionListener {
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btn0;
    JLabel l1;
    JTextField j1 ;
    JButton btn22 ;
    Atm a;

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   Deposit(Atm c)
{     
    
       a=c;
     setLayout(null);
        l1 = new JLabel("Deposit");
        l1.setFont(new Font("Oswaard", Font.BOLD, 38));
        l1.setBounds(50,0, 350, 200);
        add(l1);
        j1 = new JTextField(15);
        j1.setBounds(100, 190, 100, 50);
        add(j1);
        btn1 = new JButton("0");
        btn1.setBackground(Color.YELLOW);
        btn1.setForeground(Color.BLACK);
        btn1.setBounds(430, 230, 100, 30);
        add(btn1);
        btn2 = new JButton("1");
        btn2.setBackground(Color.YELLOW);
        btn2.setForeground(Color.BLACK);
        btn2.setBounds(330, 110, 100, 30);
        add(btn2);
        btn3 = new JButton("2");
        btn3.setBackground(Color.YELLOW);
        btn3.setForeground(Color.BLACK);
        btn3.setBounds(430, 110, 100, 30);
        add(btn3);
        btn4 = new JButton("3");
        btn4.setBackground(Color.YELLOW);
        btn4.setForeground(Color.BLACK);
        btn4.setBounds(530, 110, 100, 30);
        add(btn4);
        btn5 = new JButton("4");
        btn5.setBackground(Color.YELLOW);
        btn5.setForeground(Color.BLACK);
        btn5.setBounds(330, 150, 100, 30);
        add(btn5);
        btn6 = new JButton("5");
        btn6.setBackground(Color.YELLOW);
        btn6.setForeground(Color.BLACK);
        btn6.setBounds(430, 150, 100, 30);
        add(btn6);
        btn7 = new JButton("6");
        btn7.setBackground(Color.YELLOW);
        btn7.setForeground(Color.BLACK);
        btn7.setBounds(530, 150, 100, 30);
        add(btn7);
        btn8 = new JButton("7");
        btn8.setBackground(Color.YELLOW);
        btn8.setForeground(Color.BLACK);
        btn8.setBounds(330, 190, 100, 30);
        add(btn8);
        btn9 = new JButton("8");
        btn9.setBackground(Color.YELLOW);
        btn9.setForeground(Color.BLACK);
        btn9.setBounds(430, 190, 100, 30);
        add(btn9);
        btn0 = new JButton("9");
        btn0.setBackground(Color.YELLOW);
        btn0.setForeground(Color.BLACK);
        btn0.setBounds(530, 190, 100, 30);
        add(btn0);
        btn22 = new JButton("Done");
        btn22.setBackground(Color.YELLOW);
        btn22.setForeground(Color.BLACK);
        btn22.setBounds(530, 270, 100, 30);
        add(btn22);
        
        getContentPane().setBackground(Color.GRAY);
        
        setSize(900, 150);
        setLocation(500, 100);
        
        btn1.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
             j1.setText(j1.getText()+"0");
         }
     });
        btn2.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
           j1.setText(j1.getText()+"1");  
         }});
     
        btn3.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              j1.setText(j1.getText()+"2"); 
         }
     });
         btn4.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              j1.setText(j1.getText()+"3"); 
         }
     });
          btn5.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              j1.setText(j1.getText()+"4"); 
         }
     });
           btn6.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              j1.setText(j1.getText()+"5"); 
         }
     });
            btn7.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              j1.setText(j1.getText()+"6"); 
         }
     });
             btn8.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              j1.setText(j1.getText()+"7"); 
         }
     });
               btn9.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              j1.setText(j1.getText()+"8"); 
         }
     });
           btn0.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              j1.setText(j1.getText()+"9"); 
         }
     });   
             btn22.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 
                 a.deposit(j1.getText());
                 
                setVisible(false);
             }
         });
}
}