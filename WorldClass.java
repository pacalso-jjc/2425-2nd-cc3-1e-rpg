public class World {
private String name;
private String description;

public World(String name, String description) {
    this.name = name;
    this.description = description;
}

public void describeWorld() {
    System.out.println("World: " + name);
    System.out.println("Description: " + description);
}

public int calculateArea() {
    // Placeholder method: logic to calculate area would go here
    return 0;
}

public void changeWeather(String newWeather) {
    System.out.println("The weather has changed to: " + newWeather);
}

public void updateDescription(String newDesc) {
    this.description = newDesc;
}
}
