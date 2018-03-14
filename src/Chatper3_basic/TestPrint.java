package Chatper3_basic;

public class TestPrint {
    public static void main(String args[]) {
        double x = 10000.0 / 3.0;
//        %n.mf 用八个字符的宽度和小数点后两个字符的精度打印x（符号及小数点也要占位数）。因此打印出来又一个空格。
        System.out.printf("%8.2f", x);
        System.out.println();
        System.out.printf("%e",1.59e+01);
        System.out.println();
        System.out.printf("%+,.2f", 10000.0/3.0);

//        可以用静态的String.format方法创建一个格式化的字符串
        String name = "Liu Chong";
        int age = 22;
        String messge = String.format("Hello, %s. Next year, you'll be %d", name,age);

    }
}
