package practice_14.task8;

public class Game {
    public Character createCharacter() {
        return new CharacterBuilder()
                .addMagic("Невидимка")
                .addHealth(100)
                .addArmor(300)
                .build();

    }
}
