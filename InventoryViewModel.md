```mermaid
title: Inventory View Model 
---
classDiagram
   class InventoryViewModel {
        +List<String> items
        +String selectedItem
        +void getItems()
        +void addItem(String item)
        +void removeItem(String item)
        +void selectItem(String item)
        +void updateItem(String oldItem, String newItem)
    }
```    
