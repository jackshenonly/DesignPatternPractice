package com.jackshenoly.dp.proxy;

/**
 * Created by jackshenonly on 2017/3/10.
 */
public class TankLogProxy implements Moveable {
    Moveable t;

    public TankLogProxy(Moveable t) {
        this.t = t;
    }

    @Override
    public void move() {
        System.out.println("LOG : Start Moving.");
        t.move();
        System.out.println("LOG : End Movind.");
    }
}
