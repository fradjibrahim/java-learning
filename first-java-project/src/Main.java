

public class Main {

    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("Arthur", 100, 75);
        Mage mage1 = new Mage("Merlin", 80, 120);

        Game game = new Game();

        game.addCharacter(warrior1);
        game.addCharacter(mage1);

        game.startBattle();
    }
}