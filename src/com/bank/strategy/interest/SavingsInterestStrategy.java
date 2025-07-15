package com.bank.strategy.interest;

public class SavingsInterestStrategy implements InterestCalculationStrategy {
    @Override
    public double calculateInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
