package com.kbl.inheritance;

public class OOP07 {
    public static void main(String[] args) {
        Son son = new Son();
        // System.out.println(son.name);
        System.out.println(son.getName());
        System.out.println(son.age);
        System.out.println(son.hobby);
    }
}

class Grandpa {
    String name = "jason";
    String hobby = "running";
}

class Father extends Grandpa {
    String name = "mike";
    int age = 30;
}

class Son extends Father {
    private String name = "peter";

    public String getName() {
        return name;
    }
}