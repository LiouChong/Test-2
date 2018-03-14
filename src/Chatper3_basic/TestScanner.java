package Chatper3_basic;

import java.io.Console;
import java.util.Scanner;
/*
因为输入是可见的，所以Scanner类不适用于从控制台获取密码。所以Java SE6特别引入的Console类实现这个目的
 */
public class TestScanner {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        // 获取Console对象 注：只能在控制台输入
        Console cons = System.console();
        if(cons != null){
            System.out.println();
            // 输入用户名，后面的格式参数省略
            String name = cons.readLine("name: ");
            // 输入密码， 后面的格式参数省略
            char[] pwd = cons.readPassword("password: ");
            System.out.println("Hello! \nYour name is: " + name);
            System.out.println("Your password is: " + new String(pwd));
        } else {
            System.out.println("Couldn't get Console instance, maybe you're running this from within an IDE?");
            System.exit(0);
        }
    }
}
