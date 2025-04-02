```mermaid
classDiagram
    class Dialogue {
        +String text
        +List<Choice> choices
        +next(): Dialogue
    }

    class Choice {
        +String text
        +Dialogue nextDialogue
        +executeAction(): void
    }
```