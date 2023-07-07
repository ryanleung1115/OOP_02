package com.kbl.override;

public class OOP13 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak("jason");

        System.out.println("=================");
        Dog dog = new Dog();
        dog.speak("mike");
        dog.move();
    }
}

class Animal {
    public void speak(String name) {
        System.out.println("animal " + name + " speaks");
    }

    public void move() {
        System.out.println("animal walks");
    }
}

class Dog extends Animal {
    public void speak(String name) {
        System.out.println("dog " + name + " speaks");
    }
}