/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CryogenicsHeadRole;
import Business.Role.DoctorRole;
import Business.Role.PharmacyAdmin;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Pornima
 */
public class PharmacyOrganization extends Organization{
     public PharmacyOrganization() {
       
        super(Organization.Type.Pharmacy.getValue());
     }

    @Override
    public HashSet<Role> getSupportedRole() {
       
        roles= new HashSet<>();
        roles.add(new PharmacyAdmin());
       // roles.add(new CryogenicsHeadRole());
        return roles;
    }
    
    
    
}
