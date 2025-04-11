import java.util.List;

// Represents the NPC class for interaction
class NPC {
    private int npcId;
    private String name;
    private String type;
    private String dialogue;
    private List<Quest> quests;

    // Constructor, getters, and setters
    public NPC(int npcId, String name, String type, String dialogue, List<Quest> quests) {
        this.npcId = npcId;
        this.name = name;
        this.type = type;
        this.dialogue = dialogue;
        this.quests = quests;
    }

    public int getNpcId() {
        return npcId;
    }

    public String getName() {
        return name;
    }

    public String getDialogue() {
        return dialogue;
    }

    public List<Quest> getQuests() {
        return quests;
    }
}

// Represents the Quest class for NPC-related quests
class Quest {
    private int questId;
    private String title;
    private String description;
    private String reward;

    // Constructor and getters
    public Quest(int questId, String title, String description, String reward) {
        this.questId = questId;
        this.title = title;
        this.description = description;
        this.reward = reward;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}

// Console view for interacting with NPCs
public class NPCConsoleView {

    // Displays NPC information
    public void displayNPCInfo(NPC npc) {
        System.out.println("NPC Info:");
        System.out.println("Name: " + npc.getName());
        System.out.println("Dialogue: " + npc.getDialogue());
    }

    // Lists NPC quests
    public void listNPCQuests(NPC npc) {
        System.out.println("Available Quests:");
        for (Quest quest : npc.getQuests()) {
            System.out.println("- " + quest.getTitle() + ": " + quest.getDescription());
        }
    }

    // Updates NPC interaction
    public void updateNPCInteraction(int npcId, String interaction) {
        System.out.println("Updating interaction for NPC ID " + npcId + ": " + interaction);
    }

    // Handles user commands
    public void handleUserCommand(String command) {
        System.out.println("Processing user command: " + command);
        // Command handling logic here
    }

    // Renders dialogue options (private helper method)
    private void renderDialogueOptions() {
        System.out.println("Rendering dialogue options...");
    }
}
