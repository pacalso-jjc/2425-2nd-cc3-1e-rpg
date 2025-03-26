import java.util.ArrayList;
import java.util.List;

class Inventory {
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Added item: " + item.getName());
    }

    public void removeItem(Item item) {
        if (items.remove(item)) {
            System.out.println("Removed item: " + item.getName());
        } else {
            System.out.println("Item not found: " + item.getName());
        }
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (Item item : items) {
            System.out.println("- " + item.getName() + " (Type: " + item.getType() + ", Weight: " + item.getWeight() + ", Value: " + item.getValue() + ")");
        }
    }
}