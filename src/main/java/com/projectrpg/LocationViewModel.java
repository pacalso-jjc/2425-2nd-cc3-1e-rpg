import java.util.ArrayList;
import java.util.List;

public class LocationViewModel {
    private String name;
    private String description;
    private List<Enemy> enemyList;
    private List<Item> itemList;
    private List<Quest> questList;
    private List<NPC> npcList;

    public LocationViewModel(String name, String description) {
        this.name = name;
        this.description = description;
        this.enemyList = new ArrayList<>();
        this.itemList = new ArrayList<>();
        this.questList = new ArrayList<>();
        this.npcList = new ArrayList<>();
    }

    public String getCoordinates() {
        // Placeholder implementation
        return "X:0, Y:0"; // You can customize this
    }

    public String getAddress() {
        return name + " - " + description;
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

    // Getters and setters if needed
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Enemy> getEnemyList() {
        return enemyList;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public List<Quest> getQuestList() {
        return questList;
    }

    public List<NPC> getNpcList() {
        return npcList;
    }
}
