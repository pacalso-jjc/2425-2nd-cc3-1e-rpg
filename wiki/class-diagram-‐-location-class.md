```mermaid
---
title: Location Class
---
classDiagram
    class Location {
        - name
        - description
        - enemyList
        - itemList
        - questList
        - npcList
        + getCoordinates(): string
        + getAddress(): string
    }
