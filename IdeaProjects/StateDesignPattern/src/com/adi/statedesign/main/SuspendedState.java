package com.adi.statedesign.main;

public class SuspendedState implements AccountState {
    @Override
    public void deposit(Double depositAmount, Account account) {
        System.out.println("You cannot deposit into a suspended account!");
        System.out.println(account.toString());
    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {
        System.out.println("You cannot withdraw from a suspended account!");
        System.out.println(account.toString());
    }

    @Override
    public void suspend(Account account) {
        System.out.println("com.adi.statedesign.main.Account is already suspended!");
    }

    @Override
    public void activate(Account account) {
        System.out.println("com.adi.statedesign.main.Account is activated!");
        account.setAccountState(new ActiveState());
    }

    @Override
    public void close(Account account) {
        System.out.println("com.adi.statedesign.main.Account is closed!");
        account.setAccountState(new ClosedState());
    }
}
