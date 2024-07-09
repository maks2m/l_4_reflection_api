package com.exemple.analyze;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CodeAnalyzer {

    /**
     * Метод должен:
     * - определить, какого класса объект ему передали и вывести название класса в консоль
     * - определить названия всех полей этого класса, включая приватные, и вывести их в консоль
     * - определить названия всех методов этого класса, включая приватные, и вывести их в консоль
     *
     * @param o - объект для анализа
     */
    public static void analyzeClass(Object o) {
        // необходима реализация
        Class<?> clazz = o.getClass();
        System.out.println(clazz.getName());

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }


    }
}
