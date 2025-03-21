# Player Class Extending Character

public class Player extends Character {
    private String playerClass;
    private int skillPoints;

    public Player(String name, String sex, String allegiance, String classification, int level, int hp, int strength, int speed, int defense, int stamina, int charisma, String playerClass) {
        super(name, sex, allegiance, classification, level, hp, strength, speed, defense, stamina, charisma);
        this.playerClass = playerClass;
        this.skillPoints = 0;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public void addSkillPoints(int points) {
        this.skillPoints += points;
    }

    public void levelUp() {
        setLevel(getLevel() + 1);
        setHp(getHp() + 10);
        setStrength(getStrength() + 2);
        setSpeed(getSpeed() + 2);
        setDefense(getDefense() + 2);
        setStamina(getStamina() + 2);
        setCharisma(getCharisma() + 1);
        addSkillPoints(5);
    }

    @Override
    public void move() {
        System.out.println(getName() + " dashes forward with agility.");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " commands attention with authority.");
    }
}
