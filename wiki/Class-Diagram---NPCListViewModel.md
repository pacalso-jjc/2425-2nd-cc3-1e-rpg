```mermaid

class NPCListViewModel {
    -List~NPCViewModel~ npcList
    +void addNPC(NPCViewModel npc)
    +void removeNPC(NPCViewModel npc)
    +List~NPCViewModel~ getAllNPCs()
    +void clearAllNPCs()
    +void displayAllNPCSummaries()
}

```