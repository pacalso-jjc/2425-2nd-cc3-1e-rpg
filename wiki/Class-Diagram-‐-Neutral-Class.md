classDiagram

    class Neutral {
        + balancedStrike()
        + adaptiveDefense()
    }
  
    Character <|-- Neutral : inherits