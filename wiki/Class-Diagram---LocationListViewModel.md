```mermaid
classDiagram
    class LocationListViewModel {
        -locations: String[]
        -selectedIndex: int
        +load() void
        +select(index: int) void
    }
```