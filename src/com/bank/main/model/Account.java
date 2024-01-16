package com.bank.main.model;

public class Account {
    private String accountNumber;
    private String name;
    private double balance;
    private String address;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Account(String accountNumber, String name, double balance, String address) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", address='" + address + '\'' +
                '}';
    }
}
