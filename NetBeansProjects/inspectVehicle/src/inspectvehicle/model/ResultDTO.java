/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectvehicle.model;

import java.util.ArrayList;

/**
 *
 * @author mohamad
 */
public class ResultDTO {
    ArrayList<String> result;
    
    
    public ResultDTO(){
        result =new ArrayList<>();
    }
    
    
    
  public void  add(int index,String evaluation){
      result.add(index, evaluation);
      
  }
}
