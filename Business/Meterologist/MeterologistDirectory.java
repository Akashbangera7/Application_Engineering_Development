/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Meterologist;

import Business.Pilot.Pilot;
import java.util.ArrayList;

/**
 *
 * @author Pornima
 */
public class MeterologistDirectory {
    private ArrayList<Meterologist> meterologistList;
    
    
    public MeterologistDirectory() {
        meterologistList = new ArrayList<>();
    }

    public ArrayList<Meterologist> getMeterologistList() {
        return meterologistList;
    }

    public void setMeterologistList(ArrayList<Meterologist> meterologistList) {
        this.meterologistList = meterologistList;
    }
    public Meterologist addMeterologist(){
    Meterologist m = new Meterologist();
    meterologistList.add(m);  
        return m;
     }
}
