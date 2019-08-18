/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.SafetyRole;
import Business.Role.Role;
import Business.Supplier.SupplierDirectory;
import java.util.HashSet;

/**
 *
 * @author adith
 */
public class AdminOrganization extends Organization{
//private SupplierDirectory supplierList;
    public AdminOrganization() {
        super(Organization.Type.Admin.getValue());
        //supplierList= new SupplierDirectory();
    }

   

    @Override
    public HashSet<Role> getSupportedRole() {
        return null;
    }
     
   
    
    
}
