---
title: World
---

classDiagram
    Class-Diagram--World.md 
    World <|-- City 
    World <|-- Village 
    World <|-- Region 
    
    Region o-- Forest 
    Region o-- Ruin 
    Region o-- Shrine 
    Capital *-- Fort 
    Village -- Forest 
    
    class World {
        - String name
        - String description

        + void describeWorld()
        + int calculateArea()
        + void changeWeather(String newWeather)
        + void updateDescription(String newDesc)
    }

    class Region {
        - String regionName
        - String elementType
        - String musicTheme
        - int monsterLevelRange

        + void describeRegion()
        + void setElement(String element)
        + void spawnMonsters()
        + void playMusic()
    }

    class Capital {
        - String capitalName
        - int population
        - String rulerName
        - boolean hasCastle
        - int goldReserve
        - int defenseLevel

        + void describeCapital()
        + int calculatePopulationDensity()
        + void fortifyCity()
        + void collectTaxes()
        + void holdFestival()
    }

    class City {
        - String cityName
        - int population
        - int guardCount
        - int marketplaceCount
        - boolean hasWalls

        + void describeCity()
        + int calculatePopulationDensity()
        + void patrolCity()
        + void hostTradeFair()
        + void repairWalls()
    }

    class Village {
        - String villageName
        - int population
        - boolean hasBlacksmith
        - boolean hasInn
        - int farmlandSize

        + void describeVillage()
        + int calculateArea()
        + void hostMarketDay()
        + void upgradeBlacksmith()
        + void harvestCrops()
    }

    class Forest {
        - String forestName
        - int treeCount
        - boolean hasMonsters
        - String dominantCreature
        - int dangerLevel

        + void describeForest()
        + int calculateTreeDensity()
        + void spawnCreatures()
        + void clearPathway()
        + void setTrap()
    }

    class Fort {
        - String fortName
        - int soldierCount
        - int wallStrength
        - int weaponStockpile
        - boolean hasMoat

        + void describeFort()
        + int calculateDefenseStrength()
        + void repairWalls()
        + void trainSoldiers()
        + void launchCatapult()
    }

    class Shrine {
        - String shrineName
        - String deity
        - String blessing
        - boolean isSealed

        + void describeShrine()
        + void unlockShrine()
        + void activateBlessing()
        + void sealShrine()
    }

    class Ruin {
        - String ruinName
        - int treasureCount
        - boolean hasBoss
        - String puzzleType
        - int trapCount

        + void exploreRuin()
        + void solvePuzzle()
        + void fightBoss()
        + void collectTreasure()
    }
