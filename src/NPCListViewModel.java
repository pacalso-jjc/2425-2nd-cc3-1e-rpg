import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class NPCListViewModel {
    // The list of NPCViewModel objects
    private List<NPCViewModel> npcList = new ArrayList<>();
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    // Adds a listener to observe property changes
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    // Removes a listener
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    // Adds an NPC to the list and notifies listeners
    public void addNPC(NPCViewModel npc) {
        List<NPCViewModel> oldList = new ArrayList<>(npcList);
        npcList.add(npc);
        support.firePropertyChange("npcList", oldList, new ArrayList<>(npcList));
    }

    // Removes an NPC from the list and notifies listeners
    public void removeNPC(NPCViewModel npc) {
        List<NPCViewModel> oldList = new ArrayList<>(npcList);
        if (npcList.remove(npc)) {
            support.firePropertyChange("npcList", oldList, new ArrayList<>(npcList));
        }
    }

    // Returns all NPCs in the list
    public List<NPCViewModel> getAllNPCs() {
        return new ArrayList<>(npcList); // Return a copy to preserve encapsulation
    }

    // Clears all NPCs from the list and notifies listeners
    public void clearAllNPCs() {
        List<NPCViewModel> oldList = new ArrayList<>(npcList);
        npcList.clear();
        support.firePropertyChange("npcList", oldList, new ArrayList<>(npcList));
    }

    // Displays summaries of all NPCs in the list
    public void displayAllNPCSummaries() {
        if (npcList.isEmpty()) {
            System.out.println("No NPCs in the list.");
        } else {
            System.out.println("NPC Summaries:");
            for (NPCViewModel npc : npcList) {
                System.out.println(npc.getNPCSummary());
            }
        }
    }
}
