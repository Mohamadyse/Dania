/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startup;

import inspectvehicle.controller.Controller;
import inspectvehicle.model.garage.QueueProgram;
import inspectvehicle.view.View;

/**
 *
 * @author mohamad
 */
public class Main {

    private static final int SLEEP_MILLIS = 3000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        QueueProgram garage = new QueueProgram();
                 Thread.sleep(SLEEP_MILLIS);
        garage.nextCustomer();
                 Thread.sleep(SLEEP_MILLIS);

        Controller contr = new Controller();

        View screen = new View(contr);

        screen.register();
    
        screen.toPay();
        
        
        contr.ShowCheckList();

        screen.setResult( );
        
        garage.closeDoor();
        
        System.exit(0);
        // TODO code application logic here
    }

}
