import java.util.List;

// Represents an Item class
class Item {
    private String name;
    private int value;

    public Item(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}

// Represents a Character class that has items
class Character {
    private String name;
    private List<Item> inventory;

    public Character(String name, List<Item> inventory) {
        this.name = name;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public List<Item> getInventory() {
        return inventory;
    }
}

// Implements the TradeConsoleView
public class TradeConsoleView {
    private Character tradingPartner;
    private boolean tradeActive;

    // Start a trade with a character
    public void startTrade(Character character) {
        this.tradingPartner = character;
        this.tradeActive = true;
        System.out.println("Trade started with " + character.getName() + ".");
    }

    // End the trade session
    public void endTrade() {
        if (tradeActive) {
            this.tradingPartner = null;
            this.tradeActive = false;
            System.out.println("Trade ended.");
        } else {
            System.out.println("No trade is currently active.");
        }
    }

    // Display the trade partner's items
    public void displayTradeItems() {
        if (tradeActive && tradingPartner != null) {
            System.out.println(tradingPartner.getName() + "'s Inventory:");
            for (Item item : tradingPartner.getInventory()) {
                System.out.println("- " + item.getName() + " (Value: " + item.getValue() + ")");
            }
        } else {
            System.out.println("No active trade or trading partner.");
        }
    }

    // Confirm the trade
    public void confirmTrade() {
        if (tradeActive) {
            System.out.println("Trade confirmed with " + tradingPartner.getName() + "!");
            // Logic to finalize trade goes here
        } else {
            System.out.println("No active trade to confirm.");
        }
    }
}
