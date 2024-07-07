package com.exemple;

// Отображение открытых методов

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionDemo2 {
    public static void main(String[] args) {
        try {
            A a = new A();
            Class<?> с = a.getClass();
            System.out.println("Открытые методы: ");
            Method[] methods = с.getDeclaredMethods();
            for (int i = 0; i < methods.length; i++) {
                int modifiers = methods[i].getModifiers();
                if (Modifier.isPublic(modifiers)) {
                    System.out.println(" " + methods[i].getName());
                }
            }
        } catch (Exception е) {
            System.out.println("Возникло исключение " + е);
        }

    }
}

class A {
    public void a1() {
    }

    public void a2() {
    }

    protected void a3() {
    }

    private void a4() {
    }
}

/**
 * Вывод программы:
 * Открытые методы:
 *  a1
 *  a2
 */
