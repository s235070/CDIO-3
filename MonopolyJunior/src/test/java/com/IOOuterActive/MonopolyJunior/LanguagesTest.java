package com.IOOuterActive.MonopolyJunior;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LanguagesTest {
    @BeforeAll
    static void setUpSystemIn() {
        String input = "Danish\nDanish\nEnglish\nEnglish\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
    }

    @BeforeEach
    void selectLanguage() {
        Languages.selectLanguage();
    }
    
    @Test
    @DisplayName("Out of range index (Danish)")
    void outOfRangeDanish() {
        assertTrue(Languages.getLanguage(LanguageIndex.ALWAYS_OUT_OF_RANGE).equals("INDEX_OUT_OF_RANGE_DA"));
    }

    @Test
    @DisplayName("Debug output (Danish)")
    void debugOutputDanish() {
        assertTrue(Languages.getLanguage(LanguageIndex.DEBUG_OUTPUT).equals("DEBUG_OUTPUT_DA"));
    }

    @Test
    @DisplayName("Out of range index (English)")
    void outOfRangeEnglish() {
        assertTrue(Languages.getLanguage(LanguageIndex.ALWAYS_OUT_OF_RANGE).equals("INDEX_OUT_OF_RANGE_EN"));
    }

    @Test
    @DisplayName("Debug output (English)")
    void debugOutputEnglish() {
        assertTrue(Languages.getLanguage(LanguageIndex.DEBUG_OUTPUT).equals("DEBUG_OUTPUT_EN"));
    }
}
