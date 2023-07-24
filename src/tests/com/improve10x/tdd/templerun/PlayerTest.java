package com.improve10x.tdd.templerun;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNameNull_whenGetNameCalled_thenReturnEmpty() {
        Player player = new Player(null);
        assertEquals("", player.getName());
    }
}
