package com.masterfabela.javatests.payments;

class PaymentResponse {

    enum PaymentStatus {
        OK, ERROR
    }

    private final PaymentStatus status;

    PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    PaymentStatus getStatus() {
        return status;
    }
}
