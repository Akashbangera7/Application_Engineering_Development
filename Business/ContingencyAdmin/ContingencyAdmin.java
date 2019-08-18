/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ContingencyAdmin;

/**
 *
 * @author kiran
 */
public class ContingencyAdmin {
    
    private String Disaster;
    private String CasualtyType;
    private String Requirements;
    private String Severity;

    public String getDisaster() {
        return Disaster;
    }

    public void setDisaster(String Disaster) {
        this.Disaster = Disaster;
    }

    public String getCasualtyType() {
        return CasualtyType;
    }

    public void setCasualtyType(String CasualtyType) {
        this.CasualtyType = CasualtyType;
    }

    public String getRequirements() {
        return Requirements;
    }

    public void setRequirements(String Requirements) {
        this.Requirements = Requirements;
    }

    public String getSeverity() {
        return Severity;
    }

    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }
    
    @Override
    public String toString() {
        return Disaster;
    }
    
}
