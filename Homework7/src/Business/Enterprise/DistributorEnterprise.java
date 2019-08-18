/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Provider;
import Business.Role.Role;
import Business.Role.Supplier;
import java.util.HashSet;

/**
 *
 * @author shreyreddy
 */
public class DistributorEnterprise extends Enterprise {

    public DistributorEnterprise(String name) {
        super(name, EnterpriseType.Distributor);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new Provider());
        roles.add(new Supplier());
        return roles;
    }

}
