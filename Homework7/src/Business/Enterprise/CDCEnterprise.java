/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.CDCManager;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author shreyreddy
 */
public class CDCEnterprise extends Enterprise {

    public CDCEnterprise(String name) {
        super(name, EnterpriseType.CDC);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new CDCManager());
        return roles;
    }
}
