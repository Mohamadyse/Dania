/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectvehicle.integration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dania
 */
public class PaymentAuthorizationTest {
    
    public PaymentAuthorizationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of authorizePayment method, of class PaymentAuthorization.
     */
     @Test
    public void testAuthorizePayment(){
         boolean expResult = true;
		int amount = 0;
                PaymentAuthorization payObject= new PaymentAuthorization();
         boolean result = payObject.authorizePayment(amount);
         assertEquals( "Payment Authorization Passed.", expResult, result); 
    }
    
}
