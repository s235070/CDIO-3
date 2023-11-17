package com.IOOuterActive.MonopolyJunior;

public class Languages {
    public static int language;

    static Language english = index -> {
        switch(index) {
            case PLAYER_NUM:
                return "PLAYER_NUM_EN";
            case PLAYER_ROLE:
                return "PLAYER_ROLE_EN";
            case PLAYER_NAME:
                return "PLAYER_NAME_EN";
            case BOUGHT_PROPERTY:
                return "BOUGHT_PROPERTY_EN";
            case PAID_RENT:
                return "PAID_RENT_EN";
            case LANDED:
                return "LANDED_EN";
            case START:
                return "START_EN";
            case BURGER_SHOP:
                return "BURGER_SHOP_EN";
            case PIZZERIA:
                return "PIZZERIA_EN";
            case CHANCE:
                return "CHANCE_EN";
            case CANDY_SHOP:
                return "CANDY_SHOP_EN";
            case ICE_CREAM_SHOP:
                return "ICE_CREAM_SHOP_EN";
            case JAIL:
                return "JAIL_EN";
            case MUSEUM:
                return "MUSEUM_EN";
            case LIBRARY:
                return "LIBRARY_EN";
            case SKATE_PARK:
                return "SKATE_PARK_EN";
            case SWIMMING_POOL:
                return "SWIMMING_POOL_EN";
            case FREE_PARKING:
                return "FREE_PARKING_EN";
            case ARCADE:
                return "ARCADE_EN";
            case CINEMA:
                return "CINEMA_EN";
            case TOY_SHOP:
                return "TOY_SHOP_EN";
            case PET_SHOP:
                return "PET_SHOP_EN";
            case GO_TO_JAIL:
                return "GO_TO_JAIL_EN";
            case BOWLING_ALLEY:
                return "BOWLING_ALLEY_EN";
            case ZOO:
                return "ZOO_EN";
            case WATER_PARK:
                return "WATER_PARK_EN";
            case BEACH_PROMENADE:
                return "BEACH_PROMENADE_EN";
            case END:
                return "END_EN";
            case DEBUG_OUTPUT:
                return "DEBUG_OUTPUT_EN";       // DO NOT CHANGE THIS LINE
            default:
                return "INDEX_OUT_OF_RANGE_EN"; //DO NOT CHANGE THIS LINE
        }
    };

    static Language danish = index -> {
        switch(index) {
            case PLAYER_NUM:
                return "PLAYER_NUM_DA";
            case PLAYER_ROLE:
                return "PLAYER_ROLE_DA";
            case PLAYER_NAME:
                return "PLAYER_NAME_DA";
            case BOUGHT_PROPERTY:
                return "BOUGHT_PROPERTY_DA";
            case PAID_RENT:
                return "PAID_RENT_DA";
            case LANDED:
                return "LANDED_DA";
            case START:
                return "START_DA";
            case BURGER_SHOP:
                return "BURGER_SHOP_DA";
            case PIZZERIA:
                return "PIZZERIA_DA";
            case CHANCE:
                return "CHANCE_DA";
            case CANDY_SHOP:
                return "CANDY_SHOP_DA";
            case ICE_CREAM_SHOP:
                return "ICE_CREAM_SHOP_DA";
            case JAIL:
                return "JAIL_DA";
            case MUSEUM:
                return "MUSEUM_DA";
            case LIBRARY:
                return "LIBRARY_DA";
            case SKATE_PARK:
                return "SKATE_PARK_DA";
            case SWIMMING_POOL:
                return "SWIMMING_POOL_DA";
            case FREE_PARKING:
                return "FREE_PARKING_DA";
            case ARCADE:
                return "ARCADE_DA";
            case CINEMA:
                return "CINEMA_DA";
            case TOY_SHOP:
                return "TOY_SHOP_DA";
            case PET_SHOP:
                return "PET_SHOP_DA";
            case GO_TO_JAIL:
                return "GO_TO_JAIL_DA";
            case BOWLING_ALLEY:
                return "BOWLING_ALLEY_DA";
            case ZOO:
                return "ZOO_DA";
            case WATER_PARK:
                return "WATER_PARK_DA";
            case BEACH_PROMENADE:
                return "BEACH_PROMENADE_DA";
            case END:
                return "END_DA";
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
    //End.java
    END, // Shown when game ends
    //DEBUG INDICES DO NOT USE
    DEBUG_OUTPUT,
    ALWAYS_OUT_OF_RANGE;
}