package com.IOOuterActive.MonopolyJunior;

class MonopolyJunior {
    public static void main (String[] args) {
        Languages.selectLanguage();
        PlayerController.createPlayers();

        do {
            Board.updateBoard();
            PlayerController.updateCurrentPlayer();
            Turn.runTurn(PlayerController.getCurrentPlayer());
        } while(!Bankruptcy.getBankruptcy());

        End.end();
    }
}