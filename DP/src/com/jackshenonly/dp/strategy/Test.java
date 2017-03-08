package com.jackshenonly.dp.strategy;

/**
 * Created by jackshenonly on 2017/3/8.
 */
public class Test {
    public static void main(String[] args) {
//        int [] a =  {9,5,7,3,1
        Cat [] a = {new Cat(7,7),new Cat(2,2),new Cat(5,5)};
        DataSorter.sort(a);
//        java.util.Arrays.sort(a);
        DataSorter.p(a);
    }
}
