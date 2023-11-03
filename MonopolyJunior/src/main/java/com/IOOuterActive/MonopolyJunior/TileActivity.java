package com.IOOuterActive.MonopolyJunior;

public class TileActivity {
    static Player[] owners = new Player[24];

    static Activity start = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.START));
        return;
    };

    static Activity jail = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.JAIL));
        return;
    };
    
    static Activity freeParking = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.FREE_PARKING));
        return;
    };
    
    static Activity goToJail = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.GO_TO_JAIL));
        return;
    };
        
    static Activity chance = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.CHANCE));
        return;
    };
    
    static Activity burgerShop = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.BURGER_SHOP));
        if (owners[tile.ordinal()] == null) {
            if (PlayerController.getCurrentPlayer().addCash(-1)) {
                owners[tile.ordinal()] = PlayerController.getCurrentPlayer();
                System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.BOUGHT_PROPERTY) + Languages.getLanguage(LanguageIndex.BURGER_SHOP));
            }
        } else if (owners[tile.ordinal()] == owners[tile.ordinal() + 1]) {
            PlayerController.getCurrentPlayer().pay(2, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        } else {
            PlayerController.getCurrentPlayer().pay(1, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        }
    };

    static Activity pizzeria = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.PIZZERIA));
        if (owners[tile.ordinal()] == null) {
            if (PlayerController.getCurrentPlayer().addCash(-1)) {
                owners[tile.ordinal()] = PlayerController.getCurrentPlayer();
                System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.BOUGHT_PROPERTY) + Languages.getLanguage(LanguageIndex.PIZZERIA));
            }
        } else if (owners[tile.ordinal()] == owners[tile.ordinal() - 1]) {
            PlayerController.getCurrentPlayer().pay(2, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        } else {
            PlayerController.getCurrentPlayer().pay(1, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        }
    };

    static Activity candyShop = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.CANDY_SHOP));
        if (owners[tile.ordinal()] == null) {
            if (PlayerController.getCurrentPlayer().addCash(-1)) {
                owners[tile.ordinal()] = PlayerController.getCurrentPlayer();
                System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.BOUGHT_PROPERTY) + Languages.getLanguage(LanguageIndex.CANDY_SHOP));
            }
        } else if (owners[tile.ordinal()] == owners[tile.ordinal() + 1]) {
            PlayerController.getCurrentPlayer().pay(2, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        } else {
            PlayerController.getCurrentPlayer().pay(1, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        }
    };

    static Activity iceCreamShop = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.ICE_CREAM_SHOP));
        if (owners[tile.ordinal()] == null) {
            if (PlayerController.getCurrentPlayer().addCash(-1)) {
                owners[tile.ordinal()] = PlayerController.getCurrentPlayer();
                System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.BOUGHT_PROPERTY) + Languages.getLanguage(LanguageIndex.ICE_CREAM_SHOP));
            }
        } else if (owners[tile.ordinal()] == owners[tile.ordinal() - 1]) {
            PlayerController.getCurrentPlayer().pay(2, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        } else {
            PlayerController.getCurrentPlayer().pay(1, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        }
    };
    
    static Activity museum = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.MUSEUM));
        if (owners[tile.ordinal()] == null) {
            if (PlayerController.getCurrentPlayer().addCash(-2)) {
                owners[tile.ordinal()] = PlayerController.getCurrentPlayer();
                System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.BOUGHT_PROPERTY) + Languages.getLanguage(LanguageIndex.MUSEUM));
            }
        } else if (owners[tile.ordinal()] == owners[tile.ordinal() + 1]) {
            PlayerController.getCurrentPlayer().pay(4, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        } else {
            PlayerController.getCurrentPlayer().pay(2, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        }
    };

    static Activity library = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.LIBRARY));
        if (owners[tile.ordinal()] == null) {
            if (PlayerController.getCurrentPlayer().addCash(-2)) {
                owners[tile.ordinal()] = PlayerController.getCurrentPlayer();
                System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.BOUGHT_PROPERTY) + Languages.getLanguage(LanguageIndex.LIBRARY));
            }
        } else if (owners[tile.ordinal()] == owners[tile.ordinal() - 1]) {
            PlayerController.getCurrentPlayer().pay(4, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        } else {
            PlayerController.getCurrentPlayer().pay(2, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        }
    };

    static Activity skatePark = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.SKATE_PARK));
        if (owners[tile.ordinal()] == null) {
            if (PlayerController.getCurrentPlayer().addCash(-2)) {
                owners[tile.ordinal()] = PlayerController.getCurrentPlayer();
                System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.BOUGHT_PROPERTY) + Languages.getLanguage(LanguageIndex.SKATE_PARK));
            }
        } else if (owners[tile.ordinal()] == owners[tile.ordinal() + 1]) {
            PlayerController.getCurrentPlayer().pay(4, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        } else {
            PlayerController.getCurrentPlayer().pay(2, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        }
    };
    
    static Activity swimmingPool = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.SWIMMING_POOL));
        if (owners[tile.ordinal()] == null) {
            if (PlayerController.getCurrentPlayer().addCash(-2)) {
                owners[tile.ordinal()] = PlayerController.getCurrentPlayer();
                System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.BOUGHT_PROPERTY) + Languages.getLanguage(LanguageIndex.SWIMMING_POOL));
            }
        } else if (owners[tile.ordinal()] == owners[tile.ordinal() - 1]) {
            PlayerController.getCurrentPlayer().pay(4, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        } else {
            PlayerController.getCurrentPlayer().pay(2, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        }
    };
    
    static Activity arcade = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.FREE_PARKING));
        if (owners[tile.ordinal()] == null) {
            if (PlayerController.getCurrentPlayer().addCash(-3)) {
                owners[tile.ordinal()] = PlayerController.getCurrentPlayer();
                System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.BOUGHT_PROPERTY) + Languages.getLanguage(LanguageIndex.ARCADE));
            }
        } else if (owners[tile.ordinal()] == owners[tile.ordinal() + 1]) {
            PlayerController.getCurrentPlayer().pay(6, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        } else {
            PlayerController.getCurrentPlayer().pay(3, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        }
    };

    static Activity cinema = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.ARCADE));
        if (owners[tile.ordinal()] == null) {
            if (PlayerController.getCurrentPlayer().addCash(-3)) {
                owners[tile.ordinal()] = PlayerController.getCurrentPlayer();
                System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.BOUGHT_PROPERTY) + Languages.getLanguage(LanguageIndex.CINEMA));
            }
        } else if (owners[tile.ordinal()] == owners[tile.ordinal() - 1]) {
            PlayerController.getCurrentPlayer().pay(6, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        } else {
            PlayerController.getCurrentPlayer().pay(3, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        }
    };

    static Activity toyShop = tile -> {
        if (owners[tile.ordinal()] == null) {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.TOY_SHOP));
            if (PlayerController.getCurrentPlayer().addCash(-3)) {
                owners[tile.ordinal()] = PlayerController.getCurrentPlayer();
                System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.BOUGHT_PROPERTY) + Languages.getLanguage(LanguageIndex.TOY_SHOP));
            }
        } else if (owners[tile.ordinal()] == owners[tile.ordinal() + 1]) {
            PlayerController.getCurrentPlayer().pay(6, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        } else {
            PlayerController.getCurrentPlayer().pay(3, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        }
    };
    
    static Activity petShop = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.PET_SHOP));
        if (owners[tile.ordinal()] == null) {
            if (PlayerController.getCurrentPlayer().addCash(-3)) {
                owners[tile.ordinal()] = PlayerController.getCurrentPlayer();
                System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.BOUGHT_PROPERTY) + Languages.getLanguage(LanguageIndex.PET_SHOP));
            }
        } else if (owners[tile.ordinal()] == owners[tile.ordinal() - 1]) {
            PlayerController.getCurrentPlayer().pay(6, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        } else {
            PlayerController.getCurrentPlayer().pay(3, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        }
    };

    static Activity bowlingAlley = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.BOWLING_ALLEY));
        if (owners[tile.ordinal()] == null) {
            if (PlayerController.getCurrentPlayer().addCash(-4)) {
                owners[tile.ordinal()] = PlayerController.getCurrentPlayer();
                System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.BOUGHT_PROPERTY) + Languages.getLanguage(LanguageIndex.BOWLING_ALLEY));
            }
        } else if (owners[tile.ordinal()] == owners[tile.ordinal() + 1]) {
            PlayerController.getCurrentPlayer().pay(8, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        } else {
            PlayerController.getCurrentPlayer().pay(4, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        }
    };
    
    static Activity zoo = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.ZOO));
        if (owners[tile.ordinal()] == null) {
            if (PlayerController.getCurrentPlayer().addCash(-4)) {
                owners[tile.ordinal()] = PlayerController.getCurrentPlayer();
                System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.BOUGHT_PROPERTY) + Languages.getLanguage(LanguageIndex.ZOO));
            }
        } else if (owners[tile.ordinal()] == owners[tile.ordinal() - 1]) {
            PlayerController.getCurrentPlayer().pay(8, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        } else {
            PlayerController.getCurrentPlayer().pay(4, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        }
    };

    static Activity waterPark = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.WATER_PARK));
        if (owners[tile.ordinal()] == null) {
            if (PlayerController.getCurrentPlayer().addCash(-5)) {
                owners[tile.ordinal()] = PlayerController.getCurrentPlayer();
                System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.BOUGHT_PROPERTY) + Languages.getLanguage(LanguageIndex.WATER_PARK));
            }
        } else if (owners[tile.ordinal()] == owners[tile.ordinal() + 1]) {
            PlayerController.getCurrentPlayer().pay(10, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        } else {
            PlayerController.getCurrentPlayer().pay(5, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        }
    };
    
    static Activity beachPromenade = tile -> {
        System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.LANDED) + Languages.getLanguage(LanguageIndex.BEACH_PROMENADE));
        if (owners[tile.ordinal()] == null) {
            if (PlayerController.getCurrentPlayer().addCash(-5)) {
                owners[tile.ordinal()] = PlayerController.getCurrentPlayer();
                System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.BOUGHT_PROPERTY) + Languages.getLanguage(LanguageIndex.BEACH_PROMENADE));
            }
        } else if (owners[tile.ordinal()] == owners[tile.ordinal() - 1]) {
            PlayerController.getCurrentPlayer().pay(10, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        } else {
            PlayerController.getCurrentPlayer().pay(5, owners[tile.ordinal()]);
            System.out.println(PlayerController.getCurrentPlayer().getName() + Languages.getLanguage(LanguageIndex.PAID_RENT));
        }
    };

    static Activity[] activities = new Activity[]{start, burgerShop, pizzeria, chance, candyShop, iceCreamShop, jail, museum, library, chance, skatePark, swimmingPool, freeParking, arcade, cinema, chance, toyShop, petShop, goToJail, bowlingAlley, zoo, chance, waterPark, beachPromenade};

    public static void runTile(Tile tile) {
        activities[tile.ordinal()].runActivity(tile);
    }
}

@FunctionalInterface
interface Activity {
    public void runActivity(Tile tile);
}