// Derived class representing a Spearman, inheriting from Character
class Spearman extends Character {
    public int spearSkillLevel; 
    private Spear equippedSpear; 

    public void Attack() {
        System.out.println("The Spearman attacks with a spear!");
    }

    public void Block() {
        System.out.println("The Spearman blocks the incoming attack!");
    }

    public void Counter() {
        System.out.println("The Spearman counters the attack!");
    }

    public void Dodge() {
        System.out.println("The Spearman dodges the attack!");
    }
}



  
