package pl.sda.behavioral.strategy_and_mediator;

import java.util.Random;

public class Keyboard implements IController {
    @Override
    public ControllerData readControllerData() {
        Random random = new Random();
        System.out.println("Moving with keyboard");
        return new ControllerData(random.nextInt(100),random.nextInt(100));
    }
}
