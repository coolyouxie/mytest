package com.myproject.test.sync;

public class NameThread implements Runnable{

    private People people;

    public void setPeople(People people){
        this.people = people;
    }

    @Override
    public void run() {
        people.setName("Alex");
    }
}
