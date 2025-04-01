classDiagram
    class Quest {
        - int questID
        - String title
        - String description
        - String status
        - Reward reward
        + void complete()
    }

    class Reward {
        - int gold
        - List<String> items
        + void addGold(int amount)
        + void addItem(String item)
    }

    Quest --> Reward
