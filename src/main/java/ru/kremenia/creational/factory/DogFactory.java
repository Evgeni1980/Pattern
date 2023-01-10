package ru.kremenia.creational.factory;

public class DogFactory extends MyFactory{

    @Override
    public Animal getAnimal() {
        return new Dog();
    }

}
