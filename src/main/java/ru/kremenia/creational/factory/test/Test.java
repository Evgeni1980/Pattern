package ru.kremenia.creational.factory.test;

import ru.kremenia.creational.factory.CatFactory;
import ru.kremenia.creational.factory.DogFactory;
import ru.kremenia.creational.factory.MyFactory;

public class Test {

    private static void createAnimalAndSay(MyFactory myFactory){
        myFactory.getAnimal().say();
    }
    public static void main(String[] args) {
        createAnimalAndSay(new CatFactory());
        createAnimalAndSay(new DogFactory());
    }

}
