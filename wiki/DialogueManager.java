   public class DialogueManager {
    private List<Dialogue> dialogues;

    public DialogueManager() {
        dialogues = new ArrayList<>(); // Initialize the List
    }

    public void addDialogue(Dialogue dialogue) {
        dialogues.add(dialogue);
    }

    public Dialogue getDialogue(String text) {
        for (Dialogue dialogue : dialogues) {
            if (dialogue.getText().equals(text)) {
                return dialogue;
            }
        }
        return null;
    }

    public void startDialogue(Dialogue dialogue) {
        System.out.println("Starting dialogue: " + dialogue.getText());
    }
}