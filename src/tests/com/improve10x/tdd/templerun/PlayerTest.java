package com.improve10x.tdd.templerun;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlayerTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNameNull_whenGetNameCalled_thenReturnEmpty() {
        Player player = new Player(null);
        assertEquals("", player.getName());
    }

    @Test
    public void givenNameEmpty_whenGetNameCalled_thenReturnEmpty() {
        Player player = new Player("");
        assertEquals("", player.getName());
    }

    @Test
    public void givenNameExplorer_whenGetNameCalled_thenReturnExplorer() {
        Player player = new Player("Explorer");
        assertEquals("Explorer", player.getName());
    }

    @Test
    public void givenNameExplorerWithSpaces_whenGetNameCalled_thenReturnExplorerTrimmed() {
        Player player = new Player("Explorer  ");
        assertEquals("Explorer", player.getName());
    }

    @Test
    public void givenNoHealth_whenGetHealthCalled_thenReturn100() {
        Player player = new Player("Name");
        assertEquals(100, player.getHealth());
    }

    @Test
    public void givenHealthMinusOne_thenThrowsInvalidHealthException() {
        assertThrows(Player.InvalidHealthException.class,
                () -> new Player("Name", -1),
        "Health should be between 0 and 100");
    }

    @Test
    public void givenHealth101_thenThrowsInvalidHealthException() {
        assertThrows(Player.InvalidHealthException.class,
                () -> new Player("Name", 101),
                "Health should be between 0 and 100");
    }

    @Test
    public void givenHealth100_whenGetHealthCalled_thenReturn100() {
        Player player = new Player("Name", 100);
        assertEquals(100, player.getHealth());
    }

    @Test
    public void givenHealth90_whenGetHealthCalled_thenReturn90() throws Player.InvalidHealthException {
        Player player = new Player("Name", 90);
        assertEquals(90, player.getHealth());
    }
}
