import java.util.Scanner;

public class InventoryConsoleView {
    private Inventory inventory;
    private Scanner scanner;

    public InventoryConsoleView(Inventory inventory) {
        this.inventory = inventory;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    displayInventory();
                    break;
                case 4:
                    System.out.println("Exiting inventory menu.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addItem() {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        System.out.print("Enter item description: ");
        String description = scanner.nextLine();
        System.out.print("Enter item type: ");
        String type = scanner.nextLine();
        System.out.print("Enter item value: ");
        int value = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Item newItem = new Item(name, description, type, value);
        inventory.addItem(newItem);
    }

    private void removeItem() {
        System.out.print("Enter item name to remove: ");
        String name = scanner.nextLine();
        // Assuming Item has a method to get its name
        Item itemToRemove = null;
        for (Item item : inventory.getItems()) {
            if (item.getName().equalsIgnoreCase(name)) {
                itemToRemove = item;
                break;
            }
        }

        if (itemToRemove != null) {
            inventory.removeItem(itemToRemove);
        } else {
            System.out.println("Item not found in inventory.");
        }
    }

    private void displayInventory() {
        inventory.displayInventory();
    }
}