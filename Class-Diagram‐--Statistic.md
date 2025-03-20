```mermaid
---
title: Statistic
---
classDiagram
class Statistic {
    -int level
    -int experience
    -int hp
    -int strength
    -int speed
    -int defense
    -int stamina
    -int charisma
    -List~Item~ equipment
    -List~Item~ inventory
    +void increaseStat(String statName, int value)
    +void decreaseStat(String statName, int value)
    +void equipItem(Item item)
    +void unequipItem(Item item)
    +void addItemToInventory(Item item)
    +void removeItemFromInventory(Item item)
}