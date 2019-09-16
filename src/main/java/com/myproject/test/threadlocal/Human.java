package com.myproject.test.threadlocal;

import lombok.Data;

@Data
public class Human {

    private Integer id;

    private String name;

    private int age;

    public Human(){
        super();
    }

    public Human(Integer id){
        this.id = id;
    }
    public Human(String name){
        this.name = name;
    }
    public Human(int age){
        this.age = age;
    }
    public Human(Integer id,String name){
        this.id = id;
        this.name = name;
    }
    public Human(Integer id,int age){
        this.id = id;
        this.age = age;
    }
    public Human(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Human(Integer id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
