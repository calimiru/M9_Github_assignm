package M9_Github_assignm.M7_assignm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {
    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static void writeNumOfPlayersPerTeam(GameType game) {

        String fileName = "";
        String players = "";

        switch (game) {
            case SOCCER:
                fileName = "SOCCER.txt";
                players = "11";
                break;
            case HOCKEY:
                fileName = "HOCKEY.txt";
                players = "6";
                break;
            case RUGBY:
                fileName = "RUGBY.txt";
                players = "15";
                break;
        }
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter writeToFile = new FileWriter(file);
            writeToFile.write(players);
            writeToFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

