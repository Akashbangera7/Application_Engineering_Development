/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AirAmbulance;

/**
 *
 * @author Pornima
 */
public class AirAmbulance {
    
    private String ambulanceId;
    private String ambulanceName;
    private int patientCapacity;
    private String availability;

    public String getAmbulanceId() {
        return ambulanceId;
    }

    public void setAmbulanceId(String ambulanceId) {
        this.ambulanceId = ambulanceId;
    }

    public String getAmbulanceName() {
        return ambulanceName;
    }

    public void setAmbulanceName(String ambulanceName) {
        this.ambulanceName = ambulanceName;
    }

    public int getPatientCapacity() {
        return patientCapacity;
    }

    public void setPatientCapacity(int patientCapacity) {
        this.patientCapacity = patientCapacity;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
    
    @Override
    public String toString() {
        return ambulanceId;
    }
    
}
