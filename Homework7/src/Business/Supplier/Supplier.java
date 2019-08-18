/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

/**
 *
 * @author vinya
 */
public class Supplier {
    private String  supplierName;
    private static int sCount;
    private String supplierId;
    private VaccineDirectory vaccineList;
    
    public Supplier(){
        supplierId="SID"+(++sCount);
        vaccineList= new VaccineDirectory();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public VaccineDirectory getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(VaccineDirectory vaccineList) {
        this.vaccineList = vaccineList;
    }
    
    
}
