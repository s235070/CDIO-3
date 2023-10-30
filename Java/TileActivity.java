public class TileActivity {
    public static void runTile(Tile tile) {
        switch (tile) {
            case START:
                return;
            case FREE_PARKING:
                return;
            case GO_TO_JAIL:
                return;
            case JAIL:
                return;
            case CHANCE_ONE: case CHANCE_TWO: case CHANCE_THREE: case CHANCE_FOUR:
                return;
            default:
                property(tile);
        }
    }

    static void property(Tile tile) {
        return;
    }
}