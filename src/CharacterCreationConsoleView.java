import java.util.Scanner;

public class CharacterCreationConsoleView {
    
    private Scanner scanner;

    public CharacterCreationConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayCharacterCreationMenu() {
        System.out.println("Welcome to Character Creation!");
        System.out.println("1. Create Character");
        System.out.println("2. Exit");
    }

    public String getUserInput() {
        return scanner.nextLine();
    }

    public boolean validateInput(String input) {
        return input.equals("1") || input.equals("2");
    }

    public Character createCharacter() {
        System.out.print("Enter character name: ");
        String name = getUserInput();
        Character character = new Character(name);
        return character;
    }
}

class Character {
    private String name;

    public Character(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Character Name: " + name);
    }
}
