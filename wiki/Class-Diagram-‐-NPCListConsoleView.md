```mermaid
---
title: NPCListConsoleView
---
    classDiagram
    class NPCListConsoleView {
        - List<NPC> npcList
        + displayNPCs(): void
        + addNPC(npc: NPC): void
        + removeNPC(npcID: int): void
        + getNPC(npcID: int): NPC
    }
    class NPC { 
    }
    NPCListConsoleView --o NPC : aggregation
    
```