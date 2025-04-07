---
title: MenuViewModel Diagram
---
classDiagram
class MenuViewModel {
    - menuOptions : List<MenuItem>
    - selectedOption : MenuItem
    - isVisible : Boolean
    - title : String
    - backgroundStyle : Style
    - keyBindings : Map<String, Function>
    + showMenu() : void
    + hideMenu() : void
    + navigateUp() : void
    + navigateDown() : void
    + selectOption() : void
    + renderMenu() : void
    + handleInput(key : String) : void
}

class MenuItem {
    - name : String
    - action : Function
    - description : String
    - icon : Image
    + execute() : void
}

class Style {
    - backgroundColor : String
    - textColor : String
    - fontSize : Int
    - animation : String
}

class Image {
    - path : String
    - width : Int
    - height : Int
}

MenuViewModel --> MenuItem : manages
MenuViewModel --> Style : uses
MenuItem --> Image : has