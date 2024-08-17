public class Character {
    String name;
    int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    void attack(){

    }

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
    }
}
