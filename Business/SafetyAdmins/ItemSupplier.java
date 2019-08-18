/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SafetyAdmins;

/**
 *
 * @author kiran
 */
public class ItemSupplier {
    
    private String Disaster;
    private String SupplyItems;
    private String Destination;

    public String getDisaster() {
        return Disaster;
    }

    public void setDisaster(String Disaster) {
        this.Disaster = Disaster;
    }

    public String getSupplyItems() {
        return SupplyItems;
    }

    public void setSupplyItems(String SupplyItems) {
        this.SupplyItems = SupplyItems;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }
    
      @Override
    public String toString() {
        return Disaster;
    }
    
}
