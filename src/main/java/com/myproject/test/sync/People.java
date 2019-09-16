package com.myproject.test.sync;

public class People {

    private int age;
    private String name;


    public synchronized void setAge(int age) {
        System.out.println(Thread.currentThread().getName() + "设置年龄开始并暂停3s");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.age = age;
        System.out.println(Thread.currentThread().getName() + ",age=" + this.age);
        System.out.println(Thread.currentThread().getName() + "设置年龄结束");
    }

    public int getAge() {
        return this.age;
    }

    public synchronized void setName(String name) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "设置名字开始");
        this.name = name;
        System.out.println(Thread.currentThread().getName() + ",name=" + this.name);
        System.out.println(Thread.currentThread().getName() + "设置名字结束");
    }

    public String getName() {
        return this.name;
    }


    public static synchronized void setAge1(int age) {
        System.out.println(Thread.currentThread().getName() + "设置年龄开始并暂停3s");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ",age=" + age);
        System.out.println(Thread.currentThread().getName() + "设置年龄结束");
    }

    public static synchronized void setName1(String name) {
        System.out.println(Thread.currentThread().getName() + "设置名字开始");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ",name=" + name);
        System.out.println(Thread.currentThread().getName() + "设置名字结束");
    }

    public void setAge2(int age) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + "设置年龄开始并暂停3s");
            this.age = age;
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ",age=" + this.age);
            System.out.println(Thread.currentThread().getName() + "设置年龄结束");
        }
    }

    public void setName2(String name) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + "设置名字开始");
            this.name = name;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ",name=" + this.name);
            System.out.println(Thread.currentThread().getName() + "设置名字结束");
        }
    }

    public static void setAge3(int age) {
        synchronized (People.class) {
            System.out.println(Thread.currentThread().getName() + "设置年龄开始并暂停3s");
            try {
                People.class.wait(10);
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ",age=" + age);
            System.out.println(Thread.currentThread().getName() + "设置年龄结束");
        }
    }

    public static void setName3(String name) {
        synchronized (People.class) {
            System.out.println(Thread.currentThread().getName() + "设置名字开始");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ",name=" + name);
            System.out.println(Thread.currentThread().getName() + "设置名字结束");
        }
    }

    public static void setAge4(int age) {
        System.out.println(Thread.currentThread().getName() + "设置年龄开始并暂停3s");
//        this.age = age;
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ",age=" + age);
        System.out.println(Thread.currentThread().getName() + "设置年龄结束");
    }

    public static void setName4(String name) {
        System.out.println(Thread.currentThread().getName() + "设置名字开始");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ",name=" + name);
        System.out.println(Thread.currentThread().getName() + "设置名字结束");
    }

    public void setName5(String name) {
        System.out.println(Thread.currentThread().getName() + "设置名字开始");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ",name=" + name);
        System.out.println(Thread.currentThread().getName() + "设置名字结束");
    }

}
