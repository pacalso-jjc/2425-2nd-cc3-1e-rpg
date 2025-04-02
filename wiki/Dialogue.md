import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dialogue {
    private String characterName;
    private List<String> lines;
    private Map<Integer, Dialogue> choices; // Key: Choice ID, Value: Next Dialogue

    public Dialogue(String characterName) {
        this.characterName = characterName;
        this.lines = new ArrayList<>();
        this.choices = new HashMap<>();
    }

    public void addLine(String line) {
        lines.add(line);
    }

    public void addChoice(int choiceId, Dialogue nextDialogue) {
        choices.put(choiceId, nextDialogue);
    }

    public Dialogue getNextDialogue(int choiceId) {
        return choices.getOrDefault(choiceId, null);
    }

    public String getCharacterName() {
        return characterName;
    }

    public List<String> getLines() {
        return lines;
    }

    public Map<Integer, Dialogue> getChoices() {
        return choices;
    }
}
