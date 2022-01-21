package com.behavioral.strategy.paymentdemo;

public class ErrorPaymentGatewayResponseHandler implements PaymentGatewayResponseHandler {

    @Override
    public String handleResponse() {

        //Logic to handle error here
        return "ERROR";
    }
}
