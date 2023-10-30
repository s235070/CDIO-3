import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RecordKeeper {
    public static int getWins(Player player) {
        int wins = 0;
        try {
            File file = new File("record.txt");
            if (!file.exists()) {
                return 0;
            }
    
            Scanner scanner = new Scanner(file);
    
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals(player.getName())) {
                    wins = Integer.parseInt(scanner.nextLine());
                    break;
                }
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        return wins;
    }    

    public static void recordGame(Player p1, Player p2) {
        try {
            File file = new File("record.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
    
            Scanner scanner = new Scanner(file);
            StringBuilder updatedContent = new StringBuilder();
            boolean foundP1 = false;
            boolean foundP2 = false;
    
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals(p1.getName())) {
                    updatedContent.append(p1.getName()).append("\n").append(p1.getWins()).append("\n");
                    foundP1 = true;
                } else if (line.equals(p2.getName())) {
                    updatedContent.append(p2.getName()).append("\n").append(p2.getWins()).append("\n");
                    foundP2 = true;
                } else {
                    updatedContent.append(line).append("\n");
                }
            }
            scanner.close();
    
            if (!foundP1) {
                updatedContent.append(p1.getName()).append("\n").append(p1.getWins()).append("\n");
            }
            if (!foundP2) {
                updatedContent.append(p2.getName()).append("\n").append(p2.getWins()).append("\n");
            }
    
            FileWriter fileWriter = new FileWriter("record.txt");
            fileWriter.write(updatedContent.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }    

}
