import java.util.ArrayList;
import java.util.List;

public class Location extends GameObject {
    private String name;
    private String description;
    private int coordinate;
    private List<Enemy> enemyList;
    private List<Item> itemList;
    private List<Quest> questList;
    private List<NPC> npcList;

    public Location(String name, String description, int coordinate) {
        this.name = name;
        this.description = description;
        this.coordinate = coordinate;
        this.enemyList = new ArrayList<>();
        this.itemList = new ArrayList<>();
        this.questList = new ArrayList<>();
        this.npcList = new ArrayList<>();
    }

    public int getCoordinate() {
        return coordinate;
    }

    // Optionally add setters and other getters if needed
}
