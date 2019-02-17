package pl.sda.behavioral.strategy_and_mediator;

public class RobotDemo {
    public static void main(String[] args) {
        Robot robot = new Robot(new Keyboard());
        robot.move();
        robot.changeController(new Gamepad());
        robot.move();

    }
}
