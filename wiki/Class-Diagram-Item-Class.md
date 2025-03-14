classDiagram
  class Item {
    +String name
    +String description
    +int weight
    +int value
    +String rarity
    +String material
    +use() void
    +sell() int
  }

  class Weapon {
    +int damage
    +int durability
    +String weaponType
    +attack() void
    +repair() void
  }

  class Armor {
    +int defense
    +int durability
    +String armorType
    +equip() void
    +repair() void
  }

  class Potion {
    +String effect
    +int potency
    +int duration
    +drink() void
  }

  class Scroll {
    +String spell
    +int manaCost
    +castSpell() void
  }

  class Ring {
    +String effect
    +boolean isCursed
    +wear() void
    +remove() void
  }

  Item <|-- Weapon
  Item <|-- Armor
  Item <|-- Potion
  Item <|-- Scroll
  Item <|-- Ring
