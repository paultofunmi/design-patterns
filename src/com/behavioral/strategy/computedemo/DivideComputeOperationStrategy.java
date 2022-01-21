package com.behavioral.strategy.computedemo;

public class DivideComputeOperationStrategy extends AbstractComputeOperationStrategy {

    public DivideComputeOperationStrategy(int a, int b) {

        super(a, b);
    }

    @Override
    public void compute() {

        System.out.printf("Divide %d and %d = %.2f\n", this.getA(), this.getB(), (float) this.getA() / this.getB());
    }
}
