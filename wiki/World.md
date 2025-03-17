---
title: World
---

classDiagram
    Class-Diagram--World.md <|-- Capital : extends
    World <|-- City : extends
    World <|-- Village : extends
    World <|-- Region : extends
    
    Region o-- Forest : contains
    Region o-- Ruin : contains
    Region o-- Shrine : contains
    Capital *-- Fort : protects
    Village -- Forest : borders
    
    class World {
        - String name
        - int width
        - int length
        - String description
        - String environment

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

# Setting
This world is set in a medieval period parallel to our own, during an era reminiscent of the Crusades. The setting revolves around a struggle between two powerful factions vying for control over the neutral land of Yrmania.

Factions
Borisya & The Faith of Thomasia:

Borisya is a powerful theocratic state, mirroring the Holy Roman Empire, and is the birthplace of Thomasia, a strict faith centered around the deity Saint Thomas—a divine figure prophesied to one day return and save the nation. The faith is not just a religion but an inseparable part of Borisyan identity, deeply ingrained in its politics and military.

The leader of Borisya is the Cult of Saint Thomas Borisya, a figure regarded as the living embodiment of Thomasian faith and the ultimate authority in both religious and military matters. Under their rule, Borisya has become a dominant power, with a well-funded military that fights under the banner of Thomasia.

Borisya’s current objective is the annexation of Yrmania—first through religious conversion and political influence, but with military force if necessary. By the time the game begins, Borisya has already established a strong foothold in Yrmania’s nobility.

Ahmed’s Legion & The Invasion from Hammerfell:

Ahmed’s Legion is an invading force from Hammerfell, a distant land facing imminent famine and societal collapse. Their leader, Ahmed, seeks to secure the fertile lands of Yrmania to ensure his people's survival while also spreading his own faith.

Ahmed’s Legion is a brutal yet highly organized military force, relying on speed, mobility, and devastating cavalry tactics. Their warfare is characterized by swift, lightning-fast raids rather than prolonged sieges or traditional battles. However, compared to Borisya, their forces are lightly equipped and lack substantial financial resources. Ahmed’s Legion is a fusion of Mongol-like nomadic warfare with elements inspired by Middle Eastern military strategy.

The Battleground: Yrmania

Yrmania is the central setting of the conflict—a neutral land with no strong allegiance to any faith or foreign power. It is known for its fertile soil and strategic importance, making it the perfect prize for both Borisya and Ahmed’s Legion.

Despite its neutrality, Yrmania is caught in the middle of an unavoidable struggle. Borisya has already infiltrated its nobility, and Ahmed’s Legion is prepared for full-scale invasion. With war looming on all sides, Yrmania must decide whether to resist, submit, or carve its own destiny in the face of religious and military conquest. 

# Locations
Capital: The capital acts like the trading hub and central area for the entire state of Yrmania, and also the pseudo-"base of operations" for the Thomasian faith in the region. It is a brewing melting pot of different cultures, races, faiths, and beliefs. On top of this, it is also the biggest location present in Yrmania. But who knows what the fate of the capital is after the game takes place?

Upper City: This region of the capital serves as the residential area of Yrmania's nobility and the rich. This is also where the keep that houses the royal family (A.K.A the government of the entire region) is located. No one knows it yet, but the Upper City will be one of if not the most crucial and key locations that will decide the fate of the entire region.

Undercity Catacombs: Beneath the capital lies its festering and forgotten undergrounds: the Undercity Catacombs. This area is a sprawling and interconnected network of prisons, catacombs, and criminal guilds but only a part of it will be explorable by the player. If the player dares, a vile but unique and interesting faction can be found if the player knows just where to look.

Lower District: This is a separate district a bit west of the capital that houses most of Yrmania's middle class population. Life is good in normalcy, but will that comfort change with the entry of the Legion of Ahmed or the Thomasian expansion?

Heretic Tower: Thomasia, known to be a strict but seemingly benevolent faith, is no stranger to excommunication, but the Thomasians in Yrmania take it a step further by banishing those they deemed heretical or blasphemous enough to the Heretic Tower, a cramped space that almost acts as a prison for people that the local Thomasians have banished.

Thomasia Pilgrimage Site: Opposite just from the Heretic Tower would be Thomasia's own pilgrimage site. Tens if not hundreds of devotees flock to this area to practice their faith and march up thousands of steps to prove their dedication.

Caravan Company: Most people leave Yrmania by carriage, so the local Caravan Company is there to fulfill the purpose of organizing transport between regions, somewhat like the bus terminal or an airport.

Summonwater Village: This is a small offshoot from the small village of Wuthering Village, which is the start of the game proper. Summonwater is unfortunately a village as unremarkable as Wuthering, but who knows if something may surface?

Fort Faroth: To the southwest of the capital lies the gargantuan Fort Faroth, which contains almost all of the state's military and is overseen by Quartermaster A'jak'nir Jeera. As the war draws ever closer to its climax and then conclusion, who knows how the state's army is going to react?

Ahmed Encampment: The base of operations for the Legion of Ahmed. In the center of such lies a great war tent wherein Ahmed sleeps, prays, meditates, trains, and prepares for the oncoming war with Thomasia.

Slums: Not all states are filled to the brim with happy and content people. The slums, for instance, are filled to the brim with the states destitute, poor, and is infested with crime and violence. Little did they know that they would be just as involved in the war as the two main factions.
Wilderness: The distant forest where wild animals roam and laws do not reach.

Wuthering Village (Starting Area): This small town is where the player character enters Yrmania for the first time and is also the first area that the Legion of Ahmed captures.
