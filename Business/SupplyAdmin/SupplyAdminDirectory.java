/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplyAdmin;

import Business.Supplier.Supplier;
import java.util.ArrayList;

/**
 *
 * @author kiran
 */
public class SupplyAdminDirectory {
    private ArrayList<SupplyAdmin> SupplyAdminList;
    
    public SupplyAdminDirectory() {
        SupplyAdminList = new ArrayList<>();
    }

    public ArrayList<SupplyAdmin> getSupplyAdminList() {
        return SupplyAdminList;
    }

    public void setSupplyAdminList(ArrayList<SupplyAdmin> SupplyAdminList) {
        this.SupplyAdminList = SupplyAdminList;
    }
    
   
    
     public SupplyAdmin addSupply() {
        SupplyAdmin s = new SupplyAdmin();
        SupplyAdminList.add(s);
        return s;
    }
    
    //Removing an Employee from the Directory
    public void removeSupplier(SupplyAdmin safetyAdmin) {
        SupplyAdminList.remove(safetyAdmin);
    }
    
}
