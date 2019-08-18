/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import javax.swing.ImageIcon;

/**
 *
 * @author adith
 */
public class Person {
    String FirstName;
    String LastName;
    int age;
    String email;
    int dateofbirth;
    Address address;
    Creditcard creditcard;
    License license;
    FinancialAccounts savingsAccount;
    FinancialAccounts checkingAccounts;
    public String filename;
    ImageIcon pic;

    public ImageIcon getPic() {
        return pic;
    }

    public void setPic(ImageIcon pic) {
        this.pic = pic;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public FinancialAccounts getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(FinancialAccounts savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public FinancialAccounts getCheckingAccounts() {
        return checkingAccounts;
    }

    public void setCheckingAccounts(FinancialAccounts checkingAccounts) {
        this.checkingAccounts = checkingAccounts;
    }

 
    

    public Creditcard getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(Creditcard creditcard) {
        this.creditcard = creditcard;
    }
    

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(int dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
    
    
    
}
