/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Cryogenics.CryogenicDirectory;
import Business.Pilot.PilotDirectory;
import Business.Role.AirAmbulanceAdminRole;
import Business.Role.CryogenicsHeadRole;
import Business.Role.HospitalAdmin;
import Business.Role.LabTechnician;
import Business.Role.MeterologistRole;
import Business.Role.PilotRole;
import Business.Role.Role;
import Business.Role.SafetyRole;
import java.util.HashSet;
import Business.SafetyAdmins.SupplyItemsDirectory;
/**
 *
 * @author adith
 */
public class AirAmbulanceEnterprise extends Enterprise{
    private PilotDirectory pilotdir;
    private CryogenicDirectory cryodir;
    private SupplyItemsDirectory supplydir;
    
    AirAmbulanceEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.AirAmbulance);
        pilotdir = new PilotDirectory();
        cryodir = new CryogenicDirectory();
        supplydir = new SupplyItemsDirectory();
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public SupplyItemsDirectory getSupplydir() {
        return supplydir;
    }

    public void setSupplydir(SupplyItemsDirectory supplydir) {
        this.supplydir = supplydir;
    }

    public PilotDirectory getPilotdir() {
        return pilotdir;
    }

    public void setPilotdir(PilotDirectory pilotdir) {
        this.pilotdir = pilotdir;
    }

    public CryogenicDirectory getCryodir() {
        return cryodir;
    }

    public void setCryodir(CryogenicDirectory cryodir) {
        this.cryodir = cryodir;
    }

    

    @Override
    public HashSet<Role> getSupportedRole() {
         roles= new HashSet<>();
        roles.add(new AirAmbulanceAdminRole());
        roles.add(new PilotRole());
        roles.add(new MeterologistRole());
        roles.add(new CryogenicsHeadRole());
        roles.add(new SafetyRole());
        return roles;
    }
}
