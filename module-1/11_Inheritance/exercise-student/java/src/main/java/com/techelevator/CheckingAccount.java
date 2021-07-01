package com.techelevator;


public class CheckingAccount extends BankAccount {

   public CheckingAccount(String accountHolderName, String accountNumber, int balance){
       super(accountHolderName, accountNumber, balance);
   }

   public CheckingAccount(String accountHolder, String accountNumber) {
       super(accountHolder, accountNumber);
   }


    @Override
    public int withdraw(int amountToWithdraw) {
       if (getBalance() - amountToWithdraw > - 100) {
           super.withdraw(amountToWithdraw);
           if (getBalance() < 0) {
               super.withdraw(10);
           }
       }
        return getBalance();

        //--->      //If the balance falls below $0.00 and is less than -$100.00, a $10.00 overdraft fee is also charged against the account.

    }
}


