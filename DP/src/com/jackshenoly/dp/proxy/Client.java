package com.jackshenoly.dp.proxy;

/**
 * Created by jackshenonly on 2017/3/10.
 */
public class Client {
    public static void main(String[] args) {
        Tank t= new Tank();
        TankLogProxy tlp = new TankLogProxy(t);
        TankTimeProxy  ttp = new TankTimeProxy(tlp);

        ttp.move();
    }
}
