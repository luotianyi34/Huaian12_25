package demo;

import org.junit.Test;

import java.sql.Connection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Myset {
    /*set接口    HashSet   TreeSet
    哈希表
    底层 数组机制 存储对象的位置比较特殊
    将对象存入数组中，根据特定的数据算法（hashcode）进行结合，计算出对象在数组中的位置（index），把对象存在数组的对应的位置上
    这样的数组称为hash数组
    hashCode  调用Object类
    两个对象hashcode算法的值不同 被称为hash冲突 index下标不一样
    equals  方法返回的true  就不会把第二个对象存入hash表中
            方法返回的false 就存入第二个对象
    为了保证集合中元素的唯一性  Set集合
    Set是如何避免元素重复的？
    Set重写了hashCode和equals方法 建立属于当前对象的比较
    特点:1.去重
        2.存放顺序时根据hashcode值来定的
        3.hashset可以存空值
        线程不安全的
        如果有多个线程同时访问hashset 线程外部锁 synchronized
    如果自定义的对象存到hashset中 需要我们自己重写hashcode和equals方法

    * */
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("");
        set.add(null);
        String s1 = new String("ccc");
        String s2 = new String("ddd");
        set.add(s1);
        set.add(s2);
        set.add("eee");

        for (String s : set) {
            System.out.println(s);//输出时和输入的顺序不一样
            //根据在哈希表的位置来输出
        }
    }
    @Test
    public void Students(){
        HashSet<Student> set = new HashSet<>();
        set.add(new Student("周杰伦",33));
        set.add(new Student("刘德华",22));
        set.add(new Student("张学友",24));
        set.add(new Student("薛之谦",15));
        set.add(new Student("薛之谦",15));
        set.add(new Student("薛之谦",25));
        for (Student student : set) {
            System.out.println(student);
        }
    }
}
