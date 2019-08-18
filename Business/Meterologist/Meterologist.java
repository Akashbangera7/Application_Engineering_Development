/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Meterologist;

import Business.Organization.Organization;

/**
 *
 * @author Pornima
 */
public class Meterologist {
    
    private String MeterologistID;
    private String Humidity;
    private String DuePoint;
    private String Pressure;
    private String precepitation;
    private String Climate;

    public String getMeterologistID() {
        return MeterologistID;
    }

    public void setMeterologistID(String MeterologistID) {
        this.MeterologistID = MeterologistID;
    }

    public String getHumidity() {
        return Humidity;
    }

    public void setHumidity(String Humidity) {
        this.Humidity = Humidity;
    }

    public String getDuePoint() {
        return DuePoint;
    }

    public void setDuePoint(String DuePoint) {
        this.DuePoint = DuePoint;
    }

    public String getPressure() {
        return Pressure;
    }

    public void setPressure(String Pressure) {
        this.Pressure = Pressure;
    }

    public String getPrecepitation() {
        return precepitation;
    }

    public void setPrecepitation(String precepitation) {
        this.precepitation = precepitation;
    }

    public String getClimate() {
        return Climate;
    }

    public void setClimate(String Climate) {
        this.Climate = Climate;
    }
             @Override
    public String toString() {
        return MeterologistID;
    }
    
    
    
}
