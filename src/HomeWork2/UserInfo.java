package HomeWork2;

public class UserInfo {
    String name;
    String password;

    public UserInfo(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        final int prime = 21;
        int result = 1;
//        result = prime*result+age;
        result = prime*result+((name==null)?0:name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj==null){
            return false;
        }
        if (getClass()!=obj.getClass()){
            return false;
        }
        UserInfo otherObj = (UserInfo)obj;
        if (this.name.equals(otherObj.name)&&this.password.equals(otherObj.password)){
            return true;//判断条件 只有当name和password都一致的情况下为true
        }else {
            return false;
        }
    }
}
