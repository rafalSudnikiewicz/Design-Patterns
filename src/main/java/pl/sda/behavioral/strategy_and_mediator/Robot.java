package pl.sda.behavioral.strategy_and_mediator;

public class Robot {
    private Position currentPosition;
    private IController controller;

    public Robot(IController controller){
        this.controller=controller;
    }

    public ControllerData move(){
        return controller.readControllerData();
    }

    public void changeController(IController controller){
        this.controller=controller;
    }

    public void updatePosition(Position position) {
        currentPosition = position;
    }
}
