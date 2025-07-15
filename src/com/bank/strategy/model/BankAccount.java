package com.bank.strategy.model;

import com.bank.strategy.interest.InterestCalculationStrategy;
import com.bank.strategy.fee.FeeCalculationStrategy;

public abstract class BankAccount {
    private final double principal;
    private final double rate;
    private final double time;
    private InterestCalculationStrategy interestStrategy;
    private FeeCalculationStrategy feeStrategy;

    public BankAccount(double principal, double rate, double time, InterestCalculationStrategy interestStrategy, FeeCalculationStrategy feeStrategy) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.interestStrategy = interestStrategy;
        this.feeStrategy = feeStrategy;
    }

    public double calculateInterest() {
        return interestStrategy.calculateInterest(principal, rate, time);
    }

    public double calculateFee(double amount) {
        return feeStrategy.calculateFee(amount);
    }

    public void setInterestStrategy(InterestCalculationStrategy interestStrategy) {
        this.interestStrategy = interestStrategy;
    }

    public void setFeeStrategy(FeeCalculationStrategy feeStrategy) {
        this.feeStrategy = feeStrategy;
    }
}
