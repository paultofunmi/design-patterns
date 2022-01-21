package com.behavioral.strategy.paymentdemo;

public class SuccessPaymentGatewayResponseHandler implements PaymentGatewayResponseHandler {

    @Override
    public String handleResponse() {

        //Logic to handle transaction that are successful
        return "SUCCESS";
    }
}
