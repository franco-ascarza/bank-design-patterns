package com.bank.strategy.fee;

public class NoFeeStrategy implements FeeCalculationStrategy {
    @Override
    public double calculateFee(double amount) {
        return 0;
    }
}
