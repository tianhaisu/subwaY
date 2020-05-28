package com.test;

public class Person {
    public static void main(String[] args) {
        People p = new Student("Xiao Ming");
        p.run();

        Book b = new Student("高数");
        b.look();
    }
}

interface People {
    String getName();

    default void run() {
        System.out.println(getName() + " run");
    }
//    void test();

}

interface Hello extends People {
    String getAge();
}

class Run implements Hello {
    public String getName() {
        return null;
    }

    public String getAge() {
        return null;
    }
}

interface Book {
    String getName();

    default void look() {
        System.out.println(getName() + " look");
    }
}

class Student implements People, Book {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
//
//    @Override
//    public void test() {
//
//    }

}
