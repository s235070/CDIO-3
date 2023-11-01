import java.util.Optional;

class PlayerController {
    static int numPlayers;
    static Player currentPlayer, car, ship, dog, cat;
    static Player[] players;

    public static void createPlayers() {
        System.out.println(Languages.getLanguage(LanguageIndex.PLAYER_NUM));
        while (true) {
            numPlayers = LineReader.nextInt();
            if (numPlayers == 2 || numPlayers == 3 || numPlayers == 4) {
                players = new Player[numPlayers];
                break;
            }
        }

        for (int i = 0; i < numPlayers; i++) {
            players[i] = generatePlayer(i + 1);
            
            if (numPlayers == 2) {
                players[i].addCash(20);
            } else if (numPlayers == 3) {
                players[i].addCash(18);
            } else if (numPlayers == 4) {
                players[i].addCash(16);
            }
        }
    }

    public static void updateCurrentPlayer() {
        if (currentPlayer == null) {
            currentPlayer = players[0];
        } else {
            for (int i = 0; i < players.length; i++) {
                if (players[i] == currentPlayer) {
                    if (i + 1 < players.length)
                        currentPlayer = players[++i];
                    else
                        currentPlayer = players[0];
                    return;
                }
            }
        }
    }

    public static Player getCar() {
        return car;
    }

    public static Player getShip() {
        return ship;
    }

    public static Player getDog() {
        return dog;
    }

    public static Player getCat() {
        return cat;
    }

    public static Player getCurrentPlayer() {
        return Optional.ofNullable(currentPlayer).orElse(players[0]);
    }

    public static Player[] getPlayers() {
        return players;
    }

    public static Player getRichest() {
        Player richest = players[0];
        for (int i = 0; i < players.length; i++) {
            if (players[i].getCash() > richest.getCash())
                richest = players[i];
        }
        return richest;
    }

    private static Player generatePlayer(int n) {
        System.out.println("P" + n + Languages.getLanguage(LanguageIndex.PLAYER_ROLE));
        while (true) {
            String line = LineReader.nextLine();

            switch(line) {
                case "Car": case "car":
                    if (car == null) {
                        car = new Player(getName(), Role.CAR);
                        return car;
                    }
                case "Ship": case "ship":
                    if (ship == null) {
                        ship = new Player(getName(), Role.SHIP);
                        return ship;
                    }
                case "Cat": case "cat":
                    if (cat == null) {
                        cat = new Player(getName(), Role.CAR);
                        return cat;
                    }
                case "Dog": case "dog":
                    if (dog == null) {
                        dog = new Player(getName(), Role.DOG);
                        return dog;
                    }
            }
        }
    }

    static String getName() {
        System.out.println(Languages.getLanguage(LanguageIndex.PLAYER_NAME));
        return LineReader.nextLine();
    }
}