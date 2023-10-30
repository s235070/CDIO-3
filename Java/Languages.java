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
            default:
                return "INDEX_OUT_OF_RANGE_EN";
        }
    };

    static Language danish = index -> {
        switch(index) {
            case PLAYER_NUM:
                return "PLAYER_NUM_DA";
            case PLAYER_ROLE:
                return "PLAYER_ROLE_EN";
            case PLAYER_NAME:
                return "PLAYER_NAME_EN";
            default:
                return "INDEX_OUT_OF_RANGE_DA";
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

//Add all indices here and reference them above in the Languages class
enum LanguageIndex {
    //PlayerController.java
    PLAYER_NUM, //Should ask about how many players are playing
    PLAYER_ROLE, //Should ask the player what role they want to have
    PLAYER_NAME, //Should ask the player about their name
    //Player.java
    PLAYER_TO_STRING_1, //Comes between player name and cash
    PLAYER_TO_STRING_2; //Precedes win counter
}