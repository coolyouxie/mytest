package com.myproject.test.sync;

public class AgeThread3 implements Runnable {

    private People people;

    public void setPeople(People people){
        this.people = people;
    }

    @Override
    public void run() {
        People.setAge3(30);
    }
}
