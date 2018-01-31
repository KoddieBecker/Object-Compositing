package com.company.Model;

public class BankMember {

    public String name;
    public String IdNumber;
    public String type;
    public double balance;

    public BankMember( String name, String IdNumber, String type, double balance) {
        this.name = name;
        this.IdNumber = IdNumber;
        this.type = type;
        this.balance = balance;

        if (this.type.equalsIgnoreCase(name));
    }

    @Override
    public String toString() {
        return (this.name +  this.IdNumber +  this.type + this.balance);



    }
}


