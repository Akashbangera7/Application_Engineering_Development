/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Clinic;

/**
 *
 * @author adith
 */
public class Doctor {
    
    private String doctorId;
    private String doctorName;
    private static int docCount;

    public Doctor() {
        
        doctorId="DOC"+(++docCount);
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    @Override
    public String toString()
    {
        return doctorName;
    }
    
    
}
