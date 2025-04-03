public class CombatService {
    public void attack(Character attacker, Character defender) {
        int damage = Math.max(attacker.getAttackPower() - defender.getDefense(), 1);
        defender.takeDamage(damage);

        System.out.println(attacker.getName() + " attacks " + defender.getName() + " for " + damage + " damage!");

        if (defender.isDefeated()) {
            System.out.println(defender.getName() + " has been defeated!");
        }
    }
}
