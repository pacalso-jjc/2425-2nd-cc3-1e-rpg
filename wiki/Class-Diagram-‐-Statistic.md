```mermaid
---
title: Statistic
---
classDiagram
class Statistic {
    -int strength
    -int speed
    -int defense
    -int stamina
    -int charisma
    +void increaseStat(String statName, int value)
    +void decreaseStat(String statName, int value)
}
-
