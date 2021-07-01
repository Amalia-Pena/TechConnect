package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

    private String name;           // Instance Variables
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Accountable [] getAccounts() {
        Accountable [] accountableArray = new Accountable [accounts.size()];
        return accounts.toArray(accountableArray);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addAccount(Accountable newAccount) {              //Adds newAccount to the customer's list of accounts.
         accounts.add(newAccount);
    }
}
