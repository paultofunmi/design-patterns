package com.behavioral.strategy.computedemo;

public class StrategyDemo {

    public static void main(String[] args) {

        ComputeOperationStrategy plusComputeOperationStrategy = new PlusComputeOperationStrategy(5, 2);
        ComputeOperationStrategy divideComputeOperationStrategy = new DivideComputeOperationStrategy(5, 2);
        ComputeOperationStrategy subtractComputeOperationStrategy = new SubtractComputeOperationStrategy(5, 2);
        ComputeOperationStrategy multiplyComputeOperationStrategy = new MultiplyComputeOperationStrategy(5, 2);

        StrategyClient strategyClient = new StrategyClient(plusComputeOperationStrategy);
        strategyClient.compute();

        strategyClient = new StrategyClient(divideComputeOperationStrategy);
        strategyClient.compute();

        strategyClient = new StrategyClient(subtractComputeOperationStrategy);
        strategyClient.compute();

        strategyClient = new StrategyClient(multiplyComputeOperationStrategy);
        strategyClient.compute();
    }
}
