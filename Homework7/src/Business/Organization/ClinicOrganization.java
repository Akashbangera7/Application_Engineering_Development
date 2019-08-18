/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Doctor;
import Business.Role.PharmaManager;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author raunak
 */
public class ClinicOrganization extends Organization {

    public ClinicOrganization() {
        super(Organization.Type.Clinic.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {

        roles.add(new Doctor());
        roles.add(new PharmaManager());
        return roles;
    }

}
