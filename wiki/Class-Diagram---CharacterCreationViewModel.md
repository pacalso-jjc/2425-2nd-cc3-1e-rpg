```mermaid
---
title: Character Creation View Model
---
classDiagram
    class CharacterCreationViewModel {
        +String characterName
        +String characterClass
        +int characterLevel
        +List<String> availableClasses
        +void createCharacter()
        +void validateCharacterName()
        +void selectCharacterClass()
        +void levelUp()
    }
```
