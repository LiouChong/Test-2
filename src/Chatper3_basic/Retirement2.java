package Chatper3_basic;

import java.util.Scanner;

public class Retirement2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;

        System.out.println("你每年存多少钱");
        double payment = in.nextDouble();

        System.out.println("每年的利率是多少");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;
        String input;

        //更新账户余额，当用户不准备退休的时候
        do{
            //加上今年的存款
            balance += payment;
            //计算今年的利息
            double interest = balance * interestRate/100;
            balance += interest;

            year++;
            System.out.printf(year + "年后，你的存款是：%,.2f%n",balance);
            System.out.println("是否选择退休(Y/N)");
            input = in.next();
        } while (input.equals("n"));
    }
}
