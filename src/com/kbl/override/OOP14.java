package com.kbl.override;

public class OOP14 {
    public static void main(String[] args) {

    }
}

class A {
    public Object test() {
        return null;
    }

    // public String test2() {
    //     return null;
    // }
}

class B extends A {
    public String test() {
        return null;
    }

    // public Object test2() {
    //     return null;
    // }
}