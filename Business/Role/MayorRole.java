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
import userinterface.Government.GovtManageEmployeeJPanel;
import userinterface.Government.GovtWorkAreaJPanel;
import userinterface.SafetyAdmin.SafetyAdminWorkAreaJPanel;
import userinterface.MayorRole.MayorAdminWorkAreaJPanel;
import Business.Enterprise.AirAmbulanceEnterprise;
import Business.UserAccount.UserAccount;

/**
 *
 * @author kiran
 */
public class MayorRole extends Role{

   @Override
    public String toString(){
        return RoleType.Mayor.getValue();
    }

   

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EnterpriseDirectory dir, EcoSystem business) {
       
       return new MayorAdminWorkAreaJPanel(userProcessContainer,enterprise,account);
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
