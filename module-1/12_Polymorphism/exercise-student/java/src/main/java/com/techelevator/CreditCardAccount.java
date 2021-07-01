package com.techelevator;

public class CreditCardAccount implements Accountable {

    private String accountHolder;  // Instance Variables
    private String accountNumber;
    private int debt = 0;

    public CreditCardAccount(String accountHolder, String accountNumber) {    // Constructor
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {    // Getters
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }

    public int getBalance() {  // Methods
        return debt * -1;
    }

    public int pay(int amountToPay) {  //Removes amountToPay from the amount owed and returns the new total amount owed.
        debt = debt - amountToPay;
        return debt;
    }

    public int charge(int amountToCharge) { // Adds amountToCharge to the amount owed, and returns the new total amount owed.
        debt = debt + amountToCharge;
        return debt;

    }

}
