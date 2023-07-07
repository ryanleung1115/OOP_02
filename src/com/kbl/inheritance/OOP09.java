package com.kbl.inheritance;

public class OOP09 {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A {
    public A() {
        // super();
        System.out.println("A()");
    }
}

class B extends A {
    public B() {
        // super();
        System.out.println("B()");
    }

    public B(String name) {
        // super();
        System.out.println("B(String name)");
    }
}

class C extends B {
    public C() {
        this("hello");
        System.out.println("C()");
    }

    public C(String name) {
        super("test");
        System.out.println("C(String name)");
    }
}