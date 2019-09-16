package com.myproject.test.sync;

public class Handler {

    public static void main(String[] args) {
        People people = new People();
        //第一种情况，类方法加synchronized
        /*AgeThread ageThread = new AgeThread();
        NameThread nameThread = new NameThread();
        ageThread.setPeople(people);
        nameThread.setPeople(people);
        Thread t1 = new Thread(ageThread);
        t1.setName("ageThread");
        Thread t2 = new Thread(nameThread);
        t2.setName("nameThread");
        t1.start();
        t2.start();*/

        //第二种情况静态方法加synchronized
        /*AgeThread1 ageThread1 = new AgeThread1();
        NameThread1 nameThread1 = new NameThread1();
        ageThread1.setPeople(people);
        nameThread1.setPeople(people);
        Thread t11 = new Thread(ageThread1);
        t11.setName("ageThread1");
        Thread t12 = new Thread(nameThread1);
        t12.setName("nameThread1");
        t11.start();
        t12.start();*/

        //第三种情况，类方法中加synchronized代码块
        /*AgeThread2 ageThread2 = new AgeThread2();
        NameThread2 nameThread2 = new NameThread2();
        ageThread2.setPeople(people);
        nameThread2.setPeople(people);
        Thread t21 = new Thread(ageThread2);
        t21.setName("ageThread1");
        Thread t22 = new Thread(nameThread2);
        t22.setName("nameThread1");
        t21.start();
        t22.start();*/

        //第四种情况，静态方法中加synchronized代码
        /*AgeThread3 ageThread = new AgeThread3();
        NameThread3 nameThread = new NameThread3();
        ageThread.setPeople(people);
        nameThread.setPeople(people);
        Thread t1 = new Thread(ageThread);
        t1.setName("ageThread1");
        Thread t2 = new Thread(nameThread);
        t2.setName("nameThread1");
        t1.start();
        t2.start();*/

        //第五种情况，synchronized代码块中调用方法
        AgeThread4 ageThread = new AgeThread4();
        NameThread4 nameThread = new NameThread4();
        ageThread.setPeople(people);
        nameThread.setPeople(people);
        Thread t1 = new Thread(ageThread);
        t1.setName("ageThread1");
        Thread t2 = new Thread(nameThread);
        t2.setName("nameThread1");
        t1.start();
        t2.start();

    }
}
