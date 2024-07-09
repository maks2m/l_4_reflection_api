package com.exemple;

import com.exemple.analyze.CodeAnalyzer;
import com.exemple.testclass.Cat;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Test1Application {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 3);
        CodeAnalyzer.analyzeClass(cat);

        try {
            Class<? extends Cat> aClass = cat.getClass();
            Field name = aClass.getDeclaredField("name");
            name.setAccessible(true);
            String n = (String) name.get(cat);
            System.out.println(n);
            name.set(cat, "murzic");
            System.out.println(cat.getName());

            Cat cat1 = aClass.getDeclaredConstructor().newInstance();
            System.out.println(cat1);

            Class[] params = {String.class, int.class};
            Cat cat2 = aClass.getConstructor(params).newInstance("test", 10);
            System.out.println(cat2);

            Class[] params3 = {String.class};
            Constructor<? extends Cat> declaredConstructor = aClass.getDeclaredConstructor(params3);
            declaredConstructor.setAccessible(true);
            Cat cat3 = declaredConstructor.newInstance("test3");
            System.out.println(cat3);

        } catch (Exception e) {
            e.printStackTrace();
        }





    }
}
