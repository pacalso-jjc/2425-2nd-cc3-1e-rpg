```mermaid

//ENEMY CODE

classDiagram

    class Enemy {
        + balancedStrike()
        + adaptiveDefense()
    }
  
    Character <|-- Enemy : inherits
    
    ```

    public class Enemy extends Character {
    private String name;
    private int health;
    private int attackPower;
    private String faction; // Example: "Thomasia", "Legion of Ahmed", "Neutral"

    // Constructor
    public Enemy(String name, int health, int attackPower, String faction) {
        super(); // Calls Character's constructor if needed
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.faction = faction;
    }

    // Method for balanced strike
    public void balancedStrike() {
        System.out.println(name + " performs a balanced strike!");
    }

    // Method for adaptive defense
    public void adaptiveDefense() {
        System.out.println(name + " adapts its defense!");
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " took " + damage + " damage! Remaining health: " + health);
    }

    public int getAttackPower() {
        return attackPower;
    }

    public String getFaction() {
        return faction;
    }

    // Display enemy details
    public void displayEnemyInfo() {
        System.out.println("Enemy: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
        System.out.println("Faction: " + faction);
    }
}