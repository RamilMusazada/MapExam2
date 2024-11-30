package org.example;

public class Task2 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        Animal cat = new Cat();
        cat.makeSound();
    }}

abstract class Animal{
    abstract void makeSound();
}
class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("Hav hav");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Miav miav");
    }
}