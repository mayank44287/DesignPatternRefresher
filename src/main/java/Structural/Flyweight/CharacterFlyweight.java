package Structural.Flyweight;

// Interface defining character functionality
interface Character {
    void draw(char c, int x, int y);
}

// Flyweight representing a character with intrinsic state
class CharacterFlyweight implements Character {
    private final Font font;
    private final int size;

    public CharacterFlyweight(Font font, int size) {
        this.font = font;
        this.size = size;
    }

    @Override
    public void draw(char c, int x, int y) {
        // Drawing logic using font and size, potentially incorporating extrinsic state (x, y)
    }
}

// Flyweight factory managing CharacterFlyweight instances
class CharacterFactory {
    private Map<String, CharacterFlyweight> characters = new HashMap<>();

    public CharacterFlyweight getCharacter(Font font, int size) {
        String key = font.getName() + ":" + size;
        if (!characters.containsKey(key)) {
            characters.put(key, new CharacterFlyweight(font, size));
        }
        return characters.get(key);
    }
}

// Client using the Flyweight pattern
class TextEditor {
    private CharacterFactory factory;

    public TextEditor(CharacterFactory factory) {
        this.factory = factory;
    }

    public void drawText(String text, int x, int y) {
        for (char c : text.toCharArray()) {
            CharacterFlyweight character = factory.getCharacter(new Font("Arial", 12), 12); // Example extrinsic state
            character.draw(c, x, y);
            x += character.getAdvance(c); // Potentially using extrinsic state within Flyweight
        }
    }
}
