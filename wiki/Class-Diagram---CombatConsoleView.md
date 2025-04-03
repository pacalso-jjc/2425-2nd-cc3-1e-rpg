```mermaid
---
Title: Combat Console View
---
classDiagram
    class CombatConsole {
        +CombatLog combatLog
        +HUD hud
        +CombatController combatController
        +renderConsole()
        +updateCombatInfo()
        +handleInput()
    }

    class Player {
        +String name
        +int health
        +int energy
        +List<Skill> skills
        +List<Item> inventory
        +performAction(action: CombatAction)
        +takeDamage(amount: int)
        +useSkill(skill: Skill)
    }

    class Enemy {
        +String name
        +int health
        +int energy
        +int attackPower
        +int defensePower
        +performAction(action: CombatAction)
        +takeDamage(amount: int)
        +useSkill(skill: Skill)
    }

    class CombatAction {
        +ActionType actionType
        +Combatant target
        +execute()
        +calculateDamage()
    }

    class Attack {
        +int damage
        +execute()
        +calculateDamage()
    }

    class Defend {
        +int defenseAmount
        +execute()
        +applyDefense()
    }

    class Skill {
        +String name
        +int manaCost
        +String effect
        +useSkill()
    }

    class CombatLog {
        +List<String> entries
        +addEntry(entry: String)
        +clearLog()
    }

    class CombatController {
        +Combatant currentTurn
        +int turnsTaken
        +nextTurn()
        +checkCombatStatus()
        +handlePlayerAction(action: CombatAction)
    }

    class HUD {
        +int playerHealth
        +int enemyHealth
        +int playerEnergy
        +updateHUD()
        +displayStats()
    }
