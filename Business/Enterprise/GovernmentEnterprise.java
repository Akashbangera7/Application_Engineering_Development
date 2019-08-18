/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.ContingencyAdmin.ContingencyDirectory;
import Business.Role.ContingencyAdminRole;
import Business.Role.GovernmentAdmin;
import Business.Role.LabTechnician;
import Business.Role.MayorRole;
import Business.Role.Role;
import Business.Role.SafetyRole;
import Business.Role.SupplyAdmin;
import Business.SafetyAdmins.SupplyItemsDirectory;
import Business.SupplyAdmin.SupplyAdminDirectory;
import java.util.HashSet;

/**
 *
 * @author adith
 */
public class GovernmentEnterprise extends Enterprise{
    private SupplyItemsDirectory supplydir;
    private ContingencyDirectory contingencydir;
    private SupplyAdminDirectory supplyadmindir;
    
    public GovernmentEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Government);
        supplydir = new SupplyItemsDirectory();
        contingencydir = new ContingencyDirectory();
        supplyadmindir = new SupplyAdminDirectory();
              
        
    }

    public ContingencyDirectory getContingencydir() {
        return contingencydir;
    }

    public void setContingencydir(ContingencyDirectory contingencydir) {
        this.contingencydir = contingencydir;
    }

    public SupplyAdminDirectory getSupplyadmindir() {
        return supplyadmindir;
    }

    public void setSupplyadmindir(SupplyAdminDirectory supplyadmindir) {
        this.supplyadmindir = supplyadmindir;
    }
    
   

    public SupplyItemsDirectory getSupplydir() {
        return supplydir;
    }

    public void setSupplydir(SupplyItemsDirectory supplydir) {
        this.supplydir = supplydir;
    }
      

    @Override
    public HashSet<Role> getSupportedRole() {
         roles= new HashSet<>();
        roles.add(new GovernmentAdmin());
        roles.add(new MayorRole());
        roles.add(new ContingencyAdminRole());
        roles.add(new SupplyAdmin());
        roles.add(new ContingencyAdminRole());
        
        return roles;
    }
}
