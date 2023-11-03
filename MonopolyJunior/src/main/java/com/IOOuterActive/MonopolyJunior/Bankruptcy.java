package com.IOOuterActive.MonopolyJunior;

class Bankruptcy {
    static boolean bankruptcy = false;

    public static boolean getBankruptcy() {
        return bankruptcy;
    }

    public static void setBankruptcy() {
        bankruptcy = !bankruptcy;
    }
}