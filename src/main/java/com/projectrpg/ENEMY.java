public class Character {
    protected int health;
    protected String faction;

    public Character(int health, String faction) {
        this.health = health;
        this.faction = faction;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Took " + damage + " damage! Remaining health: " + health);
    }

    public void displayInfo() {
        System.out.println("Health: " + health);
        System.out.println("Faction: " + faction);
    }
}

public class Enemy extends Character {
    public Enemy(int health, String faction) {
        super(health, faction);
    }

    public void balancedStrike() {
        System.out.println("Enemy performs a balanced strike!");
    }

    public void adaptiveDefense() {
        System.out.println("Enemy adapts its defense!");
    }
}