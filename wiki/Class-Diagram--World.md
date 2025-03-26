---
title: World
---

classDiagram
    Class-Diagram--World.md 
    World <|-- City 
    World <|-- Village 
    World <|-- Region 
    
    Region o-- Forest 
    Region o-- Ruin 
    Region o-- Shrine 
    Capital *-- Fort 
    Village -- Forest 
    
    class World {
        - String name
        - String description

        + void describeWorld()
        + int calculateArea()
        + void changeWeather(String newWeather)
        + void updateDescription(String newDesc)
    }
