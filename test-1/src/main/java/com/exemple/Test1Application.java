package com.exemple;

import com.exemple.analyze.CodeAnalyzer;
import com.exemple.testclass.Cat;

public class Test1Application {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 3);
        CodeAnalyzer.analyzeClass(cat);
    }
}
