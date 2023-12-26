package demo;

public class Student2{
    String name;
    int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime*result+age;
//        result = prime*result+((name==null)?0:name.hashCode());
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this==obj){
//            return true;
//        }
//        if (obj==null){
//            return false;
//        }
//        if (getClass()!=obj.getClass()){
//            return false;
//        }
//        Student2 otherObj = (Student2)obj;
//        if (age!=otherObj.age){
//            return false;
//        }
//        if (name==null){
//            if (otherObj.name!=null){
//                return false;
//            }else if(!name.equals(otherObj.name)){
//                return false;
//            }
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(Student2 o) {
//        int n1 = this.name.compareTo(o.name);
//        //先比较name
//        int res = (n1==0)?(this.age-o.age):n1;
//        //判断name是否相同，如果相同就比较age 如果不相同 直接以name排序
////        return o.age-this.age;//从大到小排序 age
//        return res;
//    }
}
