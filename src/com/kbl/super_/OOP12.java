package com.kbl.super_;

public class OOP12 {
    public static void main(String[] args) {
        E e = new E();
        e.say();
    }
}

class C {
    public void test() {
        System.out.println("test() in class C");
    }

    public void calc() {
        System.out.println("calc() in class C");
    }
}

class D extends C {
    // private void calc() {
    //     System.out.println("calc() in class D");
    // }
}

class E extends D {
    public void say() {
        calc();
        this.calc();
        super.calc();

        System.out.println("===============");
        test();
        this.test();
        super.test();
    }

    public void test() {
        System.out.println("test() in class E");
    }
}