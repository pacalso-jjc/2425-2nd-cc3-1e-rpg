```mermaid
---
Title: Character Creation Console View
---
classDiagram
    class CharacterCreationConsoleView {
        +displayCharacterCreationMenu()
        +getUserInput()
        +validateInput()
        +createCharacter()
    }
    
    CharacterCreationConsoleView --> Character
```
