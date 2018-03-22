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
public class CheckListDTO {

    private boolean toCheckWheel;
    private boolean toCheckDoors;
    private boolean toCheckEngine;
    private boolean toCheckGear;
    private boolean toCheckBreaks;
    private boolean toCheckKeys;
    ArrayList<Boolean> s;

    public CheckListDTO(boolean toCheckWheel, boolean toCheckDoors, boolean toCheckEngine, boolean toCheckGear, boolean toCheckBreaks, boolean toCheckKeys) {

        this.toCheckWheel = toCheckWheel;
        this.toCheckDoors = toCheckDoors;
        this.toCheckEngine = toCheckEngine;
        this.toCheckGear = toCheckGear;
        this.toCheckBreaks = toCheckBreaks;
        this.toCheckKeys = toCheckKeys;
  s=new ArrayList<>();
  s.add(toCheckWheel);
  s.add(toCheckDoors );
  s.add(toCheckEngine );
  s.add(toCheckGear );
  s.add( toCheckBreaks);
  s.add( toCheckKeys );
  
  
    }
  public ArrayList getCheckListAsArray(){  
      return s;
  }
  
   
    public boolean isToCheckWheel() {
        return toCheckWheel;
    }

      public boolean isToCheckDoors() {
        return toCheckDoors;
    }

   
    public boolean isToCheckEngine() {
        return toCheckEngine;
    }

       public boolean isToCheckGear() {
        return toCheckGear;
    }

   
    public boolean isToCheckBreaks() {
        return toCheckBreaks;
    }

  
    public boolean isToCheckKeys() {
        return toCheckKeys;
    }

    
}
