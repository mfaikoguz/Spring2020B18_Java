package day50_Polymorphism;

public abstract class Animal { // 2 var, 2 methods

    public int age;
    public char gender;

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public static void methodA() {
        System.out.println("Animal Class");
    }
}

final class Cat extends Animal {
    public String catName;

    public Cat(String catName, char gender, int age) { // 3 variables 3 methods
        this.catName = catName;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(catName + " is eating...");
    }

    @Override
    public void sleep() {
        System.out.println(catName + " is sleeping...");
    }

    public void scratch() {
        System.out.println(catName + " is scratching...");
    }
}

final class Dog extends Animal { // 3 var, 3 methods
    public String dogName;

    public Dog(String dogName, int age, char gender) {
        this.dogName = dogName;
        this.age = age;
        this.gender = gender;
    }

    public void eat() {
        System.out.println("Dog " + dogName + " is eating");
    }

    public void sleep() {
        System.out.println("Dog " + dogName + " is sleeping");
    }

    public void bark() {
        System.out.println("Dog " + dogName + " is barking");
    }


    public static void methodA(int a) {
        System.out.println("Dog Class A");
    }
}