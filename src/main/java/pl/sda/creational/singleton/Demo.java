package pl.sda.creational.singleton;

import pl.sda.behavioral.decorator.Calculator;
import pl.sda.behavioral.decorator.CalculatorDecorator;
import pl.sda.behavioral.decorator.StartStopDecorator;

public class Demo {
    public static void main(String[] args) {
//        SingletonLogger.getInstance().log("mam horom curke");

        Calculator calculator=new CalculatorDecorator(new Calculator());
        calculator = new StartStopDecorator(calculator);
        calculator.add(2,5);
        calculator.divide(3.4,2);
    }
}
