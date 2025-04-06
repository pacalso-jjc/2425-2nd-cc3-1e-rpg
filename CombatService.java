public class CombatService {
    private int damage;
    private int armor;
    private int initiative;
    private int accuracy;

    public CombatService(int damage, int armor, int initiative, int accuracy) {
        this.damage = damage;
        this.armor = armor;
        this.initiative = initiative;
        this.accuracy = accuracy;
    }

    public void basicAttack() {
        System.out.println("Combatant performs a basic attack, dealing " + damage + " damage!");
    }

    public void defend() {
        System.out.println("Combatant raises their shield, reducing incoming damage by " + armor + "!");
    }

    public void specialAttack() {
        System.out.println("Combatant performs a special attack with enhanced accuracy, dealing critical damage!");
    }

    public void charge() {
        System.out.println("Combatant charges at the enemy, increasing initiative for the next turn!");
    }

    public String toString() {
        return "CombatService [Damage=" + damage + ", Armor=" + armor + ", Initiative=" + initiative + ", Accuracy=" + accuracy + "]";
    }

    public int getDamage() {
        return damage;
    }

    public int getArmor() {
        return armor;
    }

    public int getInitiative() {
        return initiative;
    }

    public int getAccuracy() {
        return accuracy;
    }
}
