package com.improve10x.tdd.templerun;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CoinTest {

    @Test
    public void givenMinusOne_throwsInvalidCoinValueException() {
        assertThrows(Coin. InvalidCoinValueException.class, () -> new Coin(-1),
                "Coin value should be between 0 to 100");
    }

    @Test
    public void given101_throwsInvalidCoinValueException() {
        assertThrows(Coin.InvalidCoinValueException.class, () -> new Coin(101),
                "Coin value should be between 0 to 100");
    }
}
