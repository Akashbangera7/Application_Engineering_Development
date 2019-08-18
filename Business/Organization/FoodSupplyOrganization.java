/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CryogenicsHeadRole;
import Business.Role.Role;
import Business.Role.SupplyAdmin;
import java.util.HashSet;

/**
 *
 * @author adith
 */
public class FoodSupplyOrganization extends Organization{
    public FoodSupplyOrganization(){
        super(Type.SupplyAdmin.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
      roles= new HashSet<>();
        roles.add(new SupplyAdmin() );
       // roles.add(new CryogenicsHeadRole());
        return roles;
    }
    
    
}
