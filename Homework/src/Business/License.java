/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author adith
 */
public class License {
    int LicenceNumber;
    int VehicleNumber;
    String NameOnLicense;
    int ExpiryDate;
    String OwnerCity;

    public int getLicenceNumber() {
        return LicenceNumber;
    }

    public void setLicenceNumber(int LicenceNumber) {
        this.LicenceNumber = LicenceNumber;
    }

    public int getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(int VehicleNumber) {
        this.VehicleNumber = VehicleNumber;
    }

    public String getNameOnLicense() {
        return NameOnLicense;
    }

    public void setNameOnLicense(String NameOnLicense) {
        this.NameOnLicense = NameOnLicense;
    }

    public int getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(int ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }

    public String getOwnerCity() {
        return OwnerCity;
    }

    public void setOwnerCity(String OwnerCity) {
        this.OwnerCity = OwnerCity;
    }
    
    
}
