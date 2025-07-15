package com.bank.strategy.interest;

public interface InterestCalculationStrategy {
    double calculateInterest(double principal, double rate, double time);
}
