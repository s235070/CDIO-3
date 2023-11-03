package com.IOOuterActive.MonopolyJunior;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BankruptcyTest {
    @Test
    @DisplayName("Bankruptcy initialization")
    void testGetBankruptcy() {
        assertFalse(Bankruptcy.getBankruptcy());
    }
    @Test
    @DisplayName("Setting Bankruptcy")
    void testSetBankruptcy() {
        Bankruptcy.setBankruptcy();
        assertTrue(Bankruptcy.getBankruptcy());
    }
}
