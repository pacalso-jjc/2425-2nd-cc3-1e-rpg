classDiagram
    class MenuConsoleView {
        -options: String[]
        -selectedIndex: int
        +display(): void
        +handleInput(): void
        +getSelection(): int
    }