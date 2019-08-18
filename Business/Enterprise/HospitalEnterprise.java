/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Patient.PatientDirectory;
import Business.Role.DoctorRole;
import Business.Role.HospitalAdmin;
import Business.Role.LabTechnician;
import Business.Role.MeterologistRole;
import Business.Role.PharmacyAdmin;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author adith
 */
public class HospitalEnterprise extends Enterprise{
private PatientDirectory patientDirectory;
    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.Hospital);
        patientDirectory=new PatientDirectory();
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    

    @Override
    public HashSet<Role> getSupportedRole() {
         roles= new HashSet<>();
         roles.add(new HospitalAdmin());
//<<<<<<< HEAD
        roles.add(new LabTechnician());
        roles.add(new DoctorRole());
//=======
        //roles.add(new DoctorRole());
        roles.add(new PharmacyAdmin());
        //roles.add(new LabTechnician());
//>>>>>>> aa6064d9de4f272045de9fc8437aed2d78395043
        return roles;
    }
    
    
    
}
