package com.glodon.exe1;

public class Test01 {

    public static void main(String[] args) {
//        Account account = new Account(1122, 20000, 0.045);
//
//        account.withdraw(30000);
//        System.out.println(account.getBalance());
//
//        account.withdraw(3000);
//        System.out.println(account.getBalance());
//
//        account.deposit(3000);
//        System.out.println(account.getBalance());
//
//        System.out.println("yue lilv shi " + account.getMonthlyInterest()*100 + "%");


        CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.045, 30000);

        checkAccount.withdraw(40000);
        System.out.println(checkAccount.getBalance());
        System.out.println(checkAccount.getOverdraft());
    }
}
