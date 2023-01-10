package ru.kremenia.creational.singleeton.test;

import ru.kremenia.creational.singleeton.Singleton;

public class Test {

    private static void func(){
        Singleton.getINSTANCE().print();
    }

    public static void main(String[] args) {
        for (int i=0; i<10;i++){
            new Thread(Test::func).start();
        }
    }

}
