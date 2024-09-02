package org.hfdp.tla.javastarter;

import static org.junit.jupiter.api.Assertions.*;

class DryClassTest {

    private DryClass dryClass;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        dryClass = new DryClass();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void registerUser() {
    }

    @org.junit.jupiter.api.Test
    void updateAge() {
        Integer testVal = 77;
        dryClass.updateAge(testVal);
        assertEquals(dryClass.getAge(), testVal);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}