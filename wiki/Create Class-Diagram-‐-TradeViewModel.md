``` mermaid
---
title: Dialogue Tree Class
---
classDiagram
    class DialogueTree {
        +String greeting
        +NPC npc
        +void startDialogue()
        +void talkToNPC()
    }

    class NPC {
        +String name
        +String dialogue
        +void speak(String message)
    }

    DialogueTree --> NPC : Contains

```
