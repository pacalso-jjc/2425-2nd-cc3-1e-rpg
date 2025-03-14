```mermaid
---
title: Material Class
---
classDiagram
    class Material {
        - String name
        - String type
        - int quantity
        - String description
        - int value
        - String rarity
        - Boolean isConsumable
        - int durability
        - String materialCategory
        + combineMaterials(material: Material): void
        + useMaterial(): void
        + getMaterialDetails(): String
        + getMaterialValue(): int

   Material --|> Item : Inheritance
    
