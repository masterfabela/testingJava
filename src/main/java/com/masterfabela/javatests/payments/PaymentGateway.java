package com.masterfabela.javatests.payments;

interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);

}
