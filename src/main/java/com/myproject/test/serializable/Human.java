package com.myproject.test.serializable;

import lombok.Data;

import java.io.Serializable;
import java.util.Comparator;

@Data
public class Human implements Comparator<Human>, Serializable {

    private final double num1;

    private final int num2;

    private final long num3;

    private final byte num4;

    private final short num5;

    private final boolean flag;

    private final char charater;

    private final float num6;

    private Integer id;

    private String name;

    private int age;

    private static final String testFinal = null;

    /**
     * static变量不会被序列化
     */
    private static String gender;

    private final String country = "CN";

    //transient修饰的变量不会被序列化
    private transient String email = "93329962@qq.com";

    //不会被序列化，网上有部分人说transient不会影响final变量的序列化其实是错误的
    private final transient String province = "安徽";

    public Human(){
        this.num1 = 1.1d;
        this.num2 = 2;
        this.num3 = 3;
        this.num4 = 4;
        this.num5 = 5;
        this.num6 = 6;
        this.charater = 'A';
        this.flag = true;
    }


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

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.num1);
        System.out.println(human.num2);
        System.out.println(human.num3);
        System.out.println(human.num4);
        System.out.println(human.num5);
        System.out.println(human.num6);
        System.out.println(human.charater);
        System.out.println(human.flag);
    }

    public static void test(final String name,final int num){
        System.out.println(name+","+num);
    }

}
