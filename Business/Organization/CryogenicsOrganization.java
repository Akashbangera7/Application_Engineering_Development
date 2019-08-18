/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AirTrafficControllerManager;
import Business.Role.CryogenicsHeadRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author adith
 */
public class CryogenicsOrganization extends Organization {
     public CryogenicsOrganization() {
        super(Type.Cryogenics.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
      roles= new HashSet<>();
        roles.add(new CryogenicsHeadRole() );
       // roles.add(new CryogenicsHeadRole());
        return roles;
    }
}
