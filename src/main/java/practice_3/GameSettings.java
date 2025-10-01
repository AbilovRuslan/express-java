package practice_3;

public class GameSettings {
    static int maxPlayers = 6;
    final String gameName;
    int currentPlayers;


    public GameSettings(int maxPlayers, String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static void setMaxPlayers(int newMax) {
        maxPlayers = newMax;
    }


    public void addPlayer() {
        currentPlayers++;

    }

    public void printGameStatus() {
        System.out.println("Name:" + gameName + "Current players:" + currentPlayers + "Max players:" + maxPlayers);
    }

}

//
//static int maxPlayers — общее ограничение игроков
//final String gameName — название (нельзя менять)
//int currentPlayers — сколько игроков в игре сейчас

//        Реализуйте конструктор, статический метод setMaxPlayers(int),
//метод addPlayer() — добавляет 1 игрока, если не превышен maxPlayers,
//метод printGameStatus() — выводит название, текущее и максимальное количество игроков.
//В main: создайте 2 игры, измените maxPlayers, добавьте игроков и выведите статус.
//
