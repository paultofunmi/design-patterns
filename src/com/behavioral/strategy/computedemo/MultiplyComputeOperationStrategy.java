package com.behavioral.strategy.computedemo;

public class MultiplyComputeOperationStrategy extends AbstractComputeOperationStrategy {

    public MultiplyComputeOperationStrategy(int a, int b) {

        super(a, b);
    }

    @Override
    public void compute() {

        System.out.printf("Multiply %d and %d = %d\n", this.getA(), this.getB(), this.getA() * this.getB());
    }
}
