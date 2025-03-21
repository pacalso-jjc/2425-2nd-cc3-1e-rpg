public class Item {
    private String name;
    private String type;
    private int weight;
    private int value;

    public Item(String name, String type, int weight, int value) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return "Item{name='" + name + "', type='" + type + "', weight=" + weight + ", value=" + value + "}";
    }
}
