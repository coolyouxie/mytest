package com.myproject.test.serializable;

import com.alibaba.fastjson.JSON;

import java.io.*;

public class TestSerializable {

    final String test ;

    public TestSerializable(String test){
        this.test = test;
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Alex");
        serializable(human);
        System.out.println(human);
        convertSerializable(human);
        System.out.println();
    }

    private static void serializable(Human human){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Human.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(human);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void convertSerializable(Human human) {
        try {
            FileInputStream fileInputStream = new FileInputStream("Human.obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Human human1 = (Human)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println(JSON.toJSONString(human1));
            System.out.println(human==human1);
        } catch (IOException |ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
