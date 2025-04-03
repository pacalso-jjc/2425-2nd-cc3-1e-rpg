```mermaid
---
title: Settings
---
classDiagram
    class Setting {
        +String name
        +String type
        +List~NPC~ npcs
        +List~Item~ items
        +addNPC(npc: NPC): void
        +removeNPC(npc: NPC): void
        +addItem(item: Item): void
        +removeItem(item: Item): void
    }

    
```
