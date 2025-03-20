```mermaid
---
title: Swordsman
---
classDiagram
    class Character {
        
    }
    class Swordsman{
        +int swordSkillLevel
        -Sword equippedSword
        +void Attack()
        +void Block()
        +void Counter()
        +void Dodge()
    }
  class Sword{
        +String name
        +int damage
        +float range
    }
    class Classification {
    }
    Swordsman <|-- Classification : Inheritance
    Character<|-- Swordsman : Inheritance
    Swordsman o-- Sword : Composition
