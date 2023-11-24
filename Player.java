package com.IOOuterActive.MonopolyJunior;

public class Player {
    String name;
    Account account;
    int wins, position;
    Role role;
    boolean imprisoned;

    public Player(String name, Role role) {
        this.name = name;
        this.role = role;
        this.position = 0;
        this.account = new Account();
        this.wins = RecordKeeper.getWins(this);
        this.imprisoned = false;
    }

    public Role getRole() {
        return this.role;
    }

    public String getName() {
        return this.name;
    }

    public int getWins() {
        return this.wins;
    }

    public int getCash() {
        return this.account.getCash();
    }

    public int getPosition() {
        return this.position;
    }

    public boolean getImprisonment() {
        return this.imprisoned;
    }

    public void setImprisonment() {
        this.imprisoned = !this.imprisoned;
    }

    public String toString() {
        return this.name + Languages.getLanguage(LanguageIndex.PLAYER_TO_STRING_1) + this.getCash() + ".";
    }

    public String toStringFull() {
        return this.name + Languages.getLanguage(LanguageIndex.PLAYER_TO_STRING_1) + this.getCash() + ". " + Languages.getLanguage(LanguageIndex.PLAYER_TO_STRING_2) + (this.wins + 1);
    }

    public void wins() {
        this.wins += 1;
        System.out.println(this.name + " wins!");
        System.out.println("Total wins: " + this.wins);
    }

    public void move(int move) {
        if (this.position + move < 24) {
            this.position += move;
        } else {
            this.position = this.position + move - 24;
        }
    }

    public boolean addCash(int cash) {
        return this.account.addCash(cash);
    }

    public void setPosition(int x) {
        this.position = x;
    }

    public void pay(int cash, Player recipient) {
        for (int i = 0; i < cash; i++) {
            if (this.addCash(-1)) {
                recipient.addCash(1);
            }
        }
    }
}

enum Role {
    CAR,
    SHIP,
    CAT,
    DOG;
}
