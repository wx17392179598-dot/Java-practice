/*
测试if-else的嵌套使用
    案例:
    由键盘输入三个整数分别存入变量num1、num2num3，对它们进行排序(使用if-else if-else)，并且从小到大输出。
 */


public class IfElseTest1 {
    public static void main(String[] args) {
        int num1 = 1000;
        int num2 = 330;
        int num3 = 70;
        if (num1 >= num2) {
            if (num1 <= num3) {
                System.out.println(num2 + "," + num1 + "," + num3);
            } else if (num3 >= num2) {
                System.out.println(num2 + "," + num3 + "," + num1);
            }else {
                System.out.println(num3 + "," + num2 + "," + num1);
            }
        } else {
            if (num3 <= num2) {
                System.out.println(num1 + "," + num3 + "," + num2);
            } else if (num1 <= num3) {
                System.out.println(num1 + "," + num2 + "," + num3);
            }else{
                System.out.println(num1 + "," + num3 + "," + num2);
            }
        }

    }
}
