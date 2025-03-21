```mermaid
---
title: Consumables
---
classDiagram
    note "Associated with the Player Class"
    Player <-- Consumables

    Consumables : +String name
    Consumables : +int quantity
    Consumables : +consume()
    Consumables : +viewDetails()
