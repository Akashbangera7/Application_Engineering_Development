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
public class ProviderOrganization extends Organization {

    public ProviderOrganization() {
        super(Organization.Type.Provider.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {

        //roles.add(new LabAssistantRole());
        return null;
    }

}
