package com.myproject.test.sync;

public class AgeThread4 implements Runnable {

    private People people;

    public void setPeople(People people){
        this.people = people;
    }

    @Override
    public void run() {
        synchronized (People.class){
            people.setAge4(30);
        }
    }
}
