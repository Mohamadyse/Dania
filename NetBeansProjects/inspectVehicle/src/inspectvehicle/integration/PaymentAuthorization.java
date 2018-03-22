/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectvehicle.integration;

/**
 *
 * @author mohamad
 */
public class PaymentAuthorization {
    
    public  boolean authorizePayment(int amount){
        System.out.println("Det gick bra, ta ut ditt kort");
        return true;
    }
    
}
