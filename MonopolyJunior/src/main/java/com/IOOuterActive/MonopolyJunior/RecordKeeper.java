package com.IOOuterActive.MonopolyJunior;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class RecordKeeper {
    private static final String RECORD_FILE = "record.txt";
    private static Map<String, Integer> playerWins = new HashMap<>();

    public static void loadRecords() {
        try (BufferedReader reader = new BufferedReader(new FileReader(RECORD_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) { 
                    String key = parts[0] + "," + parts[1]; 
                    int wins = Integer.parseInt(parts[2]);
                    playerWins.put(key, wins);
                }
            }
        } catch (IOException e) {
            System.err.println("Fejl ved indlæsning af rekorder: " + e.getMessage());
        }
    }

    public static void updateRecord(Player player) {
        String key = player.getRole().toString() + "," + player.getName();
        int wins = playerWins.getOrDefault(key, 0) + 1;
        playerWins.put(key, wins);
    }

    public static void saveRecords() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RECORD_FILE))) {
            for (Map.Entry<String, Integer> entry : playerWins.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Fejl ved gemning af rekorder: " + e.getMessage());
        }
    }

    public static int getWins(Player player) {
        String key = player.getRole().toString() + "," + player.getName();
        return playerWins.getOrDefault(key, 0);
    }
}
