classDiagram
    class CombatManager {
	-player: Character
	-enemy: Character
	+startCombat(Character p1, Character p2)
	+playerTurn()
	+enemyTurn()
    }

    class Actions {
        -isDefendSuccessful: boolean
        -takesDamage: boolean
        -reducedDamageFromSkill: boolean        
        +execute()
        +normalAttack()
        +heavyAttack()
        +skillAttack()
        +defend()
        +retreat()
        +processDefense()
        +processSkillDefense()
    }

    class Attacks {
        -hasEnoughStamina: boolean
        -attackOutcome: String
        -isCritical: boolean        
        +applyAttack()
        +processCriticalHit()
    }