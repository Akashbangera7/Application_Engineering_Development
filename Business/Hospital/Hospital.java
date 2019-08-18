/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

/**
 *
 * @author adith
 */
public class Hospital {
    
    private String HospitalId;
    private String HospitalName;
    private String HospitalLocation;
    private String HospitalTreatAvailability;
    private String HospitalDept;

    public String getHospitalDept() {
        return HospitalDept;
    }

    public void setHospitalDept(String HospitalDept) {
        this.HospitalDept = HospitalDept;
    }

    public String getHospitalId() {
        return HospitalId;
    }

    public void setHospitalId(String HospitalId) {
        this.HospitalId = HospitalId;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    public String getHospitalLocation() {
        return HospitalLocation;
    }

    public void setHospitalLocation(String HospitalLocation) {
        this.HospitalLocation = HospitalLocation;
    }

    public String getHospitalTreatAvailability() {
        return HospitalTreatAvailability;
    }

    public void setHospitalTreatAvailability(String HospitalTreatAvailability) {
        this.HospitalTreatAvailability = HospitalTreatAvailability;
    }
    
     @Override
    public String toString() {
        return HospitalId;
    }
}
