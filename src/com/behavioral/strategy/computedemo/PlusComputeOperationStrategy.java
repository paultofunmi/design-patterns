package com.behavioral.strategy.computedemo;

public class PlusComputeOperationStrategy extends AbstractComputeOperationStrategy {

    public PlusComputeOperationStrategy(int a, int b) {

        super(a, b);
    }

    @Override
    public void compute() {

        int result = this.getA() + this.getB();
        System.out.printf("Adding %d and %d = %d\n", this.getA(), this.getB(), result);
    }
}
