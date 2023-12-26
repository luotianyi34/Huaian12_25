package demo;

import java.util.LinkedHashSet;

public class MySet2 {
    /*LinkedHashSet  虚拟插入的顺序
    使用链表结构来维护set元素的顺序
    使元素看起来是以插入的顺序保存的
    取出的顺序与插入的顺序一致（多了一个链表）
    * */
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        set.add("ddd");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
