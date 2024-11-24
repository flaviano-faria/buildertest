package com.buildertest.app;

import com.buildertest.builder.Person;

public class Main {
    public static void main(String[] args) {

        Person person = new Person.Builder().age(10).documentNumber("1234").build();
        System.out.println(person.getAge() + " " + person.getDocumentNumber());
    }
}