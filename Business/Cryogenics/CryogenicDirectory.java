/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Cryogenics;

import Business.Meterologist.Meterologist;
import java.util.ArrayList;

/**
 *
 * @author kiran
 */
public class CryogenicDirectory {
    
    
    private ArrayList<Cryogenist> Cryogenicslist;

    public ArrayList<Cryogenist> getCryogenicslist() {
        return Cryogenicslist;
    }

    public void setCryogenicslist(ArrayList<Cryogenist> Cryogenicslist) {
        this.Cryogenicslist = Cryogenicslist;
    }
    
    public CryogenicDirectory() {
        Cryogenicslist = new ArrayList<>();
    }

   
    
    
    
     public Cryogenist addCryogenist(){
    Cryogenist m = new Cryogenist();
    Cryogenicslist.add(m);
            
        return m;
     }
    
    
}
