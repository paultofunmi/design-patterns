package com.behavioral.strategy.paymentdemo;

public class StrategyDemo {

    public static void main(String[] args) {

        PaymentGatewayResponseHandler errorHandler = new ErrorPaymentGatewayResponseHandler();
        PaymentGatewayResponseHandler successHandler = new SuccessPaymentGatewayResponseHandler();
        PaymentGatewayResponseHandler pendingHandler = new PendingPaymentGatewayResponseHandler();

        StrategyClient strategyClient = new StrategyClient(errorHandler);
        System.out.println(strategyClient.handle());

        strategyClient = new StrategyClient(successHandler);
        System.out.println(strategyClient.handle());

        strategyClient = new StrategyClient(pendingHandler);
        System.out.println(strategyClient.handle());
    }
}
