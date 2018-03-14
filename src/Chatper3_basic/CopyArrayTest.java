package Chatper3_basic;

import java.util.Arrays;

public class CopyArrayTest {
    public static void main(String[] args) {
        int[] i1 = new int[] {0,1,2,3,4};
        int[] i2 = i1;
        i2[1] = 100;
        System.out.println(Arrays.toString(i1));

        //第二个参数是新数组的长度。多余的元素将会被复制为0或null……
        int[] copyi1 = Arrays.copyOf(i1,i1.length);
        copyi1[2] = 200;
        System.out.println(Arrays.toString(i1));
        System.out.println(Arrays.toString(copyi1));

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(copyi1);
    }
}
