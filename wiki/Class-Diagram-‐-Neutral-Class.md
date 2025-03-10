classDiagram
    class Character {
        - String name
        - int level
        - int health
        + attack()
        + defend()
        + useSkill()
        
    }

    class Neutral_Class {
        + balancedStrike()
        + adaptiveDefense()
    }
  
    Character <|-- Neutral_Class : inherits