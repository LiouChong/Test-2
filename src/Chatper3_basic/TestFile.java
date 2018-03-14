package Chatper3_basic;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/*
反斜杠：\  需要写两个
 */
public class TestFile {

    public static void main(String[]args) throws Exception{
//        若想对文件进行读取操作，则需要创建一个Scanner对象
    /*    Scanner in = new Scanner(Paths.get("myFile.txt"), "UTF-8");
        String mes;
        while((mes = in.nextLine()) != null) {
            System.out.println(mes);
        }*/


//        若想对文件进行写入操作,则需要创建一个PrintWriter对象
        PrintWriter out = new PrintWriter("myFile.txt","UTF-8");
        out.write("CYZ");//为什么写不进去,并且要清空.

    }

}
