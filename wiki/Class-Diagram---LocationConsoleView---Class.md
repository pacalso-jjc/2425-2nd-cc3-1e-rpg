```mermaid

    class LocationConsoleView {
        - location: Location

        + LocationConsoleView(location: Location)
        + displayLocationInfo(): void
        + displayEnemies(): void
        + displayItems(): void
        + displayQuests(): void
        + displayNPCs(): void
    }
```