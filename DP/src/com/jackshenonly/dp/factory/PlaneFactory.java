package com.jackshenonly.dp.factory;

/**
 * Created by jzfy on 2017/3/22.
 */
public class PlaneFactory extends Factory{

    @Override
    public Moveable create() {
        return new Plane();
    }
}
