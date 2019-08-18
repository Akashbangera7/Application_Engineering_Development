/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PilotRole;
import Business.Role.Role;
import Business.Role.SafetyRole;
import java.util.HashSet;

/**
 *
 * @author Pornima
 */
public class SafetyOrganization extends Organization {
    
    public SafetyOrganization() {
       
        super(Organization.Type.Safety.getValue());
         
    }

    
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new SafetyRole() );
       
        return roles;
    }
    
    
}
