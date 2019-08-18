/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

//import Business.Role.ProviderRole;
import Business.Role.Role;
import Business.Role.AdminRole;
import Business.Role.NonProfitAdmin;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author adith
 */
public class NonProfitEnterprise extends Enterprise{
    
      public NonProfitEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.NonProfit);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles= new HashSet<>();
        //roles.add(new ProviderRole());
        roles.add(new NonProfitAdmin());
        return roles;
    }
}
