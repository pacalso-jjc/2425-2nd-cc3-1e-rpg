classDiagram
    class Quest {
        -int questID
        -String title
        -String description
        -String status
        -Reward reward
        +complete() void
    }

    class Reward {
        -int gold
        -List~String~ items
        +addGold(amount int) void
        +addItem(item String) void
    }