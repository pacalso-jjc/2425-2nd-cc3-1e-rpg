```mermaid

title: Ahmed
classDiagram
    class ProphetAhmed {
        +String name
        +String role
        +String factionAllegiance
        +String rank
        +List quests
        +List questHooks
        +String currentLocation
        +giveQuest() Quest
        +offerItem(item: Item) void
        +interact() void
        +startQuest(quest: Quest) void
        +completeQuest(quest: Quest) void
        +giveFactionMission() Quest
        +provideFactionAid() void
        +spreadFaith() void
        +captureTerritory() void
    }
  
