package com.myproject.test.sync;

public class AgeThread2 implements Runnable {

    private People people;

    public void setPeople(People people){
        this.people = people;
    }

    @Override
    public void run() {
        people.setAge2(30);
    }
}
