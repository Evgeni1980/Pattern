package ru.kremenia.creational.builder.test;

import ru.kremenia.creational.builder.User;

public class Test {

    public static void main(String[] args) {
        User user = User.newBuilder().withName("Ivan")
                .withUsername("Petrov")
                .withAddress("Moscow")
                .withAge(30)
                .withEmail("100500@qwe.ru")
                .withHeight(175)
                .withWeight(75)
                .build();
        System.out.println(user);
    }

}
