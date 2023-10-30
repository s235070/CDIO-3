class Board {
    static Player[] board = new Player[24];

    public static void updateBoard() {
        for (int i = 0; i < PlayerController.getPlayers().length; i++) {
            board[PlayerController.getPlayers()[i].getPosition()] = PlayerController.getPlayers()[i];
        }
    }
}