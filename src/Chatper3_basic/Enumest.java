package Chatper3_basic;

public class Enumest {
    enum Size{SMALL,MEDIUM,LARGE,XL }

    public static void main(String[] args) {
        Size s1 = Size.LARGE;
        switch(s1){
            case SMALL:
                System.out.println("u choose small");
                break;
            case LARGE:
                System.out.println("u choose large");
                break;
        }
    }
}
