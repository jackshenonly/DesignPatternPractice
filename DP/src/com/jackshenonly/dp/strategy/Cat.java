package com.jackshenonly.dp.strategy;

import java.text.NumberFormat;

/**
 * Created by jackshenonly on 2017/3/8.
 */
public class Cat implements Comparable{
    private int height;
    private int weight;
    private Comparator comparator = new CatWeightComparator();

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return height+"||"+weight;
    }

    @Override
    public int compareTo(Object o) {
        return comparator.compare(this,o);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



    public Comparator getComparator() {
        return comparator;
    }

    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }
}
