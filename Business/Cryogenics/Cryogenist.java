/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Cryogenics;

/**
 *
 * @author kiran
 */
public class Cryogenist {
    
    private String CryogenicsOrgan;
    private String CryogenistName;
    private String Origin;
    private String Destination;

    public String getCryogenistName() {
        return CryogenistName;
    }

    public void setCryogenistName(String CryogenistName) {
        this.CryogenistName = CryogenistName;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }
    
    

    public String getCryogenicsOrgan() {
        return CryogenicsOrgan;
    }

    public void setCryogenicsOrgan(String CryogenicsOrgan) {
        this.CryogenicsOrgan = CryogenicsOrgan;
    }

    
            @Override
    public String toString() {
        return CryogenicsOrgan;
    }
    
}
