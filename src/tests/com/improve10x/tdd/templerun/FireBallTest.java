package com.improve10x.tdd.templerun;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class FireBallTest {

    @Test
    public void  givenMinusOne_throwsInvalidFireBallSpeedException(){
        assertThrows(FireBall.InvalidFireBallSpeedException.class,
                () -> new FireBall(-1),
                "Fireball speed should be between 0 to 100");
    }
}
