package com.improve10x.tdd.templerun;

public class FireBall {

    public int speed;

    public FireBall(int speed) {
        this.speed = speed;
        if (speed < 0) {
            throw new InvalidFireBallSpeedException();
        }
    }

    public class InvalidFireBallSpeedException extends RuntimeException{
    }
}
