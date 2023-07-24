package com.improve10x.tdd.templerun;

public class Coin {

    private int value;

    public Coin(int value) {
        if (value < 0 || value > 100) {
            throw new InvalidCoinValueException();
        } else {
            this.value = value;
        }
    }

    public int getValue() {
        return value;
    }

    public class InvalidCoinValueException extends RuntimeException{
    }
}
