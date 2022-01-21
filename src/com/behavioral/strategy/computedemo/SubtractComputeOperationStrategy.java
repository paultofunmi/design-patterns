package com.behavioral.strategy.computedemo;

public class SubtractComputeOperationStrategy extends AbstractComputeOperationStrategy {

    public SubtractComputeOperationStrategy(int a, int b) {

        super(a, b);
    }

    @Override
    public void compute() {

        System.out.printf("Adding %d and %d = %d\n", this.getA(), this.getB(), this.getA() - this.getB());
    }
}
