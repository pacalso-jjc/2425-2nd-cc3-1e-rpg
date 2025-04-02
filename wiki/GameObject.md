```mermaid
title: GameObject Class
---
classDiagram
    class GameObject {
        +int id
        +String name
        +Vector2D position
        +bool isActive
        +update(): void
        +render(): void
        +destroy(): void
    }
```