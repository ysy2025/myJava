package com.glodon.exe1;

public class CheckAccount extends Account{

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    private double overdraft;
    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        // 这里的balance是private的,权限不够
        if(super.getBalance() >= amount){
            // 这里的super不能丢!不然会循环调用这个循环体的!!!
            super.withdraw(amount);
        }
        else{
            System.out.println("余额不足!");
            double  extra = amount - super.getBalance();

            if(overdraft >= extra){
                super.withdraw(super.getBalance());
                overdraft -= extra;
            } else {
                System.out.println("透支额度也不够");
            }

        }
    }
}
