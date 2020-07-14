package com.company;

import java.util.ArrayList;

public class Queue {
    ArrayList<Object> list = new ArrayList<>();
    //入队
    public void in(Object o) {
        list.add(o);
    }
    //出队
    public Object out() {
        Object o = list.get(0);
        list.remove(o);
        return o;
    }
    //队是否为空
    public boolean isEmpty() {
        return list.isEmpty();
    }
    //队大小
    public int size() {
        return list.size();
    }
    //打印队元素
    @Override
    public String toString() {
        return String.valueOf(list);
    }
}
class main {
    public static void main(String[] args) {
//创建一个队列
        Queue queue = new Queue();
//入队
        for(int i=1;i<=10;i++){
            queue.in(i);
        }
//出队
        while(!queue.isEmpty()){
            System.out.println("队：" + queue.toString() + "\t队大小为：" + queue.size() + "\t出队元素为：" + queue.out());
        }
    }
}