package com.IOOuterActive.MonopolyJunior;

public class Chance {
    static ChanceActivity backToStart = () -> {
        Player player = PlayerController.getCurrentPlayer();
        player.setPosition(0);
        player.addCash(2);
        System.out.println(Languages.getLanguage(LanguageIndex.CARD) + Languages.getLanguage(LanguageIndex.BACK_TO_START));
    };
    static ChanceActivity moveFive = () -> {
        Player player = PlayerController.getCurrentPlayer();
        player.move(5);
        System.out.println(Languages.getLanguage(LanguageIndex.CARD) + Languages.getLanguage(LanguageIndex.MOVE_FIVE));
        
    };
    static ChanceActivity freeOrange = () -> {
        Player player = PlayerController.getCurrentPlayer();
        player.setPosition(10);
        if(PlayerController.owners[10] != null) {
            player.addCash(-2);
            PlayerController.owners[10].addCash(2);
        }
        PlayerController.owners[10] = player;
        System.out.println(Languages.getLanguage(LanguageIndex.CARD) + Languages.getLanguage(LanguageIndex.FREE_ORANGE));
    };
    static ChanceActivity moveOne = () -> {
        Player player = PlayerController.getCurrentPlayer();

        player.move(1);
        System.out.println(Languages.getLanguage(LanguageIndex.CARD) + Languages.getLanguage(LanguageIndex.MOVE_ONE));
    };
    static ChanceActivity candy = () -> {
        Player player = PlayerController.getCurrentPlayer();
        player.addCash(-2);
        System.out.println(Languages.getLanguage(LanguageIndex.CARD) + Languages.getLanguage(LanguageIndex.CANDY));
    };
    static ChanceActivity freeBlue = () -> {
        Player player = PlayerController.getCurrentPlayer();
        player.setPosition(4);
        if(PlayerController.owners[4] != null) {
            player.addCash(-1);
            PlayerController.owners[4].addCash(2);
        }
        PlayerController.owners[4] = player;
        System.out.println(Languages.getLanguage(LanguageIndex.CARD) + Languages.getLanguage(LanguageIndex.FREE_BLUE));
    };
    static ChanceActivity getOutOfJail = () -> {
        Player player = PlayerController.getCurrentPlayer();
        player.setImprisonment();
        System.out.println(Languages.getLanguage(LanguageIndex.CARD) + Languages.getLanguage(LanguageIndex.GET_OUT_OF_JAIL));
    };
    static ChanceActivity goBeachPromenade = () -> {
        Player player = PlayerController.getCurrentPlayer();
        player.setPosition(23);
        System.out.println(Languages.getLanguage(LanguageIndex.CARD) + Languages.getLanguage(LanguageIndex.GO_BEACH_PROMENADE));
    };
    static ChanceActivity birthday = () -> {
        Player player = PlayerController.getCurrentPlayer();
        for (int i = 0; i < PlayerController.getPlayers().length; i++)
            PlayerController.getPlayers()[i].pay(1, player);
        System.out.println(Languages.getLanguage(LanguageIndex.CARD) + Languages.getLanguage(LanguageIndex.BIRTHDAY));
    };
    static ChanceActivity homework = () -> {
        Player player = PlayerController.getCurrentPlayer();
        player.addCash(2);   
        System.out.println(Languages.getLanguage(LanguageIndex.CARD) + Languages.getLanguage(LanguageIndex.HOMEWORK));     
    };
    static ChanceActivity freeRed = () -> {
        Player player = PlayerController.getCurrentPlayer();
        player.setPosition(13);
        if(PlayerController.owners[13] != null) {
            player.addCash(-3);
            PlayerController.owners[13].addCash(2);
        }
        PlayerController.owners[13] = player;
        System.out.println(Languages.getLanguage(LanguageIndex.CARD) + Languages.getLanguage(LanguageIndex.FREE_RED));

    };
    static ChanceActivity goSkatePark = () -> {
        Player player = PlayerController.getCurrentPlayer();
        player.setPosition(10);
        if(PlayerController.owners[10] != null) {
            player.addCash(-2);
            PlayerController.owners[10].addCash(2);
        }
        PlayerController.owners[10] = player;
        System.out.println(Languages.getLanguage(LanguageIndex.CARD) + Languages.getLanguage(LanguageIndex.GO_SKATE_PARK));
    };

    static ChanceActivity[] cards = {backToStart, moveFive, freeOrange, moveOne, candy, freeBlue, getOutOfJail, goBeachPromenade, birthday, homework, freeRed, goSkatePark};
    public static void chance() {
        cards[Deck.getCard().ordinal()].chanceActivity();
        Deck.shift();
    }
}

@FunctionalInterface
interface ChanceActivity {
    public void chanceActivity();
}



