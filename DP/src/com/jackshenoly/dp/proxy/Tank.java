package com.jackshenoly.dp.proxy;

import java.util.Random;

/**
 * Created by jackshenonly on 2017/3/10.
 */
public class Tank implements Moveable {
    @Override
    public void move() {
        System.out.println("Moving ...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
