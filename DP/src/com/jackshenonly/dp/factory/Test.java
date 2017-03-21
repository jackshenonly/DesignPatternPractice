package com.jackshenonly.dp.factory;

/**
 * Created by jzfy on 2017/3/22.
 */
public class Test {
    public static void main(String[] args) {
        Factory fct = new PlaneFactory();
        Moveable m = fct.create();
        m.run();
    }
}
