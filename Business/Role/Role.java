/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author adith
 */
public abstract class Role {
    
    public enum RoleType{
        
        
        AdminRole("AdminRole"),
        CryogenicsHeadRole("CryogenicsHeadRole"),
        DoctorRole("DoctorRole"),
        LabTechnician("LabTechnician"),
        MedicalTeam("MedicalTeam"),
        MeterologistRole("MeterologistRole"),
        PilotRole("PilotRole"),
        SafetyRole("SafetyRole"),
        SystemAdminRole("SystemAdminRole"),
        AirAmbulanceAdmin("AirAmbulanceAdmin"),
        HospitalAdmin("HospitalAdmin"),
        GovernmentAdmin("GovernmentAdmin"),
        NonProfitAdmin("NonProfitAdmin"),
        SystemAdmin("System Admin"),
        Mayor("Mayor Role"),
        SupplyAdmin("SupplyAdmin"),
        ContingencyAdmin("ContingencyAdmin"),
         MayorRole("GovernmentAdmin"),
//<<<<<<< HEAD
        AirTrafficControllerManager("AirTrafficControllerManager"),
        
        
//=======
        PharmacyAdmin("Pharmacy Admin");
//>>>>>>> aa6064d9de4f272045de9fc8437aed2d78395043
       
        
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization,
            
//            OrganizationDirectory orgdir,
            Enterprise enterprise,
            EnterpriseDirectory dir,
            EcoSystem business);
    

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
