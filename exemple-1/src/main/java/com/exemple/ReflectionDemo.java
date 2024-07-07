package com.exemple;

// Демонстрация применения рефлексии.

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            Class<?> testClass = Class.forName("java.awt.Dimension");
            System.out.println("Koнcтpyктopы: ");
            Constructor<?>[] constructors = testClass.getConstructors();
            for (int i = 0; i < constructors.length; i++) {
                System.out.println(" " + constructors[i]);
            }
            System.out.println("Пoля: ");
            Field[] fields = testClass.getFields();
            for (int i = 0; i < fields.length; i++) {
                System.out.println(" " + fields[i]);
            }
            System.out.println("Meтoды : ");
            Method[] methods = testClass.getMethods();
            for (int i = 0; i < methods.length; i++) {
                System.out.println(" " + methods[i]);
            }
        } catch (Exception е) {
            System.out.println("Возникло исключение " + е);
        }
    }
}
