/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

//import static Business.Organization.Organization.Type.SupplyAdmin;

import Business.ContingencyAdmin.ContingencyAdmin;
import Business.SupplyAdmin.SupplyAdmin;


/**
 *
 * @author kiran
 */
public class GovernmentWorkRequest extends WorkRequest {
    private SupplyAdmin supplyadmin;
    private ContingencyAdmin contingencyadmin;

    public ContingencyAdmin getContingencyadmin() {
        return contingencyadmin;
    }

    public void setContingencyadmin(ContingencyAdmin contingencyadmin) {
        this.contingencyadmin = contingencyadmin;
    }

    public SupplyAdmin getSupplyadmin() {
        return supplyadmin;
    }

    public void setSupplyadmin(SupplyAdmin supplyadmin) {
        this.supplyadmin = supplyadmin;
    }
    
    
}
