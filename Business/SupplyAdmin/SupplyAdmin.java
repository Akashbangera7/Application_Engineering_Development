/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplyAdmin;

/**
 *
 * @author kiran
 */
public class SupplyAdmin {
    
    private  String Medicine;
    private  String Destination;
    private  String Quantity;
    private  String Victims;

    public String getMedicine() {
        return Medicine;
    }

    public void setMedicine(String Medicine) {
        this.Medicine = Medicine;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getVictims() {
        return Victims;
    }

    public void setVictims(String Victims) {
        this.Victims = Victims;
    }
    
    @Override
    public String toString() {
        return Medicine;
    }
}
