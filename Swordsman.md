```mermaid
---
title: Swordsman
---
classDiagram   
    class Swordsman{
        +int swordSkillLevel
        -Sword equippedSword
        +void Attack()
        +void Block()
        +void Counter()
        +void Dodge()
    }
    class Classification {
    }
    Swordsman <|-- Classification : Inheritance
    Character<|-- Swordsman : Inheritance
    Swordsman o-- Sword : Composition
