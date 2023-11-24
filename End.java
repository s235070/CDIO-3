package com.IOOuterActive.MonopolyJunior;

public class End {
    public static void end() {
        Player richest = PlayerController.getRichest();
        System.out.println(richest.getName() + Languages.getLanguage(LanguageIndex.END));
        System.out.println(richest.toStringFull());
        
        RecordKeeper.updateRecord(richest);
        RecordKeeper.saveRecords();
    }
}
