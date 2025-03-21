---
title: GameClassDiagram
---
classDiagram
note "Diagram of the game flow, characters, and weapons."

class Game{
    +String gameName
    +int score 
    -startGame()
    +endGame()
    -restartGame()
    -displayGame()
}

class Player{
    +String playerName
    +int health
    +int level 
    +Weapon weapon
    -attack()
    -defend()
    +equipWeapon(Weapon)
    +takeDamage(int)
}

class Enemy{
    +String type 
    +int health
    +int level
    +Weapon weapon
    -attack()
    +takeDamage(int)
    +spawn()
}

class Weapon{
    +String weaponType
    +int damage
    +int durability
    +equip()
    +repair()
}

Game --> Player
Game --> Enemy
Player --> Weapon
Enemy --> Weapon
