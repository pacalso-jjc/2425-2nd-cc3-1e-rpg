import java.util.ArrayList;
import java.util.List;

class Character {
    private String name;
    private String sex;
    private String allegiance;
    private Classification classification;
    private int level;
    private int experience;
    private int hp;
    private int strength;
    private int speed;
    private int defense;
    private int stamina;
    private int charisma;
    private List<Item> equipment;
    private Inventory inventory;

    public Character(String name, String sex, String allegiance, Classification classification) {
        this.name = name;
        this.sex = sex;
        this.allegiance = allegiance;
        this.classification = classification;
        this.level = 1; // Default
        this.experience = 0; // Default
        this.hp = 100; // Default
        this.strength = 10; // Default
        this.speed = 10; // Default
        this.defense = 10; // Default
        this.stamina = 10; // Default
        this.charisma = 10; // Default
        this.equipment = new ArrayList<>();
        this.inventory = new Inventory();
    }

    public boolean isPlayer() {
        return true; // Placeholder
    }

    public void dealDamage(Character target, int amount) {
        target.takeDamage(amount);
    }

    public void takeDamage(int amount) {
        this.hp -= amount;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public void move() {
        //idk the movement logic 
    }

    public void speak(String message) {
        System.out.println(this.name + ": " + message);
    }

    public String getName() {
        return name;
    }
}