public class Warrior extends Character{

    int strength;

    public Warrior(String name, int health, int strength) {
        super(name, health);
        this.strength = strength;
    }

    @Override
    void attack() {
        System.out.println("Le guerrier attaque avec son epee ");
    }
}
