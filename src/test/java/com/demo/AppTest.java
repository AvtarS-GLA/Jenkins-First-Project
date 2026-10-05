package com.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testGreeting() {
        assertEquals("Hello from Jenkins Demo", App.greet());
    }
}