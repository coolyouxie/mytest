package com.myproject.test.compara;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestCompareTo {

    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        Human people0 = new Human();
        Human people1 = new Human();
        Human people2 = new Human();
        Human people3 = new Human();
        people0.setName("Alex");
        people0.setAge(30);
        people1.setName("Sundy");
        people1.setAge(20);
        people2.setName("Xie");
        people2.setAge(21);
        people3.setName("Alex");
        people3.setAge(18);
        list.add(people0);
        list.add(people1);
        list.add(people2);
        list.add(people3);
        Comparator<Human> comparator = new Comparator<Human>() {
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
        };

        list.sort(comparator);
        list.forEach(obj-> System.out.println(obj.getName()+","+obj.getAge()));
        Map<String,Human> map = new LinkedHashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Human human = list.get(i);
            Human tmpHuman = map.get(human.getName());
            if(tmpHuman!=null){
                continue;
            }
            map.put(human.getName(),human);
        }
        comparator = comparator.reversed();
        list.sort(comparator);
        list.forEach(obj-> System.out.println(obj.getName()+","+obj.getAge()));
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        String dateStr = "2019-09-01 00:00:00";
        try {
            Date date = df.parse(dateStr);
            System.out.println(df.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
