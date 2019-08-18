/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CryogenicsHeadRole;
import Business.Role.MayorRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author adith
 */
public class MayorOrganization extends Organization{
    
    public  MayorOrganization(){
        super(Type.Mayor.getValue());
                
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
      roles= new HashSet<>();
        roles.add(new MayorRole() );
       // roles.add(new CryogenicsHeadRole());
        return roles;
    }
    
}
