```mermaid
---
title: Armor Class
---
classDiagram
    class Armor {
        +int bonusDefense
        +void setBonusDefense(int bonusDefense)
        +int getBonusDefense()
    }
    
    Armor <|-- Item : Inheritance
