---
title: Weapon Class
---
classDiagram
    class Weapon {
        -String name
        -int damage
        -double weight
        -double size
        -String material
        -String rarity
        +attack()
        +displayInfo()
    }
    Weapon <-- Sword
    class Sword{
        -double bladeLength
        -boolean twoHanded
        +slash()
    }
    Weapon <-- Spear
    class Spear{
        -double reach
        +thrust()
    }
    Weapon <-- Dagger
    class Dagger{
        -stealthBonus
        -boolean twoHanded
        +stab()
    }
    Weapon <-- Hammer
    class Hammer{
        -double impactForce
        +smash()
    }
    Weapon <-- Axe
    class Axe{
        -double chopPower
        +chop()
    }
    Weapon <-- Mace
    class Mace{
        -double impactForce
        +crush()
    }
    Weapon <-- Bow
    class Bow{
        -int range
        -int drawSpeed
        +shoot()
    }
    Weapon <-- Crossbow
    class Crossbow{
        int range
        -int reloadTime
        +shoot()
    }
    class Material{
        wood
        stone
        iron
        steel
        bronze
        mythril
        adamantite
        dragonbone
        obsidian
        silver
        enchanted_crystal
    }
    class Rarity{
        common
        rare
        epic
        legendary
    }
```