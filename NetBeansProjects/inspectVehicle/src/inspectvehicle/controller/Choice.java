/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectvehicle.controller;

/**
 *
 * @author mohamad
 */
public enum Choice {  WHEEL("the wheels" ),DOOR("the doors"  ),ENGINE("the engines" ),GEAR("the gear"),BREAK("the breaks"),KEY("the keys");
String s; int i;
Choice(String s ){
    this.s=s;
 
}
public String toString(){
    return s;
}
    
}
