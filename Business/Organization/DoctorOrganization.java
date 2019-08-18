/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CryogenicsHeadRole;
import Business.Role.DoctorRole;
import Business.Role.MedicalTeam;
import Business.Role.LabTechnician;
import Business.Role.PilotRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author adith
 */
public class DoctorOrganization extends Organization{

    public DoctorOrganization() {
        super(Organization.Type.Doctor.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        roles= new HashSet<>();
        roles.add(new DoctorRole() );
       // roles.add(new CryogenicsHeadRole());
        return roles;
    }
        
        
    
     
}
