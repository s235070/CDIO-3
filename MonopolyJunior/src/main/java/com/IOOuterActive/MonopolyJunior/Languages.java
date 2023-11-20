package com.IOOuterActive.MonopolyJunior;

public class Languages {
    public static int language;

    static Language english = index -> {
        switch(index) {
            case PLAYER_NUM:
                return "Number of players? (2, 3, 4)";
            case PLAYER_ROLE:
                return " Pick a role (Car, Dog, Cat, Ship)";
            case PLAYER_NAME:
                return "Insert name";
            case PLAYER_TO_STRING_1:
                return ". Cash: ";
            case PLAYER_TO_STRING_2:
                return "Wins: ";
            case BOUGHT_PROPERTY:
                return " buys ";
            case PAID_RENT:
                return " paid rent.";
            case LANDED:
                return " lands on ";
            case START:
                return "Start";
            case BURGER_SHOP:
                return "Burger Shop";
            case PIZZERIA:
                return "Pizzeria";
            case CHANCE:
                return "Chance";
            case CANDY_SHOP:
                return "Candy Shop";
            case ICE_CREAM_SHOP:
                return "Ice Cream Shop";
            case JAIL:
                return "Jail";
            case MUSEUM:
                return "Museum";
            case LIBRARY:
                return "Library";
            case SKATE_PARK:
                return "Skate Park";
            case SWIMMING_POOL:
                return "Swimming Pool";
            case FREE_PARKING:
                return "Free Parking";
            case ARCADE:
                return "Arcade";
            case CINEMA:
                return "Cinema";
            case TOY_SHOP:
                return "Toy Shop";
            case PET_SHOP:
                return "Pet Shop";
            case GO_TO_JAIL:
                return "Go To Jail";
            case BOWLING_ALLEY:
                return "Bowling Alley";
            case ZOO:
                return "Zoo";
            case WATER_PARK:
                return "Water Park";
            case BEACH_PROMENADE:
                return "Beach Promenade";
            case OWNER:
                return "Owner";
            case END:
                return " won!";
            case DEBUG_OUTPUT:
                return "DEBUG_OUTPUT_EN";       // DO NOT CHANGE THIS LINE
            default:
                return "INDEX_OUT_OF_RANGE_EN"; //DO NOT CHANGE THIS LINE
        }
    };

    static Language danish = index -> {
        switch(index) {
            case PLAYER_NUM:
                return "Antal spillere? (2, 3, 4)";
            case PLAYER_ROLE:
                return "Vælg en rolle (Bil, Hund, Kat, Skib)";
            case PLAYER_NAME:
                return "Indsæt Navn";
            case PLAYER_TO_STRING_1:
                return ". Penge: ";
            case PLAYER_TO_STRING_2:
                return "Sejre: ";
            case BOUGHT_PROPERTY:
                return " køber ";
            case PAID_RENT:
                return "Betalt Leje";
            case LANDED:
                return "Lander på";
            case START:
                return "Start";
            case BURGER_SHOP:
                return "Burgerbaren";
            case PIZZERIA:
                return "Pizzeria";
            case CHANCE:
                return "Chance";
            case CANDY_SHOP:
                return "Slikbutikken";
            case ICE_CREAM_SHOP:
                return "Isbutikken";
            case JAIL:
                return "JAIL_DA";
            case MUSEUM:
                return "Museet";
            case LIBRARY:
                return "Biblioteket";
            case SKATE_PARK:
                return "Skaterparken";
            case SWIMMING_POOL:
                return "Svømmehallen";
            case FREE_PARKING:
                return "Gratis Parkering";
            case ARCADE:
                return "Spillehallen";
            case CINEMA:
                return "Biografen";
            case TOY_SHOP:
                return "Legetøjsbutikken";
            case PET_SHOP:
                return "Dyrehandel";
            case GO_TO_JAIL:
                return "Gå i Fængsel";
            case BOWLING_ALLEY:
                return "Bowlinghallen";
            case ZOO:
                return "Zoologisk Have";
            case WATER_PARK:
                return "Vandlandet";
            case BEACH_PROMENADE:
                return "Strandpromenaden";
            case OWNER:
                return "Ejer:";
            case END:
                return " sejr!";
            case DEBUG_OUTPUT:
                return "DEBUG_OUTPUT_DA";       // DO NOT CHANGE THIS LINE
            default:
                return "INDEX_OUT_OF_RANGE_DA"; // DO NOT CHANGE THIS LINE
        }
    };
    
    static Language[] languages = new Language[] {english, danish};

    public static String getLanguage(LanguageIndex index) {
        return languages[language].LanguageOutput(index);
    }

    public static void selectLanguage() {
        System.out.println("EN: English | DA: Dansk");

        while (true) {
            String line = LineReader.nextLine();
            if (line.equalsIgnoreCase("EN") || line.equalsIgnoreCase("English")) {
                language = 0;
                break;
            } else if (line.equalsIgnoreCase("DA") || line.equalsIgnoreCase("Danish") || line.equalsIgnoreCase("Danish") || line.equalsIgnoreCase("DK")) {
                language = 1;
                break;
            }
        }
    }
}

@FunctionalInterface
interface Language {
    public String LanguageOutput(LanguageIndex index);
}

// Add all indices here and reference them above in the Languages class
enum LanguageIndex {
    // PlayerController.java
    PLAYER_NUM, // Should ask about how many players are playing
    PLAYER_ROLE, // Should ask the player what role they want to have
    PLAYER_NAME, // Should ask the player about their name
    //Player.java
    PLAYER_TO_STRING_1, // Comes between player name and cash
    PLAYER_TO_STRING_2, // Precedes win counter
    // TileActivity.java
    BOUGHT_PROPERTY, // Printed when the player buys a property
    PAID_RENT, // Printed when player pays rent
    LANDED, // Printed when you land on a tile before the name of the tile
    // All of the following are the names of tiles each language
    START,
    BURGER_SHOP,
    PIZZERIA,
    CHANCE,
    CANDY_SHOP,
    ICE_CREAM_SHOP,
    JAIL,
    MUSEUM,
    LIBRARY,
    SKATE_PARK,
    SWIMMING_POOL,
    FREE_PARKING,
    ARCADE,
    CINEMA,
    TOY_SHOP,
    PET_SHOP,
    GO_TO_JAIL,
    BOWLING_ALLEY,
    ZOO,
    WATER_PARK,
    BEACH_PROMENADE,
    //BoardUI.java
    OWNER,
    //End.java
    END, // Shown when game ends
    //DEBUG INDICES DO NOT USE
    DEBUG_OUTPUT,
    ALWAYS_OUT_OF_RANGE;
}