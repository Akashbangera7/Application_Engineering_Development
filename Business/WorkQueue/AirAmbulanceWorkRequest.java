/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

//import static Business.Enterprise.Enterprise.EnterpriseType.Hospital;
import Business.Hospital.Hospital;
import Business.SafetyAdmins.ItemSupplier;

/**
 *
 * @author Pornima
 */
public class AirAmbulanceWorkRequest extends WorkRequest{
     private String AirAmbulanceDetail;
     private Hospital hospital;
     private ItemSupplier itemSupplier;

    public ItemSupplier getItemSupplier() {
        return itemSupplier;
    }

    public void setItemSupplier(ItemSupplier itemSupplier) {
        this.itemSupplier = itemSupplier;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    

    public String getAirAmbulanceDetail() {
        return AirAmbulanceDetail;
    }

    public void setAirAmbulanceDetail(String AirAmbulanceDetail) {
        this.AirAmbulanceDetail = AirAmbulanceDetail;
    }

    

    
}
