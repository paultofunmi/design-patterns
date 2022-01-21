package com.behavioral.strategy.computedemo;

public class StrategyClient {

    ComputeOperationStrategy computeOperationStrategy;

    StrategyClient(ComputeOperationStrategy computeOperationStrategy) {

        this.computeOperationStrategy = computeOperationStrategy;
    }

    public void compute() {

        this.computeOperationStrategy.compute();
    }
}
