package com.buildertest.builder;

public class Person {

    private int age;
    private String name;
    private String documentNumber;

    Person(Builder builder){
    	this.age = builder.age;
    	this.documentNumber = builder.documentNumber;
    	this.name = builder.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public static class Builder {

        private int age;
        private String name;
        private String documentNumber;


        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }


        public Builder documentNumber(String documentNumber) {
            this.documentNumber = documentNumber;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }


}
