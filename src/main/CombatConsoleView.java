import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Enums for action types
enum ActionType { ATTACK, DEFEND, SKILL }

// Combatant interface
interface Combatant {
    String getName();
    int getHealth();
    int getEnergy();
    void takeDamage(int amount);
    void performAction(CombatAction action);
    void useSkill(Skill skill);
}

// Player class
class Player implements Combatant {
    String name;
    int health;
    int energy;
    List<Skill> skills;
    List<Item> inventory;

    public Player(String name, int health, int energy) {
        this.name = name;
        this.health = health;
        this.energy = energy;
        this.skills = new ArrayList<>();
        this.inventory = new ArrayList<>();
    }

    @Override
    public String getName() { return name; }

    @Override
    public int getHealth() { return health; }

    @Override
    public int getEnergy() { return energy; }

    @Override
    public void takeDamage(int amount) { health -= amount; }

    @Override
    public void performAction(CombatAction action) { action.execute(); }

    @Override
    public void useSkill(Skill skill) {
        if (energy >= skill.manaCost) {
            energy -= skill.manaCost;
            skill.useSkill();
        } else {
            System.out.println("Not enough energy!");
        }
    }
}

// Enemy class
class Enemy implements Combatant {
    String name;
    int health;
    int energy;
    int attackPower;
    int defensePower;

    public Enemy(String name, int health, int energy, int attackPower, int defensePower) {
        this.name = name;
        this.health = health;
        this.energy = energy;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    @Override
    public String getName() { return name; }

    @Override
    public int getHealth() { return health; }

    @Override
    public int getEnergy() { return energy; }

    @Override
    public void takeDamage(int amount) { health -= amount; }

    @Override
    public void performAction(CombatAction action) { action.execute(); }

    @Override
    public void useSkill(Skill skill) {
        if (energy >= skill.manaCost) {
            energy -= skill.manaCost;
            skill.useSkill();
        } else {
            System.out.println("Enemy does not have enough energy");
        }
    }
}

// CombatAction class
abstract class CombatAction {
    ActionType actionType;
    Combatant target;

    public abstract void execute();
    public abstract int calculateDamage();
}

// Attack class
class Attack extends CombatAction {
    int damage;

    public Attack(Combatant target, int damage) {
        this.actionType = ActionType.ATTACK;
        this.target = target;
        this.damage = damage;
    }

    @Override
    public void execute() { target.takeDamage(calculateDamage()); }

    @Override
    public int calculateDamage() { return damage; }
}

// Defend class
class Defend extends CombatAction {
    int defenseAmount;

    public Defend(Combatant target, int defenseAmount) {
        this.actionType = ActionType.DEFEND;
        this.target = target;
        this.defenseAmount = defenseAmount;
    }

    @Override
    public void execute() { }

    @Override
    public int calculateDamage() { return 0; }

    public int applyDefense() { return defenseAmount; }
}

// Skill class
class Skill {
    String name;
    int manaCost;
    String effect;

    public Skill(String name, int manaCost, String effect) {
        this.name = name;
        this.manaCost = manaCost;
        this.effect = effect;
    }

    public void useSkill() { System.out.println(effect); }
}

// CombatLog class
class CombatLog {
    List<String> entries;

    public CombatLog() { entries = new ArrayList<>(); }

    public void addEntry(String entry) { entries.add(entry); }

    public void clearLog() { entries.clear(); }

    public void displayLog() {
        for (String entry : entries) {
            System.out.println(entry);
        }
    }
}

// CombatController class
class CombatController {
    Combatant currentTurn;
    int turnsTaken;
    Player player;
    Enemy enemy;
    CombatLog combatLog;
    HUD hud;

    public CombatController(Player player, Enemy enemy, CombatLog combatLog, HUD hud) {
        this.player = player;
        this.enemy = enemy;
        this.combatLog = combatLog;
        this.hud = hud;
        this.currentTurn = player;
        this.turnsTaken = 0;
    }

    public void nextTurn() {
        currentTurn = (currentTurn == player) ? enemy : player;
        turnsTaken++;
    }

    public boolean checkCombatStatus() {
        if (player.getHealth() <= 0 || enemy.getHealth() <= 0) {
            return false;
        }
        return true;
    }

    public void handlePlayerAction(CombatAction action) {
        currentTurn.performAction(action);
        combatLog.addEntry(currentTurn.getName() + " performed " + action.actionType);
        nextTurn();
        hud.updateHUD();
    }
}

// HUD class
class HUD {
    Player player;
    Enemy enemy;

    public HUD(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void updateHUD() {
        displayStats();
    }

    public void displayStats() {
        System.out.println("Player: " + player.getName() + " Health: " + player.getHealth() + " Energy: " + player.getEnergy());
        System.out.println("Enemy: " + enemy.getName() + " Health: " + enemy.getHealth() + " Energy: " + enemy.getEnergy());
    }
}

// Item class
class Item {}

// CombatConsole class
class CombatConsole {
    CombatLog combatLog;
    HUD hud;
    CombatController combatController;
    Scanner scanner;

    public CombatConsole(Player player, Enemy enemy) {
        this.combatLog = new CombatLog();
        this.hud = new HUD(player, enemy);
        this.combatController = new CombatController(player, enemy, combatLog, hud);
        this.scanner = new Scanner(System.in);
    }

    public void renderConsole() {
        hud.updateHUD();
        combatLog.displayLog();
    }

    public void updateCombatInfo() {
        hud.updateHUD();
    }

    public void handleInput() {
        System.out.println("Enter action (attack/defend):");
        String input = scanner.nextLine();
        if ("attack".equalsIgnoreCase(input)) {
            combatController.handlePlayerAction(new Attack(combatController.enemy, 10));
        } else if ("defend".equalsIgnoreCase(input)) {
            combatController.handlePlayerAction(new Defend(combatController.player, 5));
        }
    }

    public void runCombat() {
        while(combatController.checkCombatStatus()){
            renderConsole();
            handleInput();
        }
        renderConsole();
        System.out.println("Combat Ended!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Player player = new Player("Hero", 100, 50);
        Enemy enemy = new Enemy("Goblin", 80, 20, 15, 5);
        CombatConsole combatConsole = new CombatConsole(player, enemy);
        combatConsole.runCombat();
    }
}
