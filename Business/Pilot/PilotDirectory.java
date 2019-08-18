/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pilot;

import Business.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author Pornima
 */
public class PilotDirectory {
     private ArrayList<Pilot> pilotList;
    

    public PilotDirectory() {
        pilotList = new ArrayList<>();
    }

    public ArrayList<Pilot> getPilotList() {
        return pilotList;
    }

    public void setPilotList(ArrayList<Pilot> pilotList) {
        this.pilotList = pilotList;
    }

    
     public Pilot addPilot(){
    Pilot pilot = new Pilot();
    pilotList.add(pilot);
            
        return pilot;
     }
    
}
