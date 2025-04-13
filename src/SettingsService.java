public class SettingsService {
    private boolean isEnabled;
    private String language;
    private int volume;
    private String theme;

    public SettingsService() {
        this.isEnabled = true; // Default value
        this.language = "English"; // Default value
        this.volume = 50; // Default value
        this.theme = "Light"; // Default value
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void toggleSetting() {
        this.isEnabled = !this.isEnabled;
    }

    public String getSettings() {
        return "Settings: [Enabled: " + isEnabled + ", Language: " + language + 
               ", Volume: " + volume + ", Theme: " + theme + "]";
    }
}
