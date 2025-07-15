package com.bank.strategy.model;

import com.bank.strategy.fee.NoFeeStrategy;
import com.bank.strategy.interest.SavingsInterestStrategy;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(double principal, double rate, double time) {
        super(principal, rate, time, new SavingsInterestStrategy(), new NoFeeStrategy());
    }
}
