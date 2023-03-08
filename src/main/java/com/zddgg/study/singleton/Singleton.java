package com.zddgg.study.singleton;

import java.util.Objects;

public class Singleton {
    private volatile static Singleton INSTANCE = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (Objects.isNull(INSTANCE)) {
            synchronized (Singleton.class) {
                if (Objects.isNull(INSTANCE)) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}

class Singleton1 {
    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return InnerClass.INSTANCE;
    }

    private static class InnerClass {
        private static final Singleton1 INSTANCE = new Singleton1();
    }
}

enum Singleton2 {
    INSTANCE;

    public void doSomeThing() {
    }
}
