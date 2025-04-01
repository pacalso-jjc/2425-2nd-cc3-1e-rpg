public class Item extends GameObject {
    private String type;
    private int value;

    public Item(String name, String description, String type, int value) {
        super(name, description);
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
