package com.jackshenonly.dp.strategy;

/**
 * Created by jackshenonly on 2017/3/9.
 */
public class CatWeightComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Cat c1 = (Cat) o1;
        Cat c2 = (Cat) o2;
        if(c1.getWeight() < c2.getWeight()) return 1;
        else if (c1.getWeight() == c2.getWeight()) return 0;
        return -1;
    }
}
