package com.myproject.test.threadlocal;

public class ThreadLocalTest {

    static class ResourceClass {
        public final static ThreadLocal<Human> threadLocal1 = new ThreadLocal<>();
        public final static ThreadLocal<Human> threadLocal2 = new ThreadLocal<>();
        public final static ThreadLocal<Human> threadLocal3 = new ThreadLocal<>();

        public final static ThreadLocal<String> threadLocal4 = new ThreadLocal<>();
        public final static ThreadLocal<String> threadLocal5 = new ThreadLocal<>();


    }

    static class ClassA {
        public void setOne(Human value) {
            ResourceClass.threadLocal1.set(value);
        }

        public void setTwo(Human value) {
            ResourceClass.threadLocal2.set(value);
        }

        public void setThree(Human value) {
            ResourceClass.threadLocal3.set(value);
        }

        public void setFour(String value) {
            ResourceClass.threadLocal4.set(value);
        }

        public void setFive(String value) {
            ResourceClass.threadLocal5.set(value);
        }
    }

    static class ClassB {
        public void display() {
            System.out.println(ResourceClass.threadLocal1.get().getName() + ","
                    + ResourceClass.threadLocal2.get().getAge() + ","
                    + ResourceClass.threadLocal3.get().getId());
        }

        public void display1(){
            System.out.println(ResourceClass.threadLocal4.get()+","+ResourceClass.threadLocal5.get());
        }
    }

    public static void main(String[] args) {
        final ClassA a = new ClassA();
        final ClassB b = new ClassB();
        for (int i = 0; i <10 ; i++) {
            final Human human = new Human();
            String threadName = "线程="+i;
            String threadValue = "value="+i;
            human.setName("Alex"+i);
            human.setAge(i+1);
            human.setId(i);
            new Thread(){
                @Override
                public void run(){
                    try {
                        a.setOne(human);
                        a.setTwo(human);
                        a.setThree(human);
                        a.setFour(threadName);
                        a.setFive(threadValue);
                        b.display();
                        b.display1();
                    } finally {
                        ResourceClass.threadLocal1.remove();
                        ResourceClass.threadLocal2.remove();
                        ResourceClass.threadLocal3.remove();
                        ResourceClass.threadLocal4.remove();
                        ResourceClass.threadLocal5.remove();
                    }
                }
            }.start();
        }
    }

}
