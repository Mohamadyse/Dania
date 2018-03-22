/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectvehicle.model;

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
public class TransactionSystemTest {
    
    public TransactionSystemTest() {
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
     * Test of getCost method, of class TransactionSystem.
     */
   
     @Test
    public void testGetCost_ToCheckWheelsAndBreaks(){
        int expResult=250;
        CheckListDTO checkList = new CheckListDTO(true,false , false, false, true, false);
        
        int result = TransactionSystem.getCost(checkList);
        
        assertEquals( "Same Get Cost Value for same checklist.", expResult, result); 
    }

  @Test
    public void testGetCost_ToCheckAll(){
        int expResult=900;
        CheckListDTO checkList = new CheckListDTO(true, true, true, true, true, true);
        
        int result = TransactionSystem.getCost(checkList);
        
        assertEquals( "Same Get Cost Value for everything to check in the checklist.", expResult, result); 
    }

    @Test
    public void testGetCost_ToCheckDoorsAndEngine(){
        int expResult=250;
        CheckListDTO checkList = new CheckListDTO(false, true,true ,false , false, false);
        
        int result = TransactionSystem.getCost(checkList);
        
        assertEquals( "Same Get Cost Value for Check Doors and Engine.", expResult, result); 
    }

   @Test
    public void testGetCost_ToCheckGear(){
        int expResult=300;
        CheckListDTO checkList = new CheckListDTO(false, false, false, true, false, false);
        
        int result = TransactionSystem.getCost(checkList);
        
        assertEquals( "Same Get Cost Value for Check Gear.", expResult, result); 
    }
}
