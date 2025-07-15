package com.bank.strategy.fee;

public class StandardFeeStrategy implements FeeCalculationStrategy {
    @Override
    public double calculateFee(double amount) {
        return amount * 0.01;
    }
}