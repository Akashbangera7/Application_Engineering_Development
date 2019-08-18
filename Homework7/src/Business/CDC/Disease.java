/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CDC;

/**
 *
 * @author adith
 */
public class Disease {
    
    private String diseaseName;
    private String diseaseId;
    private static int dCount;

    public Disease() {
        diseaseId="DIS"+(++dCount);
    }

    public String getName() {
        return diseaseName;
    }

    public void setName(String name) {
        this.diseaseName = name;
    }

    public String getDiseaseId() {
        return diseaseId;
    }
    
    @Override
    public String toString()
    {
        return diseaseName;
    }

    
    
    
    
    
    
}
