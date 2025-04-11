```mermaid
---
title: Weapon Class
---
classDiagram
    class Weapon {
        +int bonusAttack
        +void setBonusAttack(int bonusAttack)
        +int getBonusAttack()
    }
    
    Weapon <|-- Equipment : Inheritance
