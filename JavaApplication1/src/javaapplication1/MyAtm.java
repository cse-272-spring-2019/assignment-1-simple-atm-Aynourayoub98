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
public interface MyAtm {
    public String getCurrentBalance();
    public void withdraw(String amount);
    public String prev();
    public String next();
            
}