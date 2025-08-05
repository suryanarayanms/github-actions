package com.prep.prep.playarea;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UnpredictableService {
    private final Random random = new Random();
    public void unpredicatable() {
        if (random.nextInt(4) != 0) {
            throw new RuntimeException("Random failure");
        }
        System.out.println("Successful run");
    }
}
