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
}
