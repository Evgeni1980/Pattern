package ru.kremenia.creational.factory;

public class CatFactory extends MyFactory{

    @Override
    public Animal getAnimal() {
        return new Cat();
    }

}
