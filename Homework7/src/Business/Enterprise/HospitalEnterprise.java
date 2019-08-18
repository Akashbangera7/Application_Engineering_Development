/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.HospitalAdmin;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author raunak
 */
public class HospitalEnterprise extends Enterprise {

    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.Hospital);
    }

    @Override
    public HashSet<Role> getSupportedRole() {

        roles.add(new HospitalAdmin());
        return roles;
    }

}
