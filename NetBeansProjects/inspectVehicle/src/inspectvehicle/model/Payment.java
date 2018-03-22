/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectvehicle.model;

import util.Printer;
import inspectvehicle.integration.PaymentAuthorization;

/**
 *
 * @author mohamad
 */
public class Payment {
    
    
    
    
    public static boolean pay(int cost) {
        System.out.println("pending authorization...");
        boolean isPaid = (new PaymentAuthorization()).authorizePayment(cost);
        Printer.printReceipt(cost, isPaid);
        return isPaid;
    }
    
}
