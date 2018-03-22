/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import inspectvehicle.model.CheckListDTO;
import inspectvehicle.controller.Choice;
import inspectvehicle.model.ResultDTO;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author mohamad
 */
public class Printer {

    public static void printReceipt(int cost, boolean status) {
        System.out.println("Here is the receipt : ");
        if (status) {
            System.out.println("it has been paid : " + cost + " successfully ");
        } else {
            System.out.println("Opps, somethig went wrong");
        }
    }

    public static void printSpecification(CheckListDTO checkList) {

        int i = 0, j = 1;
        System.out.println("Here is the list of tests you have to perform");
        ArrayList<Boolean> ArrayOfAllParts = checkList.getCheckListAsArray();
        for (boolean partOfVehicle : ArrayOfAllParts) {
            if (partOfVehicle) {
                System.out.println(j + ". " + Choice.values()[i] + " .");
                j++;
            }
            i++;
        }

    }
    
    public static void printResult(ResultDTO result){
        
            HashMap<Choice, String> result1 = result.getHashMap();
        System.out.println(" there is the result.... ");
        System.out.println(" +++++++++++++++++++++++++++++++++ ");
        result1.entrySet().stream().forEach(x -> System.out.println(x.getKey() + " : " + x.getValue()));
        System.out.println(" +++++++++++++++++++++++++++++++++ ");
        System.out.println("         Welcome back             ");
        System.out.println("thank you....Close the door behind you");
    }

}
