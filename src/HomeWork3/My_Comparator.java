package HomeWork3;

import demo.Student2;

import java.util.Comparator;

public class My_Comparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int sum1=o1.chinese_code+o1.maths_code+o1.english_code;
        int sum2=o2.chinese_code+o2.english_code+o2.maths_code;
        int num = sum2-sum1;
        int n1 = o1.name.compareTo(o2.name);
        if(n1 == 0){
            if (o1.chinese_code==o2.chinese_code&&o1.maths_code==o2.maths_code&&o1.english_code==o2.maths_code){
                return 0;
            }else {
                return num;
            }
        }
        return num;
    }
}
