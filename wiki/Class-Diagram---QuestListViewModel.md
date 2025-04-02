```mermaid
classDiagram
    class QuestListViewModel {
        -quests: Quest[]
        -selectedQuestId: int
        +loadQuests() void
        +selectQuest(id: int) void
        +completeQuest() void
    }