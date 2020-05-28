package com.company;

//class Student {
//    private String name;
//    private int age;
//    private int score;
//}

public class Student extends Person {
    // 不要重复name和age字段/方法,
    // 只需要定义新增score字段/方法:
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String hello() {
        return "Hello, " + name;
        // 这里使用 super.name，或者 this.name，或者 name，效果都是一样的。编译器会自动定位到父类的 name 字段
    }

    public Student(String name, int age, int score) {
        super(name, age);// 调用父类的构造方法Person(String, int)
        this.score = score;
    }

    public Student() {
        super();
    }

    public void study() {
        System.out.println("学生在学习");
    }

    public void run() {
        System.out.println("学生在跑步");
    }
}