package com.bank.main;

import com.bank.main.model.Account;
import com.bank.main.service.AccountService;
import com.bank.main.service.SavingAccountImpl;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        boolean flag = true;
        AccountService accountService = new SavingAccountImpl();
        BankApplication c1 = new BankApplication();
        while(flag) {
            System.out.println("Choose Operation\n" +
                    "\t1. create account\n" +
                    "\t2. fetch customer details by accoutNumber\n" +
                    "\t3. Check Balance\n" +
                    "\t4. deposit balance\n" +
                    "\t5. withdraw balance\n" +
                    "\t6. Mini statement\n" +
                    "\t7. Exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                     String accounNumber = accountService.createAccount();
                    if(accounNumber != null ){
                        System.out.println("Account Created SuccessFully with AccountNumber "+ accounNumber);
                    } else{
                        System.out.println("Error Occurred while Account Creation");
                    }
                    break;
                case 2:
                    Account account = accountService.getAccount();
                    if(account != null){
                        System.out.println("Account Details are ");
                        System.out.println(account);
                    }
                    break;
                case 3:
                    Account account1 = accountService.getAccount();
                    if (account1 != null){
                        System.out.println("Account Balance is " + account1.getBalance());
                    } else {
                        System.out.println("Account Does not exist");
                    }
                    break;
                case 7:
                    flag = false;
                    break;
                default:
                    System.out.println("Incorrect Choice Please try again");
                    break;
            }
        }
    }
}
