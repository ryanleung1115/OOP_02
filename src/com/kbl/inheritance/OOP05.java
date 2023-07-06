package com.kbl.inheritance;

public class OOP05 {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.say();
    }
}

class Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() {
        System.out.println("default constructor of base class");
    }

    public int getN4() {
        return n4;
    }

    public void setN4(int n4) {
        this.n4 = n4;
    }

    public void test1() {
        System.out.println("test1");
    }

    protected void test2() {
        System.out.println("test2");
    }

    void test3() {
        System.out.println("test3");
    }

    private void test4() {
        System.out.println("test4");
    }

    public void callTest4() {
        test4();
    }
}

class Sub extends Base {
    public Sub() {
        // super();
        System.out.println("default constructor of sub-class");
    }

    public void say() {
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(getN4());

        test1();
        test2();
        test3();
        callTest4();
    }
}