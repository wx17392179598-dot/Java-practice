/*
如何从键盘获取不同类型（基本数据类型，String类型）的变量： 使用Scanner类
1.使用Scanner获取不同类型数据的步骤
步骤1:导包 import java.util.Scanner
步骤2:提供(或创建)一个Scanner类的
步骤3:实例调用Scanner类中的方法，获取指定类型的变量
步骤4:关闭资源，调用Scanner类的close()

2.案例:小明注册某交友网站，要求录入个人相关信息。如下:
请输入你的网名、你的年龄、你的体重、你是否单身、你的性别等情况。

3.Scanner类中提供了byte/short/int/long/float/double/boolean/String等类型的变量获取方法
        注意，没有提供获取char类型变量的方法，需要使用next().charAt(0)方法获取char类型变量
 */
//步骤一
import java.util.Scanner;

public class ScanerTest {
    public static void main(String[] args) {
        //步骤二
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的网名");
        //步骤三
        String name = input.next();
        System.out.println("请输入你的年龄");
        int age = input.nextInt();
        System.out.println("请输入你的体重");
        double weight = input.nextDouble();
        System.out.println("请输入你是否单身（单身是true，不单身是false）");
        boolean isSingle = input.nextBoolean();
        System.out.println("请输入你的性别(男\\女）");
        char gender = input.next().charAt(0);
        System.out.println("你的网名是:" + name + ",年龄是:" + age + ",体重是:" + weight + ",是否单身:" + isSingle + ",性别是:" + gender);
        input.close();
    }
}
