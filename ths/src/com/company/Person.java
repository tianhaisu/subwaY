package com.company;

public class Person {
//    public String name;
//    public int age;

    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {

    }

    public void study(String string){
        System.out.println(string);
    }
}
