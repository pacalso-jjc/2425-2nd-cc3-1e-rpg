class Item {
    String name;
    String type;
    int weight;
    int value;

    public Item(String name, String type, int weight, int value) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.value = value;
    }

    public void use() {
        System.out.println("Using item: " + name);
    }
}

class Equipment extends Item {
    int durability;
    boolean isEquipped;

    public Equipment(String name, String type, int weight, int value, int durability) {
        super(name, type, weight, value);
        this.durability = durability;
        this.isEquipped = false;
    }

    public void equip() {
        isEquipped = true;
        System.out.println(name + " is now equipped.");
    }

    public void unequip() {
        isEquipped = false;
        System.out.println(name + " is now unequipped.");
    }

    public void repair() {
        System.out.println(name + " has been repaired.");
    }
}

class Consumable extends Item {
    String effect;
    int duration;
    boolean isStackable;

    public Consumable(String name, String type, int weight, int value, String effect, int duration, boolean isStackable) {
        super(name, type, weight, value);
        this.effect = effect;
        this.duration = duration;
        this.isStackable = isStackable;
    }

    public void consume() {
        System.out.println("Consumed " + name + ". Effect: " + effect + " for " + duration + " seconds.");
    }
}

class KeyItem extends Item {
    String description;
    boolean isQuestItem;

    public KeyItem(String name, String type, int weight, int value, String description, boolean isQuestItem) {
        super(name, type, weight, value);
        this.description = description;
        this.isQuestItem = isQuestItem;
    }

    public void use() {
        System.out.println("Using key item: " + name + " - " + description);
    }
}
