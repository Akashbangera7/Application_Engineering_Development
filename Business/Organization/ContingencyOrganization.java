/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ContingencyAdminRole;
import Business.Role.CryogenicsHeadRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author adith
 */
public class ContingencyOrganization extends Organization{
    
    public ContingencyOrganization (){
    super(Type.ContingencyAdmin.getValue());
}
    
    @Override
    public HashSet<Role> getSupportedRole() {
      roles= new HashSet<>();
        roles.add(new ContingencyAdminRole() );
       // roles.add(new CryogenicsHeadRole());
        return roles;
    }
    
}
