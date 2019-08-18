/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import Business.Enterprise.GovernmentEnterprise;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author adith
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type, String name){
        Organization organization = null;
        if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organization.setName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organization.setName(name);
            organizationList.add(organization);
        }
       
        else if (type.getValue().equals(Type.AirTrafficController.getValue())){
            organization = new AirTrafficControllerOrganization();
            organization.setName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organization.setName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Cryogenics.getValue())){
            organization = new CryogenicsOrganization();
            organization.setName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pilot.getValue())){
            organization = new PilotOrganization();
            organization.setName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.MedicalTeam.getValue())){
            organization = new MedicalTeamOrganization();
            organization.setName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Safety.getValue())){
            organization = new SafetyOrganization();
            organization.setName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Meterologist.getValue())){
            organization = new MeterologystOrganization();
            organization.setName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Mayor.getValue())){
            organization = new MayorOrganization();
            organization.setName(name);
            organizationList.add(organization);
        
        }
        else if (type.getValue().equals(Type.ContingencyAdmin.getValue())){
            organization = new ContingencyOrganization();
            organization.setName(name);
            organizationList.add(organization);
        }  
            else if (type.getValue().equals(Type.SupplyAdmin.getValue())){
            organization = new FoodSupplyOrganization();
            organizationList.add(organization);
            }
            return organization;  
            
    }
    }
    
        
