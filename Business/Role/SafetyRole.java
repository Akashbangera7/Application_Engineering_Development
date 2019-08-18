/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AirAmbulance.AirAmbulanceAdminWorkArea;
import userinterface.Hospital.HospitalAdminWorkAreaJPanel;
import userinterface.SafetyAdmin.SafetyAdminWorkAreaJPanel;

/**
 *
 * @author adith
 */
public class SafetyRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EnterpriseDirectory dir, EcoSystem business) {
        //return new HospitalAdminWorkAreaJPanel(userProcessContainer, enterprise);
        return new SafetyAdminWorkAreaJPanel(userProcessContainer, enterprise,dir,account);
    }

     @Override
    public String toString(){
        return RoleType.SafetyRole.getValue();
    }

    
}
