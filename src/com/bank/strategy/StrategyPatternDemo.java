package com.bank.strategy;

import com.bank.strategy.fee.NoFeeStrategy;
import com.bank.strategy.model.BankAccount;
import com.bank.strategy.model.FixedDepositAccount;
import com.bank.strategy.model.SavingsAccount;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(10000, 4, 1);
        System.out.println("Savings Interest: " + savings.calculateInterest());
        System.out.println("Savings Fee: " + savings.calculateFee(10000));

        BankAccount fd = new FixedDepositAccount(10000, 6, 2);
        System.out.println("FD Interest: " + fd.calculateInterest());
        System.out.println("FD Fee: " + fd.calculateFee(10000));

        // Change fee strategy at runtime
        fd.setFeeStrategy(new NoFeeStrategy());
        System.out.println("FD Fee after strategy change: " + fd.calculateFee(10000));
    }
}
