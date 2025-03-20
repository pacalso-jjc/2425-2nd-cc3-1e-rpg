title: Classification Class
---
classDiagram
    class Merchant {
    +String name
    +int level
    +int gold
    +List~Item~ inventory
    +void buy(Item item)
    +void sell(Item item)
    +void manageInventory()
}
