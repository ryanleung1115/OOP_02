package com.kbl.super_;

public class OOP11 {
    public static void main(String[] args) {
        B b = new B();
        b.say();
    }
}

class A {
    public int n1 = 10;
    protected int n2 = 20;
    int n3 = 30;
    private int n4 = 40;

    public A() {
        System.out.println("A() default constructor is called");
    }

    public A(String name) {
        System.out.println("A(String name) non-default constructor is called");
    }

    public void test1() {
        System.out.println("test1()");
    }

    protected void test2() {
        System.out.println("test2()");
    }

    void test3() {
        System.out.println("test3()");
    }

    private void test4() {
        System.out.println("test4()");
    }
}

class B extends A {
    public B() {
        // super();
        super("test");
        System.out.println("B() default constructor is called");
    }

    public void say() {
        System.out.println(super.n1);
        System.out.println(super.n2);
        System.out.println(n3);
        // System.out.println(n4);

        super.test1();
        super.test2();
        test3();
        // test4();
    }
}