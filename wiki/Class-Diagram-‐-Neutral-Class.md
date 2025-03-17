# Neutral Class

classDiagram
    class Neutral {
        +String name
        +String type
        +String description
        +int health
        +int strength
        +int defense
        +void interact()
        +void takeDamage(int damage)
        +void heal(int amount)
    }

    class Quest {
        +String questName
        +String questDescription
        +void startQuest()
        +void completeQuest()
    }

    class Item {
        +String itemName
        +int itemValue
        +void useItem()
    }

    Neutral "0..*" --|> Quest : Offers
    Neutral "0..*" --|> Item : Carries
