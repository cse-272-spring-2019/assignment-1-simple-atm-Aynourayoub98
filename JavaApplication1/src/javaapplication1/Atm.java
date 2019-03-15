/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author Aynour
 */

public class Atm implements MyAtm{
    
    int count=0;
    client c ;
    String password;
    double currentbalance;
    ArrayList<String> History = new ArrayList<String> ();
    
    public boolean login (String password)
    { 
        return this.c.getCardNum().equals(password);
    }

    public void Account (String p , double c)
    {
        password =p;
        currentbalance=c;
        
    }

    

    public double getCurrentbalance() {
        return currentbalance; 
        
    }

    public Atm(client c) {
        this.c = c;
    }
    

    
 
   

  
    @Override
 public void withdraw (String amount){
     
     double x =Double.parseDouble(amount);
     if(c.getBalance()>x)
     {
         double current=c. getBalance();
         c.setBalance(current - x);
         History.add("Withdraw"+amount);
         count++;
     }
             
 }

    public void deposit (String amount)
    {
        double dp=Double.parseDouble(amount);
        double currentbalance =c.getBalance();
        c.setBalance(currentbalance + dp);
        History.add("Deposit"+amount);
        count++;
                
    }
   
    @Override
   public String prev()
   {
       
       if(count==0)
       {
           
           return ("NOTHING DONE");
           
       } return History.get(--count);
   }
   public String next()
   {
       
       if(count == History.size()-1)
       {
          return ("NOTHING DONE");
       }return History.get(++count);
   }

    @Override
    public String getCurrentBalance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
