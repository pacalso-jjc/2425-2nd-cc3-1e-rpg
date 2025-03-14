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
        + increaseQuantity(amount: int): void
        + decreaseQuantity(amount: int): void
        + getRarityValue(): int
        + setMaterialDurability(durability: int): void
    
    }

    class Consumable {
        
    }

    class Armor {
       
    }

    class Weapon {
    }   

    Material -- Item : Association
    Item <|-- Consumable : Inherits
    Item <|-- Armor : Inherits
    Item <|-- Weapon : Inherits
