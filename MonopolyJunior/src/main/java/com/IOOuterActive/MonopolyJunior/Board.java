package com.IOOuterActive.MonopolyJunior;

class Board {
    static Player[] board = new Player[24];

    public static void updateBoard() {
        for (int i = 0; i < board.length; i++) {
            board[i] = null;
        }
        for (int i = 0; i < PlayerController.getPlayers().length; i++) {
            board[PlayerController.getPlayers()[i].getPosition()] = PlayerController.getPlayers()[i];
        }
    }
}