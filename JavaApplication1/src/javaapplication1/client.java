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
public class client {
    
     
     private double balance;
     private String cardno;

    public client(double balance, String cardno) {
        this.balance = balance;
        this.cardno = cardno;
    }

    public double getBalance() {
        return balance;
    }

    public String getCardno() {
        return cardno;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    void getBalance(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCardNum() {
       return cardno ;
    }
      
     
    
}