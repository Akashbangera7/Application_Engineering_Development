/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Clinic;

import Business.Organization.ClinicOrganization;
import Business.Supplier.Vaccine;

/**
 *
 * @author adith
 */
public class Pharmacy extends ClinicOrganization {
    
    private Vaccine vaccine;
    private String pharmacyName;

    public Pharmacy() {
        vaccine=new Vaccine();
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }
    
    @Override
    public String toString()
    {
        return pharmacyName;
    }
    
    
}
