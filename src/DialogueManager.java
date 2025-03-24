   public class DialogueManager {
    private List<Dialogue> dialogues;

    public DialogueManager() {
        dialogues = new ArrayList<>();
    }

    public void addDialogue(Dialogue dialogue) {
        dialogues.add(dialogue);
    }
      
    public void startDialogue(Dialogue dialogue) {
        System.out.println("Starting dialogue: " + dialogue.getText());
    }
}
