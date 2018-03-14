package Chatper3_basic;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s1 = "Hello";
        String s2 = "CYZ";
        sb.append(s1);
        sb.append(s2);
        sb.insert(5," love ");
        String console = sb.toString();
        System.out.println(console);
    }
}
