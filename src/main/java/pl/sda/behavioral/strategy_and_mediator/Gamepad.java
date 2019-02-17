package pl.sda.behavioral.strategy_and_mediator;

import java.util.Random;

public class Gamepad implements IController {
    @Override
    public ControllerData readControllerData() {
        Random random = new Random();
        System.out.println("Moving with gamepad");
        return new ControllerData(random.nextInt(100),random.nextInt(100));
    }
}
