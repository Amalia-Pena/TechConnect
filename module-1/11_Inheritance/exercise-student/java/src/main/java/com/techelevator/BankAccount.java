package com.techelevator;

public class BankAccount {

    private String accountNumber;
    private int balance;
    private String accountHolderName;

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount (String accountHolder, String accountNumber, int balance ) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolder;
    }


    public int getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int deposit (int amountToDeposit) {
        balance = balance + amountToDeposit;
        return balance;
    }

    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        return balance;
   }

}