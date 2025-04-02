import java.util.ArrayList;
import java.util.List;

public class Location {
    private String name;
    private String description;
    private List<Enemy> enemyList;
    private List<Item> itemList;
    private List<Quest> questList;
    private List<NPC> npcList;

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
        this.enemyList = new ArrayList<>();
        this.itemList = new ArrayList<>();
        this.questList = new ArrayList<>();
        this.npcList = new ArrayList<>();
    }

    public String getCoordinates() {
        // Dummy placeholder method, replace with real logic
        return "0.0000, 0.0000";
    }

    public String getAddress() {
        // Dummy placeholder method, replace with real logic
        return "Unknown Address";
    }

    public void addEnemy(Enemy enemy) {
        enemyList.add(enemy);
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void addQuest(Quest quest) {
        questList.add(quest);
    }

    public void addNPC(NPC npc) {
        npcList.add(npc);
    }

    // Getters and setters for name and description (optional)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
