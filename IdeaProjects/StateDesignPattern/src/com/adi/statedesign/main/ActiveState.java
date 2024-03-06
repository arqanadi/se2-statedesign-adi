package com.adi.statedesign.main;

public class ActiveState implements AccountState {
    @Override
    public void deposit(Double depositAmount, Account account) {
        System.out.println("Depositing " + depositAmount);
        Double newBalance = account.getBalance() + depositAmount;
        account.setBalance(newBalance);
        System.out.println(account.toString());
    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {
        System.out.println("Withdrawing " + withdrawAmount);
        Double newBalance = account.getBalance() - withdrawAmount;
        account.setBalance(newBalance);
        System.out.println(account.toString());
    }

    @Override
    public void suspend(Account account) {
        System.out.println("com.adi.statedesign.main.Account is suspended!");
        account.setAccountState(new SuspendedState());
    }

    @Override
    public void activate(Account account) {
        System.out.println("com.adi.statedesign.main.Account is already activated!");
    }

    @Override
    public void close(Account account) {
        System.out.println("com.adi.statedesign.main.Account is closed!");
        account.setAccountState(new ClosedState());
    }
}
