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
import userinterface.Hospital.HospitalAdminWorkAreaJPanel;

/**
 *
 * @author adith
 */
public class PharmacyAdmin extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EnterpriseDirectory dir, EcoSystem business) {
        //return new HospitalAdminWorkAreaJPanel(userProcessContainer, enterprise);
        return new HospitalAdminWorkAreaJPanel(userProcessContainer,account, enterprise,dir);
    }

     @Override
    public String toString(){
        return RoleType.PharmacyAdmin.getValue();
    }
    
    
}
