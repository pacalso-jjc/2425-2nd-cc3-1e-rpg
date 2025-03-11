```mermaid
---
title: Spearman
---
classDiagram
    class Character {
    }

    class Spearman {
        +int spearSkillLevel
        -Spear equippedSpear
        +void Attack()
        +void Block()
        +void Counter()
        +void Dodge()
    }
    Character <|-- Spearman : Inheritance
