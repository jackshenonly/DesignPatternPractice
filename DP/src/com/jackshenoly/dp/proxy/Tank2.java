package com.jackshenoly.dp.proxy;

/**
 * Created by jackshenonly on 2017/3/10.
 */
public class Tank2 extends Tank {

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        super.move();
        long end = System.currentTimeMillis();

        System.out.println("lasted: "+(end - start));
    }
}
