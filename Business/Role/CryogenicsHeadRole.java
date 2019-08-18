/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AirAmbulance.AirAmbulanceAdminWorkArea;
import userinterface.AirAmbulance.AirAmbulanceManageEmployeeJPanel;
import userinterface.Cryogenics.CryogenicsWorkAreaJPanel;
import userinterface.Hospital.HospitalAdminWorkAreaJPanel;
import Business.Organization.CryogenicsOrganization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author adith
 */
public class CryogenicsHeadRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EnterpriseDirectory dir, EcoSystem business) {
        //return new HospitalAdminWorkAreaJPanel(userProcessContainer, enterprise);
        return new CryogenicsWorkAreaJPanel (userProcessContainer,account, (CryogenicsOrganization) organization, dir,enterprise);
    }

     @Override
    public String toString(){
        return RoleType.CryogenicsHeadRole.getValue();
    }
   
}
