public class NPCViewModel {
    // Private fields
    private String name;
    private String role;
    private String allegiance;
    private String motivation;
    private String questHook;

    // Public method to update NPC details
    public void updateNPC(String name, String role, String allegiance, String motivation, String questHook) {
        this.name = name;
        this.role = role;
        this.allegiance = allegiance;
        this.motivation = motivation;
        this.questHook = questHook;
    }

    // Public method to get a summary of the NPC
    public String getNPCSummary() {
        StringBuilder summary = new StringBuilder();
        summary.append("NPC Summary:\n");
        summary.append("Name: ").append(name).append("\n");
        summary.append("Role: ").append(role).append("\n");
        summary.append("Allegiance: ").append(allegiance).append("\n");
        summary.append("Motivation: ").append(motivation).append("\n");
        summary.append("Quest Hook: ").append(questHook).append("\n");
        return summary.toString();
    }
}
