/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.ContingencyAdmin.ContingencyDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Hospital.HospitalDirectory;
import Business.Patient.PatientDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.HashSet;
import Business.Cryogenics.CryogenicDirectory;
import Business.SupplyAdmin.SupplyAdminDirectory;

/**
 *
 * @author adith
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private HospitalDirectory hospitalDirectory;
    private CryogenicDirectory cryogenicDirectory;
    private SupplyAdminDirectory supplyadmindir;
    private ContingencyDirectory contingencyDirectory;
    
    private int organizationID;
    private static int counter=0;
    public HashSet<Role> roles;
    
    public enum Type{
        Lab("Lab Organization"),Pharmacy("Pharmacy Organization"),Doctor("Doctor Organization"),AirTrafficController("AirTrafficController Organization"), Admin("Admin Organization"), Cryogenics("Cryogenics Organization"), Pilot("Pilot Organization"), MedicalTeam("MedicalTeam Organization"), Meterologist("Meterologist Organization"), Safety("Safety Organization"), Mayor("Mayor Organization"), ContingencyAdmin("Contingency Organization"), SupplyAdmin("FoodSupply Organization" );
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        roles = new HashSet<>();
        hospitalDirectory=new HospitalDirectory();
        cryogenicDirectory=new CryogenicDirectory();
        supplyadmindir = new SupplyAdminDirectory();
        contingencyDirectory = new ContingencyDirectory();
        ++counter;
    }

    public abstract HashSet<Role> getSupportedRole();

    
    
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public CryogenicDirectory getCryogenicDirectory() {
        return cryogenicDirectory;
    }

    public void setCryogenicDirectory(CryogenicDirectory cryogenicDirectory) {
        this.cryogenicDirectory = cryogenicDirectory;
    }
    

    @Override
    public String toString() {
        return name;
    }
    
    
}
