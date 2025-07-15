package com.bank.strategy.interest;

public class FixedDepositInterestStrategy implements InterestCalculationStrategy {
    @Override
    public double calculateInterest(double principal, double rate, double time) {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }
}
