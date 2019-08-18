/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author shreyreddy
 */
public class SupplierOrganization extends Organization {

    public SupplierOrganization() {
        super(Organization.Type.Supplier.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {

        //roles.add(new LabAssistantRole());
        return null;
    }
}
