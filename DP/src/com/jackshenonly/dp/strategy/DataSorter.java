package com.jackshenonly.dp.strategy;

/**
 * Created by jackshenonly on 2017/3/8.
 */
public class DataSorter {

    public static void sort(Object[] a) {
        for(int i=0; i< a.length ; i++){
            for(int j=0; j< a.length-1; j++){
                Comparable a1 = (Comparable)a[j];
                Comparable a2 = (Comparable)a[j+1];
                if(a1.compareTo(a2) > 0){
                    swap(a,j,j+1);
                }
            }
        }
    }

    private static void swap(Object[] a, int x, int y) {
        Object temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void p(Object[] a) {
        for(int i=0;i < a.length ;i++){
            System.out.print(a[i]+",");
        }
        System.out.println("");
    }


    /*public static void sort(Cat[] a) {

        for(int i=0; i< a.length ; i++){
            for(int j=0; j< a.length-1; j++){
                if(a[j].getHeight() > a[j+1].getHeight()){
                    swap(a,j,j+1);
                }
            }
        }
    }

    private static void swap(Cat[] a, int x, int y) {
        Cat temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void p(Cat[] a) {
        for(int i=0;i < a.length ;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }*/
}
