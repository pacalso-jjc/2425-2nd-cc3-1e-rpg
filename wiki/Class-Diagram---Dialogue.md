classDiagram
    class Dialogue {
        +String dialogueText
        +Date dateCreated
        +addOption(option: String): void
        +getDialogueText(): String
    }