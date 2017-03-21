package com.jackshenonly.dp.factory;

/**
 * Created by jzfy on 2017/3/22.
 */
public class CarFactory extends Factory{

    @Override
    public Moveable create() {
        return new Car();
    }
}
