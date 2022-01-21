package com.behavioral.strategy.paymentdemo;

public class StrategyClient {

    private PaymentGatewayResponseHandler handler;

    StrategyClient(PaymentGatewayResponseHandler handler) {
        this.handler = handler;
    }

    public String handle() {

        return this.handler.handleResponse();
    }
}
