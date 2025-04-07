---
title: MenuViewModel Diagram
---
classDiagram
class MenuViewModel {
    - List<MenuItem> menuOptions
    - MenuItem selectedOption
    - Boolean isVisible
    - String title
    - Style backgroundStyle
    - Map<String, Function> keyBindings
    + showMenu()
    + hideMenu()
    + navigateUp()
    + navigateDown()
    + selectOption()
    + renderMenu()
    + handleInput(key String)
}

class MenuItem {
    - String name
    - Function action 
    - Stringdescription
    - Image icon
    + execute()
}

class Style {
    - String backgroundColor
    - String textColor
    - Int fontSize
    - String animation
}

class Image {
    - String path
    - Int width
    - Int height
}

MenuViewModel --> MenuItem : manages
MenuViewModel --> Style : uses
MenuItem --> Image : has
