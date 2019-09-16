package com.myproject.test.sync;

public class AgeThread1 implements Runnable {

    private People people;

    public void setPeople(People people){
        this.people = people;
    }

    @Override
    public void run() {
        People.setAge1(30);
    }
}
