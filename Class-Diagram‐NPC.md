```mermaid
---
title: NPC
---
classDiagram
class NPC {
    -int levelOfHostility
    -List~String~ availableQuests
    +void interact()
}
NPC <|-- Character : Inheritance
