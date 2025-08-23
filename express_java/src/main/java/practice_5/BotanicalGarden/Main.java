package practice_5.BotanicalGarden;

public class Main {
    public static void main(String[] args) {
        BotanicalGarden garden = new BotanicalGarden();
        garden.setPlant(new Cactus());
        garden.maingainPlant();

        garden.setPlant(new Orchid());
        garden.maingainPlant();

    }
}
