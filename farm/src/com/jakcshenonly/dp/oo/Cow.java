package com.jakcshenonly.dp.oo;

/**
 * Created by jackshenonly on 2017/3/7.
 */
public class Cow {

    private int age;

    public Cow(int age) {
        this.age = age;
    }

    public Cow upup(){
        return new Cow(this.getAge()+1);
    }

    public void increaseAge(){
        this.age ++;
    }

    public Cow born(){

        if(this.age>=5)  return new Cow(0);
        else return null;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
