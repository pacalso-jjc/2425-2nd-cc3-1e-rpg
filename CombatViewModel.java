public class CombatView {
    private int health;
    private int stamina;
    private int visionRange;
    private int tacticalAwareness;

    public CombatView(int health, int stamina, int visionRange, int tacticalAwareness) {
        this.health = health;
        this.stamina = stamina;
        this.visionRange = visionRange;
        this.tacticalAwareness = tacticalAwareness;
    }

    public void scanBattlefield() {
        System.out.println("CombatView scans the battlefield, revealing enemy positions and terrain advantages!");
    }

    public void focusTarget() {
        System.out.println("CombatView locks onto a target, enhancing attack precision!");
    }

    public void strategicRetreat() {
        System.out.println("CombatView calculates a safe retreat path to avoid critical damage!");
    }
}
