```mermaid
---
classDiagram
    class Material {
        - String name
        - String type
        - int quantity
        - String description
        - int weight
        - Boolean isConsumable
        - Boolean isCraftable
        - String rarity
        + useMaterial(): void
        + combineMaterials(material: Material): void
        + getMaterialDetails(): String
        + getMaterialValue(): int
    }

    class Item {
    
    }

    class Consumable {
        
    }

    class Armor {
       
    }

    class Weapon {
    }   

    Material <|-- Item : Inherits
    Item <|-- Consumable : Inherits
    Item <|-- Armor : Inherits
    Item <|-- Weapon : Inherits
