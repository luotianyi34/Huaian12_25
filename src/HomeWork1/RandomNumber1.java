package HomeWork1;

import java.util.HashSet;
import java.util.Random;

public class RandomNumber1 {
/*1.获取10个不重复的1至20之间的随机数*/
    //hashset
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();//创建HashSet 目的在于不存在重复
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
