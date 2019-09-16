package com.myproject.test.sync;

public class NameThread1 implements Runnable{

    private People people;

    public void setPeople(People people){
        this.people = people;
    }

    @Override
    public void run() {
        People.setName1("Alex");
    }
}
