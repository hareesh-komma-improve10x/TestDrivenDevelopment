package com.improve10x.tdd.templerun;

public class Coin {
    public Coin(int value) {
        throw new InvalidCoinValueException();
    }

    public class InvalidCoinValueException extends RuntimeException{
    }
}
