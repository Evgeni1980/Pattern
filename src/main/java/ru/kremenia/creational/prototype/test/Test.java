package ru.kremenia.creational.prototype.test;

import ru.kremenia.creational.prototype.User;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("Ivan", "Ivanov", 30);
        User clone = user.clone();
        System.out.println(clone);
    }

}
