package pl.sda.creational.factory;

public class WeaponFactory {
    public  Weapon changeProfession(Profession newProfession) {

        switch (newProfession) {
            case TANK:
                return new Axe(1000);
            case ARCHER:
                return new Bow(500);
            case WIZARD:
                return new Wand(800);
            case SWORDSMAN:
                return new Sword(750);
            default: throw new IllegalStateException("Unknown profession");
        }
    }
}
