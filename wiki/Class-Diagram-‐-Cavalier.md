```mermaid
---
title: Cavalier Class
---
classDiagram
    Classification --|> Cavalier
    class Cavalier {
        -int hp
        -int damage
        -int armor
        -int initiative
        +charge()
        +pursue()
    }
```