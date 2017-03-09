package com.jackshenoly.dp.proxy;

/**
 * Created by jackshenonly on 2017/3/10.
 */
public class TankTimeProxy implements Moveable {

    Moveable t;

    public TankTimeProxy(Moveable t) {
        this.t = t;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println( start + " ");
        t.move();
        long end = System.currentTimeMillis();
        System.out.println(""+end+ " lasted: "+(end - start));
    }
}
