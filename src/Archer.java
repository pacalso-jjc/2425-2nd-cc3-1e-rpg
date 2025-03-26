public class Archer {
    private int damage;
    private int armor;
    private int initiative;
    private int accuracy;

    public Archer(int damage, int armor, int initiative, int accuracy) {
        this.damage = damage;
        this.armor = armor;
        this.initiative = initiative;
        this.accuracy = accuracy;
    }

    public void steadyAim() {
        System.out.println("Archer prepares a precise shot, increasing accuracy for the next attack!");
    }

    public void arrowRain() {
        System.out.println("Archer unleashes a volley of arrows, striking multiple enemies!");
    }

    public void snipe() {
        System.out.println("Archer takes careful aim and fires a devastating shot at a single enemy!");
    }

    public String toString() {
        return "Archer [Damage=" + damage + ", Armor=" + armor + ", Initiative=" + initiative + ", Accuracy=" + accuracy + "]";
    }
}
