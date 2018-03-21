/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectvehicle.view;

import inspectvehicle.controller.Controller;
import inspectvehicle.model.CheckListDTO;
import inspectvehicle.model.Choice;
import inspectvehicle.model.ResultDTO;
import java.util.ArrayList;
import java.util.Scanner;
 

/**
 *
 * @author mohamad
 */
public class View {

    private Controller contr;
  

    public View(Controller contr) {
        this.contr = contr;
    }

    public void register() {
       
        String regNo =  typeRegNo();
        int cost = contr.checkInspection(regNo);
        System.out.println("the cost of inspection is: " + cost );
    }
    
    private String typeRegNo(){
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter the vehicle registration number");
        return  reader.next();
    }
 
  
    public void toPay(){
        contr.payCard();
    }
        
   
    public void setResult() {
        ArrayList<Boolean> checkList = contr.getCheckList().getArray();

        ResultDTO result = new ResultDTO();

        Scanner scan = new Scanner(System.in);
        
        
                int i = 0;
        for (Choice c : Choice.values()) {
            if (checkList.get(i)) {

                System.out.println("Check the " + c);
                result.add(i, scan.next());
            } else {
                result.add(i, "not requered");
            }
            i++;

        }
        scan.close();
        contr.sendResultToPrinter(result);
    }
        
        
        
        
// 
//      Choice[] a= Choice.values();
//            for(int i=0; i <checkList.size(); i++){
//            if (checkList.get(i)) {
//
//                System.out.println("Check the " +a[i].toString() ); 
//                result.add(i, scan.next());
//            }
//            else
//                result.add(i, "not requered");
//            
//        }
//        contr.sendResultToPrinter(result);
//    }

}
   
   
  