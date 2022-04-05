package com.masterfabela.javatests.payments;

public class PaymentRequest {
    private final double amount;

    PaymentRequest(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
