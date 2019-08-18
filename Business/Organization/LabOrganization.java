/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.LabTechnician;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author adith
 */
public class LabOrganization extends Organization{
    
    public LabOrganization() {
       
        super(Organization.Type.Lab.getValue());
         
    }

    
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new LabTechnician() );
       
        return roles;
    }
     
}