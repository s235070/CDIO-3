package com.IOOuterActive.MonopolyJunior;

public class Turn {
    public static void runTurn(Player player) {
        player.move(Dice.rollDice());

        Tile currentTile = Tile.values()[player.getPosition()];

        TileActivity.runTile(currentTile);
    }
}

enum Tile {
    START,
    BURGER_SHOP,
    PIZZERIA,
    CHANCE_ONE,
    CANDY_SHOP,
    ICE_CREAM_SHOP,
    JAIL,
    MUSEUM,
    LIBRARY,
    CHANCE_TWO,
    SKATE_PARK,
    SWIMMING_POOL,
    FREE_PARKING,
    ARCADE,
    CINEMA,
    CHANCE_THREE,
    TOY_SHOP,
    PET_SHOP,
    GO_TO_JAIL,
    BOWLING_ALLEY,
    ZOO,
    CHANCE_FOUR,
    WATER_PARK,
    BEACH_PROMENADE;
}
