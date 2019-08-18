/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AirAmbulance;

//import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author Pornima
 */
public class AirAmbulanceDirectory {
    private ArrayList<AirAmbulance> ambulanceList;

    public ArrayList<AirAmbulance> getAmbulanceList() {
        return ambulanceList;
    }

    public void setAmbulanceList(ArrayList<AirAmbulance> ambulanceList) {
        this.ambulanceList = ambulanceList;
    }
    
    public AirAmbulance createAmbulance(String name){
        AirAmbulance ambulance = new AirAmbulance();
        ambulance.setAmbulanceName(name);
        ambulanceList.add(ambulance);
        return ambulance;
    }
    
}
