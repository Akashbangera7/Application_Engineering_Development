/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author raunak
 */
public class CDCManagerOrganization extends Organization {

    public CDCManagerOrganization() {
        super(Organization.Type.CDCManager.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {

        // roles.add(new AdminRole());
        return null;
    }

}
