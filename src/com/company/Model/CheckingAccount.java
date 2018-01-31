package com.company.Model;

public class CheckingAccount extends BankAccount {

    private final double overDraftFee = 25;
    private double overDraftLimit = 0;

    public CheckingAccount(double balance) {
        super(balance);   //command n to get this code

    }
    @Override
    public double withdraw(double amount) {
        if (balance - amount < overDraftLimit) {
            balance = balance - amount - overDraftFee;
            System.out.println("Your account is overdrawn by $ " + amount);
            System.out.println("Your account has been assessed an over draft " +
                    "fee $ " + overDraftFee + "new" + balance);

            return balance;

        } else {
            balance -= amount;
            System.out.println("Withdraw from checking $ " + amount + "new balance $ " + balance);

            return balance;

        }
    }

    @Override
    public String toString() {
        return "Checking Account";

    }
}
