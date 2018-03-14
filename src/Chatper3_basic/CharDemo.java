package Chatper3_basic;
import static java.lang.Math.*;

public class CharDemo {
    public static void main(String[] args) {
        String greet = "Hello AOTO";
        int cpCount = greet.codePointCount(0,greet.length());
        char cpCount2 = (char)greet.codePointAt(6);
//        int cpCount2 = greet.offsetByCodePoints(5,1);
        System.out.println(cpCount2);
    }
}
