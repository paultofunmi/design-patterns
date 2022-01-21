package com.behavioral.strategy.paymentdemo;

public class PendingPaymentGatewayResponseHandler implements PaymentGatewayResponseHandler {

    @Override
    public String handleResponse() {

        //Logic to handle transaction status in PENDING STATE
        return "PENDING";
    }
}
