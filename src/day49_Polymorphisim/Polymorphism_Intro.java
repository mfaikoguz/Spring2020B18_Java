package day49_Polymorphisim;

class Animal extends Robot {

}

class Dog extends Animal {

}

class Cat extends Animal {

}

class Robot {

}

public class Polymorphism_Intro {

    public static void main(String[] args) {
        // Animal obj = new Animal();
        Animal obj2 = new Dog();
        Animal obj3 = new Cat();

        // Dog obj4 = new Cat(); // no is-a relationship
        Dog obj5 = new Dog();
        Cat obj6 = new Cat();
        Robot obj7 = new Robot();

        Animal[] animals = {obj5, obj6};
        Robot obj8 = new Animal();
        Robot obj9 = new Dog();
        Robot obj10 = new Cat();

        Robot[] robots = {obj2, obj3, obj5, obj6, obj7, obj8, obj9, obj10};
    }
}
