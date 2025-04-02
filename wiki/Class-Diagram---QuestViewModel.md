```mermaid
classDiagram
    class QuestViewModel {
        -title: String
        -description: String
        -isCompleted: boolean
        +updateCompletion(): void
        +displayQuest(): void
    }
```