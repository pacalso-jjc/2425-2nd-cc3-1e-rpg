import java.util.Scanner;

public class MainMenuConsoleView {
    private Scanner scanner;

    public MainMenuConsoleView() {
        scanner = new Scanner(System.in);
    }

    // Displays the main menu for a medieval game
    public void displayMenu() {
        System.out.println("=== Menu ===");
        System.out.println("1. Start New Quest");
        System.out.println("2. Load Saved Game");
        System.out.println("3. View Character Stats");
        System.out.println("4. Exit Game");
        System.out.print("Enter your choice: ");
    }

    // Gets input from the user
    public String getUserInput() {
        return scanner.nextLine();
    }

    // Shows an error message
    public void showError(String message) {
        System.out.println("⚠️ Error: " + message);
    }
}
