package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testAppConstructor() {
        App apps1 = new App();
        App apps2 = new App();
        assertEquals(apps1.getMessage(), apps2.getMessage());
    }

    @Test
    public void testAppMessage()
    {
        App apps = new App();
        assertEquals("hello semua", apps.getMessage());
    }
}
