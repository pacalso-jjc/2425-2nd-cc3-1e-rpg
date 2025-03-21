public class NPC extends Character {
    private String role;
    private String allegiance;
    private String motivation;
    private String questHook;

    public NPC(String name, int health, String role, String allegiance, String motivation, String questHook) {
        super(name, health);
        this.role = role;
        this.allegiance = allegiance;
        this.motivation = motivation;
        this.questHook = questHook;
    }

    public void interact() {
        System.out.println(getName() + " (" + role + "): \"Greetings, traveler. How may I assist you?\"");
    }

    public void giveQuest() {
        System.out.println(getName() + " offers a quest: " + questHook);
    }

    public void trade() {
        System.out.println(getName() + " shows you their wares.");
    }

    public String getRole() {
        return role;
    }

    public String getAllegiance() {
        return allegiance;
    }

    public String getMotivation() {
        return motivation;
    }

    public String getQuestHook() {
        return questHook;
    }

    public void displayInfo() {
        System.out.println("NPC: " + getName());
        System.out.println("Role: " + role);
        System.out.println("Allegiance: " + allegiance);
        System.out.println("Motivation: " + motivation);
        System.out.println("Quest Hook: " + questHook);
    }
}
