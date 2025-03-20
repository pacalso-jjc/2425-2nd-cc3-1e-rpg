```mermaid
---
title: Character
---
classDiagram
    Character : -String name
    Character : -String sex
    Character : -String allegiance
    Character : -Classification class
    Character : -int level
    Character : -int experience
    Character : -int hp
    Character : -int strength
    Character : -int speed
    Character : -int defense
    Character : -int stamina
    Character : -int charisma
    Character : -List equipment
    Character : -List inventory<list>
    Character : +isPlayer()
    Character : +dealDamage(character,amount)
    Character : +takeDamage(amount)
    Character : +isAlive()
    Character : +move()
    Character : +speak()

    
```