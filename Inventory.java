public class Inventory {

    private int itemID;
    private String itemName;
    private int quantity;
    private float price;

    public Inventory(int itemID, String itemName, int quantity, float price) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void addItem(int quantity) {
        if (quantity > 0) {
            this.quantity += quantity;
            System.out.println(quantity + " items added to inventory.");
        } else {
            System.out.println("Invalid quantity to add.");
        }
    }

    public void removeItem(int quantity) {
        if (quantity > 0 && this.quantity >= quantity) {
            this.quantity -= quantity;
            System.out.println(quantity + " items removed from inventory.");
        } else if (quantity > 0) {
            System.out.println("Insufficient items in inventory.");
        } else {
            System.out.println("Invalid quantity to remove.");
        }
    }

    public void displayInventory() {
        System.out.println("Item ID: " + itemID);
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
    }
}
