import java.util.HashMap;
import java.util.Map;

public class SettingsConsoleView {

    // Simulated settings storage
    private Map<String, String> settings = new HashMap<>();

    // Constructor
    public SettingsConsoleView() {
        loadSettings(); // Initialize settings when the object is created
    }

    // Public method to display current settings
    public void displaySettings() {
        System.out.println("Current Settings:");
        if (settings.isEmpty()) {
            System.out.println("No settings available.");
        } else {
            settings.forEach((key, value) -> System.out.println(key + ": " + value));
        }
    }

    // Public method to update specific settings
    public void updateSettings() {
        System.out.println("Updating settings...");
        settings.put("Theme", "Dark Mode"); // Example of updating a setting
        settings.put("Volume", "Low");     // Example of updating another setting
        System.out.println("Settings updated.");
    }

    // Public method to reset all settings
    public void resetSettings() {
        System.out.println("Resetting settings...");
        settings.clear();
        System.out.println("Settings have been reset to default.");
    }

    // Private method to load initial settings
    private void loadSettings() {
        System.out.println("Loading initial settings...");
        settings.put("Theme", "Light Mode");
        settings.put("Volume", "Medium");
        System.out.println("Default settings loaded.");
    }

    // Private method to save current settings
    private void saveSettings() {
        System.out.println("Saving settings...");
        // Simulation of saving settings to a persistent storage
        System.out.println("Settings saved successfully.");
    }

    // Main method for demonstration
    public static void main(String[] args) {
        SettingsConsoleView settingsView = new SettingsConsoleView();

        settingsView.displaySettings();   // Display initial settings
        settingsView.updateSettings();    // Update settings
        settingsView.displaySettings();   // Display updated settings
        settingsView.saveSettings();      // Save the settings
        settingsView.resetSettings();     // Reset settings
        settingsView.displaySettings();   // Display reset settings
    }
}
