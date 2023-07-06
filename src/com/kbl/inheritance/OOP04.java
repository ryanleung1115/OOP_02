package com.kbl.inheritance;

public class OOP04 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.setName("jason");
        pupil.setAge(10);
        pupil.setScore(90);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.setName("mike");
        graduate.setAge(20);
        graduate.setScore(100);
        graduate.showInfo();
    }
}

class Student {
    private String name;
    private int age;
    private double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

class Pupil extends Student {
    public void showInfo() {
        System.out.println("==============");
        System.out.println("pupil");
        System.out.println("name: " + getName());
        System.out.println("age: " + getAge());
        System.out.println("score: " + getScore());
    }
}

class Graduate extends Student {
    public void showInfo() {
        System.out.println("==============");
        System.out.println("graduate");
        System.out.println("name: " + getName());
        System.out.println("age: " + getAge());
        System.out.println("score: " + getScore());
    }
}