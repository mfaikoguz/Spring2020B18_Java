package day41_Inheritance;

public class Fish extends Animal {

    public void swim() {
        System.out.println(name + " is swimming");
    }

    public static void main(String[] args) {
        Fish fish1 = new Fish();
        fish1.name = "Fish";
        fish1.eat();
        fish1.moving();
        fish1.swim();;
    }
}
