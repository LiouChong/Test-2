package Chatper3_basic;

import java.time.DayOfWeek;
import java.time.LocalDate;

/*
日历
首先获取当前日期，然后取出月份，天数。然后获取到本月份第一个天数，然后根据此天数获取到本月第一天的星期数，然后根据星期数打印空白
以完成将第一天与对应的星期对应。 然后当本月份数等于取出来的month时候，进行循环，依次打印天数，打印时候要天数加一，其中要进行判断
是否为当前天数，是否为周日，若为周日则换行处理，若为当前天数，则打印*号
 */
public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();   //3
        int today = date.getDayOfMonth();   //14

        date = date.minusDays(today-1);     //minusDays（XX）返回减去xx天数之后的日期
        DayOfWeek weekday = date.getDayOfWeek();    //星期三
        int value = weekday.getValue();     //3

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 0; i < value; i++) {
            System.out.print("   ");
        }
        while (date.getMonthValue() == month) {
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);    //返回加上传入的天数的日期
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
}