package pl.sda.behavioral.decorator;

import pl.sda.creational.singleton.SingletonLogger;

public  class CalculatorDecorator extends Calculator {
    private final Calculator decoratedCalculator;

    public CalculatorDecorator(Calculator decoratedCalculator) {
        this.decoratedCalculator = decoratedCalculator;
    }

    @Override
    public int add(int a, int b) {
        int result = decoratedCalculator.add(a, b);
        SingletonLogger.getInstance().log(a + " + " + b + " = " + result);
        return result;
    }

    @Override
    public int subtract(int a, int b) {
        int result =decoratedCalculator.subtract(a, b);
        SingletonLogger.getInstance().log(a + " - " + b + " = " + result);
        return result;
    }

    @Override
    public int multiply(int a, int b) {
        int result =decoratedCalculator.multiply(a, b);
        SingletonLogger.getInstance().log(a + " * " + b + " = " + result);
        return result;
    }

    @Override
    public double divide(double a, double b) {
        double result =decoratedCalculator.divide(a, b);
        SingletonLogger.getInstance().log(a + " / " + b + " = " + result);
        return result;
    }

    @Override
    public boolean isEven(int number) {
        return decoratedCalculator.isEven(number);
    }

    @Override
    public boolean isOdd(int number) {
        return decoratedCalculator.isOdd(number);
    }
}
