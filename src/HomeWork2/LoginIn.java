package HomeWork2;

import HomeWork2.UserInfo;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginIn {
    /*2.用户登录注册案例
*2.1定义集合ArrayList，存储用户的注册信息*
*2.2列出菜单（1)注册（2)登录（3)退出
    *2.3.1输入1时,请输入账号，请输入密码
    *2.3.2验证集合中是否有输入的账号密码，有就提示存在，重新输入，没有保存
    *2.3.3输入2登录，验证账号密码是否正确
    *2.3.4输入3退出,结束程序
账号和密码使用正则表达式验证6-16位,账号必须是字母(大小自定义)和数字密码必须是数字*/
    public static void main(String[] args) {
        ArrayList<UserInfo> userInfos = new ArrayList<>();
        userInfos.add(new UserInfo("admin123","123456"));//初始化一个值
        choice(userInfos);
    }
    public static void register(ArrayList<UserInfo> userInfos){
        //注册系统方法
        int flag;
        int Exist = 0;
        String name;
        String password;
        String regex_name = "[a-zA-Z][a-zA-Z0-9]{5,15}";//正则表达式验证6-16位,账号必须是字母(大小自定义)
        String regex_password = "[0-9]{6,16}";//正则表达式验证6-16位,数字密码必须是数字
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入注册的账户名:");
        do {
            flag =0;
            name = scanner.nextLine();
            if (!name.matches(regex_name)){
                System.out.println("账号第一位必须是字母,其他位不得有特殊符号,且为6-16位！");
                flag =1;
            }
        }while (flag!=0);
        System.out.println("请输入注册密码:");
        do {
            flag =0;
            password = scanner.nextLine();
            if (!password.matches(regex_password)){
                System.out.println("数字密码必须全是数字,且为6-16位！");
                flag =1;
            }
        }while (flag!=0);
        for (UserInfo userInfo : userInfos) {
            if (userInfo.getName().equals(name)){
                Exist=1;
            }else {
                Exist=0;
            }
        }
        if (Exist==1){
            System.out.println("注册失败！此账号已经被注册过！");
        }else {
            userInfos.add(new UserInfo(name,password));
            System.out.println("注册成功!");
        }
    }
    public static int login(ArrayList<UserInfo> userInfos){
        //登录系统方法
        int flag;
        String name;
        String password;
        String regex_name = "[a-zA-Z][a-zA-Z0-9]{5,15}";//正则表达式验证6-16位,账号必须是字母(大小自定义)
        String regex_password = "[0-9]{6,16}";//正则表达式验证6-16位,数字密码必须是数字
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账户名:");
        do {
            flag =0;
            name = scanner.nextLine();
            if (!name.matches(regex_name)){
                System.out.println("账号第一位必须是字母,其他位不得有特殊符号,且为6-16位！");
                flag =1;
            }
        }while (flag!=0);
        System.out.println("请输入密码:");
        do {
            flag =0;
            password = scanner.nextLine();
            if (!password.matches(regex_password)){
                System.out.println("数字密码必须全是数字,且为6-16位！");
                flag =1;
            }
        }while (flag!=0);
        if(userInfos.contains(new UserInfo(name,password))){
            System.out.println("登录成功！");
            System.out.println("正在进入主程序....");
            return 1;
        }else {
            System.out.println("登录失败！正在退回主界面......");
        }
        return 0;
    }
    public static void choice(ArrayList<UserInfo> userInfos){//传入userinfo列表便于后续进行输出
        Scanner scanner = new Scanner(System.in);
        int in;
        int flag;
        do {
            for (UserInfo userInfo : userInfos) {
                System.out.println(userInfo);
            }
            System.out.println("欢迎进入系统！\n请输入数字:1.注册;2.登录;3.退出");
            in = scanner.nextInt();//判断用户输入的数字
            flag=0;
            switch (in){
                case 1:
                    register(userInfos);
                    break;
                case 2:
                    if (login(userInfos)==1){
                        flag =1;
                    }
                    break;
                case 3:
                    flag = 1;//退出系统时则停止循环
                    break;
                default:
                    System.out.println("输入错误！请重新输入!");
            }
        }while (flag==0);
    }
}
