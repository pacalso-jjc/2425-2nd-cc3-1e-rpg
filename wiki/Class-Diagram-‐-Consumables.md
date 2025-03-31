```mermaid
---
title: Consumables
---
classDiagram
    Item <-- Consumables

    Consumables : +String name
    Consumables : +int quantity
    Consumables : +consume()
    Consumables : +viewDetails()

```
