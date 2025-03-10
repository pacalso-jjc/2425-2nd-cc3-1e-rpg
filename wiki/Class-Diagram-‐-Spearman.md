```mermaid
---
title: Spearman
---
classDiagram
    class Character {
        +String allegiance
        +String name
        +String sex      
        +int hp
        +int level
        +int exp
        +int strength
        +int speed
        +int defense
        +int stamina
        +int charisma
        +int currency
        +void dealDamage(Character character, int amount)
        +void takeDamage(int amount)
        +boolean isAlive()
        +void move()
    }

    class Spearman {
        +int spearSkillLevel
        -Spear equippedSpear
        +void Attack()
        +void Block()
        +void Counter()
        +void Dodge()
    }

    class Spear {
        +String name
        +int damage
        +float range
    }

    class Classification {
        +string Type
        +list <weapon> availableGear
    }

    Spearman <|-- Classification : Inheritance
    Character <|-- Spearman : Inheritance
    Spearman o-- Spear : Composition
