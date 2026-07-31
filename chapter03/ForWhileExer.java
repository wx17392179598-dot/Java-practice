/*
案例:从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
 */
import java.util.Scanner;

public class ForWhileExer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;//记录输入正数的个数
        int num2 = 0;//记录输入负数的个数

        while (true){
            System.out.println("请输入一个整数（输入0时候退出程序）");
            int num = sc.nextInt();//获取用户输入的整数
            if (num > 0){
                num1++;
            }else if (num < 0){
                num2++;
            }else {
                System.out.println("程序结束");
                break;

            }
        }
        System.out.println("正整数个数为"+num1);
        System.out.println("负整数个数为"+num2);
        sc.close();
    }
}
