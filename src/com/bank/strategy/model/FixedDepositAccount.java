package com.bank.strategy.model;

import com.bank.strategy.fee.StandardFeeStrategy;
import com.bank.strategy.interest.FixedDepositInterestStrategy;

public class FixedDepositAccount extends BankAccount {
    public FixedDepositAccount(double principal, double rate, double time) {
        super(principal, rate, time, new FixedDepositInterestStrategy(), new StandardFeeStrategy());
    }
}
