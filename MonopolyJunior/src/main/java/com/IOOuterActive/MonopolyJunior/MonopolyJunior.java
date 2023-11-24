package com.IOOuterActive.MonopolyJunior;

public class MonopolyJunior {
    public static void main (String[] args) {
        RecordKeeper.loadRecords(); 
        Deck.shuffle();
        Languages.selectLanguage();
        PlayerController.createPlayers();
        
        while(true) {
            BoardUI.displayBoard();
            PlayerController.updateCurrentPlayer();
            Turn.runTurn(PlayerController.getCurrentPlayer());
            System.out.println(Languages.getLanguage(LanguageIndex.NEXT_TURN));
            LineReader.nextLine();
            if(Bankruptcy.getBankruptcy()) { 
                End.end();
                break;
            }
            System.out.println("------------------------*" + Languages.getLanguage(LanguageIndex.FOLLOWING_TURN) + "*------------------------");
        }

    }
}