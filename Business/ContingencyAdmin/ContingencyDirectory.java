/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ContingencyAdmin;

import Business.AirAmbulance.AirAmbulance;
import Business.ContingencyAdmin.ContingencyAdmin;
import Business.Supplier.Supplier;
import java.util.ArrayList;

/**
 *
 * @author kiran
 */
public class ContingencyDirectory {
  private ArrayList<ContingencyAdmin> ContingencyList;
  
  public ContingencyDirectory() {
        ContingencyList = new ArrayList<>();
    }

    public ArrayList<ContingencyAdmin> getContingencyList() {
        return ContingencyList;
    }

    public void setContingencyList(ArrayList<ContingencyAdmin> ContingencyList) {
        this.ContingencyList = ContingencyList;
    }

    public ArrayList<ContingencyAdmin> getAmbulanceList() {
        return ContingencyList;
    }
    
    public ContingencyAdmin addContingency() {
        ContingencyAdmin c = new ContingencyAdmin();
        ContingencyList.add(c);
        return c;
    }
    
    //Removing an Employee from the Directory
    public void removeSupplier(ContingencyAdmin con) {
        ContingencyList.remove(con);
    }
    
}