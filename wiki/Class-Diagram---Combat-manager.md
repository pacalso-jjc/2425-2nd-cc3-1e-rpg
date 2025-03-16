```mermaid
classDiagram
    class CombatManager {
	-player: Character
	-enemy: Character
	+startCombat(Character p1, Character p2)
	+playerTurn()
	+enemyTurn()
    }
```