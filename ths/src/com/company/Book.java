package com.company;

public class Book {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 10 || price > 100) {
            throw new IllegalArgumentException("参数超出范围");
        }
        this.price = price;
    }

    // private方法:
    private int add() {
        return 2 + this.price;
    }

    public int getTotal() {
        return add(); // 调用private方法
    }

    public void useNameAndPrice(String name, int price) {

    }

    private String[] names;

    public String getNames() {
        return this.names[0] + " " + this.names[1];
    }

    public void setNames(String[] name) {
        this.names = name;
    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Book() {

    }

    public Book(String name) {
        this.name = name;
    }

}
