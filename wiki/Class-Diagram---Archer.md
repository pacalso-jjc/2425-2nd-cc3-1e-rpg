```mermaid
---
title: Archer Class
---
classDiagram
    Classification --|> Archer
    class Archer {
        -int hp
        -int damage
        -int armor
        -int initiative
        -int accuracy
        +steadyAim()
        +arrowRain()
        +snipe()
    }
```