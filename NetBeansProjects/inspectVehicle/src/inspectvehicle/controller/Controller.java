/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectvehicle.controller;

import inspectvehicle.integration.VehicleInspectionsRegisty;
import inspectvehicle.model.CheckListDTO;
import inspectvehicle.model.Payment;
import inspectvehicle.model.ResultDTO;
import util.Printer;
import inspectvehicle.model.TransactionSystem;
import java.util.ArrayList;

/**
 *
 * @author mohamad
 */
public class Controller {
    private int cost;
    CheckListDTO checkList;
    String regNo;

    public Controller() {
    }

    public int checkInspection(String regNo) {
        this.regNo = regNo;
        CheckListDTO checkList = getCheckList(regNo);
        return this.cost = TransactionSystem.getCost(checkList);
    }

    private CheckListDTO getCheckList(String regNo) {
        VehicleInspectionsRegisty vehicleData = new VehicleInspectionsRegisty();
        CheckListDTO checkList = vehicleData.getInspectionList(regNo);
        return this.checkList = checkList;
    }

    public ArrayList<Boolean> getCheckList() {
        return checkList.getCheckListAsArray();
    }

    public boolean payCard() {
        System.out.println("insert your card please");
        return Payment.pay(cost);
    }

    
    public void ShowCheckList(){
        Printer.printSpecification(checkList);
    }
    
    public void sendResult(ResultDTO result) {
        Printer.printResult(result);
        VehicleInspectionsRegisty.registerResult(regNo, result);

    }
    
    
    

    
}