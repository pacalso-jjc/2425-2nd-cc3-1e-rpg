import java.util.List;

public class CharacterCreationViewModel {
    private String characterName;
    private String characterClass;
    private int characterLevel;
    private List<String> availableClasses;

    public void createCharacter() {
        // Implementation for character creation
    }

    public void validateCharacterName() {
        // Implementation for validating character name
    }

    public void selectCharacterClass() {
        // Implementation for selecting character class
    }

    public void levelUp() {
        // Implementation for leveling up the character
    }

    // Getters and Setters
    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(int characterLevel) {
        this.characterLevel = characterLevel;
    }

    public List<String> getAvailableClasses() {
        return availableClasses;
    }

    public void setAvailableClasses(List<String> availableClasses) {
        this.availableClasses = availableClasses;
    }
}
