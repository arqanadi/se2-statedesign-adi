package com.adi.statedesign.main;

public class ClosedState implements AccountState {

    @Override
    public void deposit(Double depositAmount, Account account) {
        System.out.println("You cannot deposit into a closed account!");
        System.out.println(account.toString());
    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {
        System.out.println("You cannot withdraw from a closed account!");
        System.out.println(account.toString());
    }

    @Override
    public void suspend(Account account) {
        System.out.println("You cannot suspend a closed account!");
    }

    @Override
    public void activate(Account account) {
        System.out.println("You cannot activate a closed account!");
    }

    @Override
    public void close(Account account) {
        System.out.println("com.adi.statedesign.main.Account is already closed!");
    }
}
