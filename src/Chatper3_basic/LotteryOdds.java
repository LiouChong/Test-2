package Chatper3_basic;

import java.util.Scanner;

/*
彩票中奖几率
 */
public class LotteryOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("多少个彩票里面选？");
        int m = in.nextInt();
        System.out.println("一共需要选几个？");
        int n = in.nextInt();

        int lotteryOdd = 1;
        for (int i = 1; i <= n; i++) {
            lotteryOdd = lotteryOdd * (m - i + 1) / i;
        }
        System.out.println("彩票中奖几率为：1/" + lotteryOdd);
    }
}

