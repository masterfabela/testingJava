package com.masterfabela.javatests.payments;

class PaymentProcessor {

    private PaymentGateway paymentGateway;

    PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    boolean makePayment(double amount) {
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));
        return response.getStatus() == PaymentResponse.PaymentStatus.OK;
    }
}
