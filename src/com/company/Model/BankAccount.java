package com.company.Model;

public class BankAccount {

    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double withdraw(double amount){
        this.balance -= amount;
        return this.balance;  //defined method
    }

    public double depost(double amount) {
        this.balance += amount;
        return this.balance;  //defined method
    }

    public double getBalance() {
        return this.balance;
        }

    }

