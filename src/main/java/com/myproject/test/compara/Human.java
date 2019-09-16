package com.myproject.test.compara;

import lombok.Data;

import java.util.Comparator;

@Data
public class Human implements Comparator<Human> {
    private Integer id;
    private String name;
    private int age;

    @Override
    public int compare(Human o1, Human o2) {
        int age1 = o1.getAge();
        int age2 = o2.getAge();
        if(age1>age2){
            return 1;
        }else if(age1<age2){
            return -1;
        }
        return 0;
    }
}
