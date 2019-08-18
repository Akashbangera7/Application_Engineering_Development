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
public class FinancialAccounts {
    int CreationDate;
    String Status;
    String Debt;
    String Credit;
    int AccountNumber;

    public int getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(int CreationDate) {
        this.CreationDate = CreationDate;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getDebt() {
        return Debt;
    }

    public void setDebt(String Debt) {
        this.Debt = Debt;
    }

    public String getCredit() {
        return Credit;
    }

    public void setCredit(String Credit) {
        this.Credit = Credit;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

}