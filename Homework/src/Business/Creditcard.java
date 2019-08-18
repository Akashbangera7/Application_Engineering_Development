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
public class Creditcard {
    int CardNumber;
    int StartDate;
    int EndDate;
    String NameOnCard;
    int cvv;

    public int getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(int CardNumber) {
        this.CardNumber = CardNumber;
    }

    public int getStartDate() {
        return StartDate;
    }

    public void setStartDate(int StartDate) {
        this.StartDate = StartDate;
    }

    public int getEndDate() {
        return EndDate;
    }

    public void setEndDate(int EndDate) {
        this.EndDate = EndDate;
    }

    public String getNameOnCard() {
        return NameOnCard;
    }

    public void setNameOnCard(String NameOnCard) {
        this.NameOnCard = NameOnCard;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    
    
}
