package pl.sda.creational.factory;

public class Axe extends Weapon {

    public Axe(int damage) {
        super(damage);
    }

    @Override
    public void hit() {
        System.out.println("Walę z AXA!!!!");
    }
}
