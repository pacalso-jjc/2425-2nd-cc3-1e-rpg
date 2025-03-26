```mermaid
---
title: Dialogue Manager
---
classDiagram
    class DialogueManager {
        +List<Dialogue> dialogues
        +void addDialogue(Dialogue dialogue)
        +Dialogue getDialogue(String text)
        +void startDialogue(Dialogue dialogue)
    }
```
