/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import Business.CDC.Disease;

/**
 *
 * @author adith
 */
public class Vaccine {
    
    private String vaccinName;
    private String vaccinId;
    private static int vCount;
    private Disease disease;
    private int quantity;

    public Vaccine() {
        
        vaccinId="VAC"+(++vCount);
        disease=new Disease();
    }

    public String getVaccinName() {
        return vaccinName;
    }

    public void setVaccinName(String vaccinName) {
        this.vaccinName = vaccinName;
    }

    public String getVaccinId() {
        return vaccinId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
    @Override
    public String toString()
    {
        return vaccinName;
    }
    
    
    
    
}
