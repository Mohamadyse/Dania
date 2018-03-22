/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectvehicle.model;

import inspectvehicle.controller.Choice;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author mohamad
 */
public class ResultDTO {
//    ArrayList<String> result;
   private HashMap<Choice,String> result;
    
    public ResultDTO(){
//        result =new ArrayList<>();
        result=new HashMap<>();
    }
    
    
    
  public void  add(Choice achoice,String evaluation){ //name2
//      result.add(index, evaluation);
      result.put(achoice , evaluation);
      
  }
  
  public HashMap<Choice,String>  getHashMap(){
      
      return result;
//      result.entrySet().stream().forEach(x->System.out.println(    x.getKey()    +x.getValue()  ));
  }
}
