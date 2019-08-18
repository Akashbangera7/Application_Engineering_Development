/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import userinterface.AirAmbulance.AirAmbulanceManageEmployeeJPanel;
import userinterface.Hospital.HospitalAdminWorkAreaJPanel;

/**
 *
 * @author Pornima
 */
public class AirTrafficControllerManager extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EnterpriseDirectory dir, EcoSystem business) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return new AirAmbulanceAdminWorkArea(userProcessContainer, enterprise);
    }
     @Override
    public String toString(){
        return RoleType.AirTrafficControllerManager.getValue();
    }
    
    
}
