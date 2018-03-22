/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectvehicle.integration;

import inspectvehicle.model.CheckListDTO;
import inspectvehicle.model.ResultDTO;
import java.util.HashMap;
import java.util.Random;

/**
 this class should retrieve row information from a file 
 * @author mohamad
 */
public class VehicleInspectionsRegisty {
     private static HashMap< String,ResultDTO > resultRegistery;
    
public VehicleInspectionsRegisty(){
    
    resultRegistery=new HashMap<>();
}

/**
 * it create the checklist for the vehicle from row information from a file
 * @param regNo
 * @return 
 */
    public CheckListDTO getInspectionList(String regNo){
        Random creator = new Random();
        CheckListDTO checkList = new CheckListDTO(creator.nextBoolean(), creator.nextBoolean(), creator.nextBoolean(), creator.nextBoolean(), creator.nextBoolean(), creator.nextBoolean());
        return checkList;
    }

  public static void registerResult(String regNo,ResultDTO result){
      resultRegistery.put(regNo, result);
  }


}
