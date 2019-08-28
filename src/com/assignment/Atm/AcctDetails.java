package com.assignment.Atm;

public class AcctDetails {private int AcctNumber;
    private String AcctPassword;

    public AcctDetails(int acctNumber, String acctPassword) {
        AcctNumber = acctNumber;
        AcctPassword = acctPassword;

    }

    public AcctDetails(AcctDetails acctDetails){
        this.AcctNumber = acctDetails.AcctNumber;
        this.AcctPassword = acctDetails.AcctPassword;
    }

    public boolean isEqual(AcctDetails object){
        return this.AcctPassword.equals(object.AcctPassword) && this.AcctNumber==object.AcctNumber;
    }

    public int getAcctNumber() {
        return AcctNumber;
    }

    public void setAcctNumber(int acctNumber) {
        AcctNumber = acctNumber;
    }

    public String getAcctPassword() {
        return AcctPassword;
    }

    public void setAcctPassword(String acctPassword) {
        AcctPassword = acctPassword;
    }


}
