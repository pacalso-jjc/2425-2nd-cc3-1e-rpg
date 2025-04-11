public class CombatViewModel {
    private CombatService combatService;
    private Character player;
    private Character enemy;

    public CombatViewModel() {
        this.combatService = new CombatService();
    }

    public void initializeCombat(Character p1, Character p2) {
        this.player = p1;
        this.enemy = p2;
        combatService.startCombat(player, enemy);
    }

    public void updatePlayerHealth(int health) {
        player.takeDamage(player.getHp() - health);
    }

    public void updateEnemyHealth(int health) {
        enemy.takeDamage(enemy.getHp() - health);
    }

    public int getPlayerHealth() {
        return player.getHp();
    }

    public int getEnemyHealth() {
        return enemy.getHp();
    }

    public boolean isCombatOver() {
        return !player.isAlive() || !enemy.isAlive();
    }

    public void performPlayerAction(String action) {
        switch (action.toLowerCase()) {
            case "attack":
                player.dealDamage(enemy, player.getStrength());
                updateEnemyHealth(enemy.getHp());
                break;
            default:
                System.out.println("Unknown action: " + action);
        }
    }

    public void performEnemyAction() {
        enemy.dealDamage(player, enemy.getStrength());
        updatePlayerHealth(player.getHp());
    }
}