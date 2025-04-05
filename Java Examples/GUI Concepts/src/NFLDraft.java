import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Helper class to manage saving and loading player data
public class NFLDraft {
    // 🗂️ File where all player info is stored
    private static final String FILE_NAME = "players.txt";

    // 💾 Appends a new player line to the file
    public static void savePlayer(String playerInfo) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(playerInfo);
            bw.newLine(); //  Add a new line after each entry
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //  Loads all saved players from the file into a list
    public static List<String> loadPlayers() {
        List<String> players = new ArrayList<>();
        File file = new File(FILE_NAME);

        //  If file doesn't exist, return empty list
        if (!file.exists()) return players;

        //  Read each line and add to the list
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                players.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return players;
    }
}
