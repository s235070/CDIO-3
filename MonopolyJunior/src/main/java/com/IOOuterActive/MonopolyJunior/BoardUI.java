package com.IOOuterActive.MonopolyJunior;

public class BoardUI {
    public static void displayBoard() {
        Player[] players = PlayerController.getPlayers();

        // START
        System.out.println("[0:" + Languages.getLanguage(LanguageIndex.START) + "]");
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 0)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();

        // BURGER SHOP
        System.out.println("[1:" + Languages.getLanguage(LanguageIndex.BURGER_SHOP) + "]");
        try {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": " + PlayerController.owners[1].getName() + "]");
        } catch (NullPointerException e) {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": none]");
        }
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 1)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();
        
        // PIZZERIA
        System.out.println("[2:" + Languages.getLanguage(LanguageIndex.PIZZERIA) + "]");
        try {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": " + PlayerController.owners[2].getName() + "]");
        } catch (NullPointerException e) {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": none]");
        }
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 2)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();
        
        // CHANCE 1
        System.out.println("[3:" + Languages.getLanguage(LanguageIndex.CHANCE) + "]");
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 3)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();

        // CANDY SHOP
        System.out.println("[4:" + Languages.getLanguage(LanguageIndex.CANDY_SHOP) + "]");
        try {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": " + PlayerController.owners[4].getName() + "]");
        } catch (NullPointerException e) {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": none]");
        }
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 4)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();

        // ICE CREAM SHOP
        System.out.println("[5:" + Languages.getLanguage(LanguageIndex.ICE_CREAM_SHOP) + "]");
        try {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": " + PlayerController.owners[5].getName() + "]");
        } catch (NullPointerException e) {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": none]");
        }
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 5)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();

        // JAIL
        System.out.println("[6:" + Languages.getLanguage(LanguageIndex.JAIL) + "]");
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 6)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();

        // MUSEUM
        System.out.println("[7:" + Languages.getLanguage(LanguageIndex.MUSEUM) + "]");
        try {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": " + PlayerController.owners[7].getName() + "]");
        } catch (NullPointerException e) {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": none]");
        }
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 7)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();

        // LIBRARY
        System.out.println("[8:" + Languages.getLanguage(LanguageIndex.LIBRARY) + "]");
        try {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": " + PlayerController.owners[8].getName() + "]");
        } catch (NullPointerException e) {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": none]");
        }
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 8)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();

        // CHANCE 2
        System.out.println("[9:" + Languages.getLanguage(LanguageIndex.CHANCE) + "]");
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 9)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();


        // SKATE PARK
        System.out.println("[10:" + Languages.getLanguage(LanguageIndex.SKATE_PARK) + "]");
        try {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": " + PlayerController.owners[10].getName() + "]");
        } catch (NullPointerException e) {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": none]");
        }
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 10)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();

        // SWIMMING POOL
        System.out.println("[11:" + Languages.getLanguage(LanguageIndex.SWIMMING_POOL) + "]");
        try {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": " + PlayerController.owners[11].getName() + "]");
        } catch (NullPointerException e) {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": none]");
        }
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 11)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();
        
        // FREE PARK
        System.out.println("[12:" + Languages.getLanguage(LanguageIndex.FREE_PARKING) + "]");
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 12)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();
    
        // ARCADE
        System.out.println("[13:" + Languages.getLanguage(LanguageIndex.WATER_PARK) + "]");
        try {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": " + PlayerController.owners[13].getName() + "]");
        } catch (NullPointerException e) {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": none]");
        }
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 13)
                System.out.print(players[i].getName() + " ");
        }
        System.out.println("]");
        System.out.println();

        // CINEMA
        System.out.println("[14:" + Languages.getLanguage(LanguageIndex.CINEMA) + "]");
        try {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": " + PlayerController.owners[14].getName() + "]");
        } catch (NullPointerException e) {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": none]");
        }
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 14)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();

        // CHANCE 3
        System.out.println("[15:" + Languages.getLanguage(LanguageIndex.CHANCE) + "]");
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 15)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();

        // TOY SHOP
        System.out.println("[16:" + Languages.getLanguage(LanguageIndex.TOY_SHOP) + "]");
        try {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": " + PlayerController.owners[16].getName() + "]");
        } catch (NullPointerException e) {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": none]");
        }
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 16)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();

        // PET SHOP
        System.out.println("[17:" + Languages.getLanguage(LanguageIndex.PET_SHOP) + "]");
        try {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": " + PlayerController.owners[17].getName() + "]");
        } catch (NullPointerException e) {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": none]");
        }
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 17)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();

        // GO TO JAIL
        System.out.println("[18:" + Languages.getLanguage(LanguageIndex.GO_TO_JAIL) + "]");
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 18)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();

        // BOWLING ALLEY
        System.out.println("[19:" + Languages.getLanguage(LanguageIndex.BOWLING_ALLEY) + "]");
        try {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": " + PlayerController.owners[19].getName() + "]");
        } catch (NullPointerException e) {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": none]");
        }
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 19)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();

        // ZOO
        System.out.println("[20:" + Languages.getLanguage(LanguageIndex.ZOO) + "]");
        try {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": " + PlayerController.owners[20].getName() + "]");
        } catch (NullPointerException e) {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": none]");
        }
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 20)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();

        // CHANCE 4
        System.out.println("[21:" + Languages.getLanguage(LanguageIndex.CHANCE) + "]");
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 21)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();

        // WATER PARK
        System.out.println("[22:" + Languages.getLanguage(LanguageIndex.WATER_PARK) + "]");
        try {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": " + PlayerController.owners[22].getName() + "]");
        } catch (NullPointerException e) {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": none]");
        }
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 22)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();

        // BEACH PROMENADE
        System.out.println("[23:" + Languages.getLanguage(LanguageIndex.BEACH_PROMENADE) + "]");
        try {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": " + PlayerController.owners[23].getName() + "]");
        } catch (NullPointerException e) {
            System.out.println("[" + Languages.getLanguage(LanguageIndex.OWNER) + ": none]");
        }
        System.out.print("[Players: ");
        for(int i = 0; i < players.length;i++){
            if(players[i].getPosition() == 23)
                System.out.print(players[i].getName()+ " ");
        }
        System.out.println("]");
        System.out.println();
    }
    
}
