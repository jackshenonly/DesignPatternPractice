package com.jakcshenonly.dp.oo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jackshenonly on 2017/3/7.
 */
public class Farm {
    private List<Cow> cows = new ArrayList<Cow>();


    public Farm(List<Cow> cows) {
        this.cows = cows;
    }

    public void oneYearPast(){
        List <Cow> temp = new ArrayList<Cow>();
        for (Cow c :cows){
            temp.add(c.upup());
        }
        setCows(temp);
    }

    public void increaseCowNumber(Cow c){

        this.cows.add(c);
    }


    public List<Cow> getCows() {
        return cows;
    }

    public void setCows(List<Cow> cows) {
        this.cows = cows;
    }

    public static void  main(String args[]){
        List<Cow> tempCows = new ArrayList<Cow>();
        int START = 5;//农场初始牛为START岁。当N>=4  结果都为431头
        int YEAR = 20;//YEAR年后
        tempCows.add(new Cow(START));
        Farm farm = new Farm(tempCows);

        for (int i = 1 ; i <= YEAR ; i++){
            farm.oneYearPast();
            tempCows = farm.getCows();
            for (int j = 0 ;j<tempCows.size();j++){

                Cow c = tempCows.get(j);
                if(c.born()!=null){
                    farm.increaseCowNumber(c.born());
                }
            }
            System.out.println("第 "+i+" 年结束，有"+ farm.getCows().size() +"头牛。");

        }


    }

}
