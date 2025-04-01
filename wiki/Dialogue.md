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

    public void startDialogue() {
        System.out.println(characterName + " says:");
        for (String line : lines) {
            System.out.println(line);
        }

        if (!choices.isEmpty()) {
            System.out.println("Choose an option:");
            for (Map.Entry<Integer, Dialogue> entry : choices.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue().getFirstLine());
            }
        } else {
            System.out.println("End of conversation.");
        }
    }

    public Dialogue getNextDialogue(int choiceId) {
        return choices.getOrDefault(choiceId, null);
    }

    public String getFirstLine() {
        return lines.isEmpty() ? "" : lines.get(0);
    }

    public static void main(String[] args) {
        // Example usage
        Dialogue introDialogue = new Dialogue("Old Sage");
        introDialogue.addLine("Welcome, traveler.");
        introDialogue.addLine("What brings you to this ancient land?");

        Dialogue option1Dialogue = new Dialogue("Old Sage");
        option1Dialogue.addLine("Ah, seeking adventure, are you?");
        option1Dialogue.addLine("Be careful, the path ahead is treacherous.");

        Dialogue option2Dialogue = new Dialogue("Old Sage");
        option2Dialogue.addLine("Wisdom, you say?");
        option2Dialogue.addLine("Then listen closely...");

        introDialogue.addChoice(1, option1Dialogue);
        introDialogue.addChoice(2, option2Dialogue);

        // Start the dialogue
        introDialogue.startDialogue();

        // Simulate player choice
        int playerChoice = 1; // Assume player chooses option 1
        Dialogue nextDialogue = introDialogue.getNextDialogue(playerChoice);

        if (nextDialogue != null) {
            nextDialogue.startDialogue();
        }
    }
}