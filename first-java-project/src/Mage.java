public class Mage extends Character {

    int mana;

    public Mage(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    @Override
    void attack() {
        System.out.println("le mage lance un sort ");
    }
}
