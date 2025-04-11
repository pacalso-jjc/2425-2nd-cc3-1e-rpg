```mermaid
---
title: Trade Console View
---

classDiagram
    class TradeConsoleView {
        +startTrade(character: Character)
        +endTrade()
        +displayTradeItems()
        +confirmTrade()
    }

    TradeConsoleView --> Character : interacts with
    Character --> Item : has
```
