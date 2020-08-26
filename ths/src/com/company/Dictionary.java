package com.company;

//数据关系的定义：词典是若干个原文词汇及对应的译文词汇所构成的集合
public class Dictionary<K,V> {
    //数据对象的定义：词典由原文词汇表和译文词汇表组成
    public K[] keys;
    public V[] values;
    public int n;
    //基本操作：词典提供初始化、添加新词、删除词条、翻译等操作
    public Dictionary (int max){
        //初始化操作的定义
    }
    public void append (K k, V v){
        //添加新词的定义
    }
    public boolean delete (K k){
        //删除词条的定义
        return true;
    }
    public V translate(K k){
        //翻译操作的定义
        return values[0];
    }
    //其他操作定义
}