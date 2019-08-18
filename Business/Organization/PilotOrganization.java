/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MeterologistRole;
import Business.Role.PilotRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Pornima
 */
public class PilotOrganization extends Organization {
    public PilotOrganization() {
       
        super(Organization.Type.Pilot.getValue());
         
    }

    
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new PilotRole() );
       
        return roles;
    }
    
}
