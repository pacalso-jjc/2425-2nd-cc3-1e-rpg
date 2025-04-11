import java.util.List;
import java.util.Scanner;

public class LocationListConsoleView {
    private LocationService locationService;
    private int selectedIndex = -1; // No selection by default

    public LocationListConsoleView(LocationService locationService) {
        this.locationService = locationService;
    }

    // Displays the list of locations to the console
    public void displayLocations() {
        clearScreen();
        drawBorder();
        List<Location> locations = locationService.getAllLocations();
        for (int i = 0; i < locations.size(); i++) {
            if (i == selectedIndex) {
                highlightSelectedLocation();
            }
            System.out.println((i + 1) + ". " + locations.get(i).getName() + ": " + locations.get(i).getDescription());
        }
        drawBorder();
    }

    // Prompts the user to select a location
    public int promptForSelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the location to select: ");
        int selection = scanner.nextInt();

        List<Location> locations = locationService.getAllLocations();
        if (selection > 0 && selection <= locations.size()) {
            selectedIndex = selection - 1; // Adjust for zero-based index
            System.out.println("Selected Location: " + locations.get(selectedIndex).getName());
        } else {
            System.out.println("Invalid selection. Please try again.");
        }
        return selectedIndex;
    }

    // Highlights the currently selected location (customize as needed)
    private void highlightSelectedLocation() {
        System.out.println(">> Highlighted Location <<");
    }

    // Draws a border for the console display
    private void drawBorder() {
        System.out.println("=========================================");
    }

    // Clears the console screen
    private void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println(); // Simulates clearing the console
        }
    }
}
