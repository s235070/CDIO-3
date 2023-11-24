package com.IOOuterActive.MonopolyJunior;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
    static List<Card> deck = Arrays.asList(Card.values());
    public static void shuffle() {
        Collections.shuffle(deck);
    }
    public static void shift() {
        Collections.rotate(deck, -1);
    }
    public static Card getCard() {  
        return deck.get(0);
    }
}

enum Card {
    BACK_TO_START,
    MOVE_FIVE,
    FREE_ORANGE,
    MOVE_ONE,
    CANDY,
    FREE_BLUE,
    GET_OUT_OF_JAIL,
    GO_BEACH_PROMENADE,
    BIRTHDAY,
    HOMEWORK,
    FREE_RED,
    GO_SKATE_PARK,
}