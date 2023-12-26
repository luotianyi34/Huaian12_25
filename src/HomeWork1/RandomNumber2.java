package HomeWork1;

import java.util.Random;
import java.util.TreeSet;

public class RandomNumber2 {
    //TreeSet
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet();//TreeSet可以排序
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            if (!set.add(random.nextInt(20)+1)){
                i--;//若set.add增添失败说明存在重复则i--重新生成一个随机数
            }
        }
        for (Integer integer : set) {
            System.out.print(integer+"  ");//输出
        }
    }
}
