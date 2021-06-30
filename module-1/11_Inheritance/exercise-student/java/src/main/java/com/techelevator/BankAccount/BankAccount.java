package com.techelevator.BankAccount;

public class BankAccount {

    private String accountNumber;
    private int balance = new int ("0");
    private String accountHolderName;

    public BankAccount() {
        balance = new int ("0.00"):
        accountNumber = "hk8ytg";
        accountHolderName = "Amalia";

    }

    public BankAccount (String accountNumber, int balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
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
        balance = balance.add(amountToDeposit);
        this.setBalance(balance);
        return balance;
    }

    public int withdraw(int amountToWithdraw) {
        balance = balance.subtract(amountToWithdraw);
        this.setBalance(balance);
        return balance;
   }
}
