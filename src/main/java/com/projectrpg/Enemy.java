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
