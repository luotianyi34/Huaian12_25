package HomeWork3;


public class Student {
    //学生对象姓名语文数学外语成绩
    String name;
    int chinese_code;
    int maths_code;
    int english_code;

    public Student(String name, int chinese_code, int maths_code, int english_code) {
        this.name = name;
        this.chinese_code = chinese_code;
        this.maths_code = maths_code;
        this.english_code = english_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese_code() {
        return chinese_code;
    }

    public void setChinese_code(int chinese_code) {
        this.chinese_code = chinese_code;
    }

    public int getMaths_code() {
        return maths_code;
    }

    public void setMaths_code(int maths_code) {
        this.maths_code = maths_code;
    }

    public int getEnglish_code() {
        return english_code;
    }

    public void setEnglish_code(int english_code) {
        this.english_code = english_code;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chinese_code=" + chinese_code +
                ", maths_code=" + maths_code +
                ", english_code=" + english_code +
                ",总分="+(chinese_code+maths_code+english_code)+
                '}';
    }

}
