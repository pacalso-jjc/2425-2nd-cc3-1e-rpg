```mermaid
---
title: Armor Class
---
classDiagram
    class Item {
    }

    class Armor {
        +int defense
    }
    
    Armor <|-- Item : Inheritance