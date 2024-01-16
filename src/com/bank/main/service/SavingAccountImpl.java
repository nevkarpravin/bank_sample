package com.bank.main.service;

import com.bank.main.model.Account;

import java.util.Scanner;

public class SavingAccountImpl implements AccountService{
     static Account[] accounts = new Account[1000];
     static int lastAccount = 0;
    Scanner scanner = new Scanner(System.in);
    @Override
    public String createAccount() {
        System.out.println("Enter Customer Name");
        String name = scanner.next();
        System.out.println("Enter Address ");
        String address = scanner.next();
        System.out.println("Enter Opening Balance");
        double balance = scanner.nextDouble();
        String accountNumber = generateAccountNumber();
        Account account = new Account(accountNumber, name, balance, address);
        accounts[lastAccount-1] = account;
        return accountNumber;
    }

    private String generateAccountNumber() {
        lastAccount++;
        String accountNumber = "SAV" + lastAccount;
        return accountNumber;
    }

    @Override
    public boolean deleteAccount() {
        return false;
    }

    @Override
    public Account getAccount() {

        System.out.println("Enter Account Number");
        String accountNumber = scanner.next();
        for(int i=0; i < accounts.length; i++){
            Account account = accounts[i];
            if(account.getAccountNumber().equalsIgnoreCase(accountNumber)){
                return account;
            }
        }
        return null;
    }


}
