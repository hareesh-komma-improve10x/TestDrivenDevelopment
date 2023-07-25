package com.improve10x.tdd.templerun;

public class FireBall {

    private int speed;

    public FireBall(int speed) {
        this.speed = speed;
        if (speed < 0 || speed > 100) {
            throw new InvalidFireBallSpeedException();
        }
    }

    public void roll() {
        System.out.println("FireBall is rolled with " + speed + " kmh speed!");
    }

    public class InvalidFireBallSpeedException extends RuntimeException{
    }
}
