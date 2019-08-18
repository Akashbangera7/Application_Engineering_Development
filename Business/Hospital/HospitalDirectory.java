/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author Pornima
 */
public class HospitalDirectory {
 
    private ArrayList<Hospital> hospitalList;
    

    public HospitalDirectory() {
        hospitalList = new ArrayList<>();
    }

    public ArrayList<Hospital> gethospitalList() {
        return hospitalList;
    }
     public Hospital addHospital(){
    Hospital hospital = new Hospital();
    hospitalList.add(hospital);
            
        return hospital;
     }
    
//    public Hospital createHospital(String name){
//        Hospital hospital = new Hospital();
//        hospital.setHospitalName(name);
//        hospitalList.add(hospital);
//        return hospital;

    public void deleteVitals(Hospital h) {
        hospitalList.remove(h);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}