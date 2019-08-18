/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SafetyAdmins;

import java.util.ArrayList;

/**
 *
 * @author kiran
 */
public class SupplyItemsDirectory {
    
    private ArrayList<ItemSupplier> supplyItemsList;
    
    public SupplyItemsDirectory() {
     supplyItemsList = new ArrayList<>();
}

    public ArrayList<ItemSupplier> getSupplyItemsList() {
        return supplyItemsList;
    }

    public void setSupplyItemsList(ArrayList<ItemSupplier> supplyItemsList) {
        this.supplyItemsList = supplyItemsList;
    }
    
    public ItemSupplier addSuuplyItemList(){
        ItemSupplier i = new ItemSupplier();
        supplyItemsList.add(i);
        return(i);
        
    }
    
}
