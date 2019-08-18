/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AirTrafficControllerManager;
import Business.Role.DoctorRole;
import Business.Role.SafetyRole;
import Business.Role.Role;
import Business.Supplier.Provider;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author adith
 */
public class AirTrafficControllerOrganization extends Organization{
    
      public AirTrafficControllerOrganization() {
        super(Organization.Type.AirTrafficController.getValue());
        
    }

   

    @Override
    public HashSet<Role> getSupportedRole(){
        roles= new HashSet<>();
        roles.add(new AirTrafficControllerManager() );
       // roles.add(new CryogenicsHeadRole());
        return roles;
    }
     
}
