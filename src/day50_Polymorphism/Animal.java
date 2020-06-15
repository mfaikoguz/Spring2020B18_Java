package day50_Polymorphism;

public class Animal {
    /*
    Warmup tasks:
    1. cerate a class Animal
            variables: age, gender
            methods: eat, sleep
        DO NOT make abstract we need this for today's example
    2. create subclass of Animal named Cat
            variable: catName
            methods: scratch
    3. create subclass of Animal named Dog
            variable: dogName
            methods: bark
     */
    public int age;
    public char gender;

    public void eat() {
        System.out.println("eating...");
    }

    public void sleep() {
        System.out.println("sleeping...");
    }
}

final class Cat extends Animal {
    public String catName;

    public Cat(String catName, char gender, int age) {
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

class Dog extends Animal {
    public String dogName;

    public void bark() {
        System.out.println(dogName + " is barking...");
    }
}