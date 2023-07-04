package com.kbl.encap;

public class OOP01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("jason");
        p.setAge(20);
        p.setSalary(10000);
        System.out.println(p);
    }
}

class Person {
    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("name must be 2 to 6 characters");
            this.name = "unknown";
        }
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("age must be 1 to 120");
            this.age = 0;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
    }
}