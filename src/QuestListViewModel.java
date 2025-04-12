public class QuestListViewModel {
    private Quest[] quests;
    private int selectedQuestId;

    public void loadQuests() {
        // Implementation for loading quests
    }

    public void selectQuest(int id) {
        this.selectedQuestId = id;
    }

    public void completeQuest() {
        // Implementation for completing the selected quest
    }
}
