package com.improve10x.scroing;

import org.testng.annotations.Test;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class ScoringTest {

    private Scoring scoring = new Scoring();

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnAllZeros() {
        int[] allZeros = scoring.calculateScores(null);
        assertArrayEquals(new int[3], allZeros);
    }

    @Test
    public void givenEmpty_returnAllZeros() {
        int[] allZeros = scoring.calculateScores("");
        assertArrayEquals(new int[3], allZeros);
    }

    @Test
    public void givenA_returnOneZeroZero() {
        int[] onlyAScores = scoring.calculateScores("A");
        assertArrayEquals(new int[] {1, 0, 0}, onlyAScores);
    }

    @Test
    public void givenB_returnZeroOneZero() {
        int[] onlyBScores = scoring.calculateScores("B");
        assertArrayEquals(new int[] {0, 1, 0}, onlyBScores);
    }

    @Test
    public void givenC_returnZeroZeroOne() {
        int[] onlyCScores = scoring.calculateScores("C");
        assertArrayEquals(new int[] {0, 0, 1}, onlyCScores);
    }

    @Test
    public void givenAB_returnOneOneZero() {
        int[] abScores = scoring.calculateScores("AB");
        assertArrayEquals(new int[] {1, 1, 0}, abScores);
    }

    @Test
    public void givenABC_returnAllOnes() {
        int[] abcScores = scoring.calculateScores("ABC");
        assertArrayEquals(new int[] {1, 1, 1}, abcScores);
    }

    @Test
    public void givenAABC_returnTwoOneOne() {
        int[] aabcScores = scoring.calculateScores("AABC");
        assertArrayEquals(new int[] {2, 1, 1}, aabcScores);
    }

    @Test
    public void givenABBC_returnOneTwoOne() {
        int[] abbcScores = scoring.calculateScores("ABBC");
        assertArrayEquals(new int[] {1, 2, 1}, abbcScores);
    }

    @Test
    public void givenABCC_returnOneOneTwo() {
        int[] abccScores = scoring.calculateScores("ABCC");
        assertArrayEquals(new int[] {1, 1, 2}, abccScores);
    }

    @Test
    public void givenABCBACC_returnOneOneTwo() {
        int[] abcbaccScores = scoring.calculateScores("ABCBACC");
        assertArrayEquals(new int[] {2, 2, 3}, abcbaccScores);
    }
}













