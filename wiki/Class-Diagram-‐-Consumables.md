```mermaid
---
title: Consumables
---
classDiagram
    note "Associated with the Player Class"
    Consumables <|-- FoodItem
    //note for Duck "can fly\ncan swim\ncan dive\ncan help in debugging"
    Consumables <|-- Fish
    Animal <|-- Zebra
    Animal : +int age
    Animal : +String gender
    Animal: +isMammal()
    Animal: +mate()
    class Duck{
        +String beakColor
        +swim()
        +quack()
    }
    class Fish{
        -int sizeInFeet
        -canEat()
    }
    class Zebra{
        +bool is_wild
        +run()
    }
