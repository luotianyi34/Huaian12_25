package HomeWork3;

import java.util.Scanner;
import java.util.TreeSet;

public class HomeWork3 {
    /*3.键盘录入学生信息按照总分排序
    *学生对象姓名语文数学外语成绩
    输入5个学生的信息
    封装对象存入TreeSet按照总分排序/
     */
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>(new My_Comparator());//按照总分从大到小来进行排序
        put_in(set);
        for (Student student : set) {
            System.out.println(student);
        }
    }
    public static void put_in(TreeSet<Student> set){
        String name;
        String str_code;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"个学生的信息:");
            System.out.println("姓名:");
            name = scanner.nextLine();
            System.out.println("请输入语文，数学，外语的分数(中间请用空格隔开)");
            str_code = scanner.nextLine();
            String[] split = str_code.split(" ");
            int[] num = new int[split.length];
            for(int j = 0 ; j < num.length ; j++){
                num[j] = Integer.parseInt(split[j]);
            }
            set.add(new Student(name,num[0],num[1],num[2]));
        }
    }
}
