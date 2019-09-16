package com.myproject.test.sync;

public class AgeThread implements Runnable {

    private People people;

    public void setPeople(People people){
        this.people = people;
    }

    @Override
    public void run() {
        people.setAge(30);
    }
}
