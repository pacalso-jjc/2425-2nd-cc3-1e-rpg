import java.util.ArrayList;
import java.util.List;

public class Character {
    private String name;
    private String sex;
    private String allegiance;
    private String classification;
    private int level;
    private int experience;
    private int hp;
    private int strength;
    private int speed;
    private int defense;
    private int stamina;
    private int charisma;
    private List<String> equipment;
    private List<String> inventory;

    public Character(String name, String sex, String allegiance, String classification, int level, int hp, int strength, int speed, int defense, int stamina, int charisma) {
        this.name = name;
        this.sex = sex;
        this.allegiance = allegiance;
        this.classification = classification;
        this.level = level;
        this.experience = 0;
        this.hp = hp;
        this.strength = strength;
        this.speed = speed;
        this.defense = defense;
        this.stamina = stamina;
        this.charisma = charisma;
        this.equipment = new ArrayList<>();
        this.inventory = new ArrayList<>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getSex() { return sex; }
    public void setSex(String sex) { this.sex = sex; }
    
    public String getAllegiance() { return allegiance; }
    public void setAllegiance(String allegiance) { this.allegiance = allegiance; }
    
    public String getClassification() { return classification; }
    public void setClassification(String classification) { this.classification = classification; }
    
    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }
    
    public int getExperience() { return experience; }
    public void setExperience(int experience) { this.experience = experience; }
    
    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }
    
    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }
    
    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }
    
    public int getDefense() { return defense; }
    public void setDefense(int defense) { this.defense = defense; }
    
    public int getStamina() { return stamina; }
    public void setStamina(int stamina) { this.stamina = stamina; }
    
    public int getCharisma() { return charisma; }
    public void setCharisma(int charisma) { this.charisma = charisma; }
    
    public List<String> getEquipment() { return equipment; }
    public void addEquipment(String item) { this.equipment.add(item); }
    
    public List<String> getInventory() { return inventory; }
    public void addInventory(String item) { this.inventory.add(item); }
    
    public boolean isPlayer() {
        return "Player".equalsIgnoreCase(classification);
    }

    public void dealDamage(Character target, int amount) {
        int damage = Math.max(amount - target.getDefense(), 0);
        target.takeDamage(damage);
    }

    public void takeDamage(int amount) {
        this.hp -= amount;
        if (this.hp < 0) this.hp = 0;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public void move() {
        System.out.println(name + " moves swiftly.");
    }

    public void speak() {
        System.out.println(name + " speaks eloquently.");
    }
}
