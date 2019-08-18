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
import Business.WorkQueue.GovernmentWorkRequest;
import javax.swing.JPanel;
import userinterface.MayorRole.MayorAdminWorkAreaJPanel;
import userinterface.SupplyAdmin.SupplyAdminAdminWorkAreaJPanel;

/**
 *
 * @author kiran
 */
public class SupplyAdmin extends Role{
    
@Override
    public String toString(){
        return RoleType.SupplyAdmin.getValue();
    }
    
@Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EnterpriseDirectory dir, EcoSystem business) {
       
       return new SupplyAdminAdminWorkAreaJPanel ( userProcessContainer, enterprise, dir, enterprise );
    }
}
