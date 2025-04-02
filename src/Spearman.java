// Derived class representing a Spearman, inheriting from Character
class Spearman extends Character {
    public int spearSkillLevel; 
    private Weapon equippedSpear; 

    public void attack() {
        System.out.println("The Spearman attacks with a spear!");
    }

    public void block() {
        System.out.println("The Spearman blocks the incoming attack!");
    }

    public void counter() {
        System.out.println("The Spearman counters the attack!");
    }

    public void dodge() {
        System.out.println("The Spearman dodges the attack!");
    }
}



  
