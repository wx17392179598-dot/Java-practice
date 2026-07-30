/*
测试运算符的使用5：位运算符
1 << >>  >>> % | ^ ~
2 说明：
    << >>  >>> % | ^ ~针对数值类型的变量或常量进行运算，运算结果为数值
    <<: 在一定范围内，每向左移动一位，结果就在原有基础上*2（正数负数都适用）
    >>: 在一定范围内，每向左移动一位，结果就在原有基础上/2（正数负数都适用）
    >>>:无符号右移，忽略符号运算
3 面试题：高效方式计算2*8
    2 << 3或者8 << 1

 */

public class BitTest {
    public static void main(String[] args) {
        int num1 = 7;
        System.out.println("num1 << 1 = " + (num1 << 1));
        System.out.println("num1 << 2 = " + (num1 << 2));
        System.out.println("num1 << 3 = " + (num1 << 3));
        System.out.println("num1 << 28 = " + (num1 << 28));
        System.out.println("num1 << 29 = " + (num1 << 29));//负数

        int num2 = -7;
        System.out.println("num2 << 1 = " + (num2 << 1));
        System.out.println("num2 << 2 = " + (num2 << 2));
        System.out.println("num2 << 3 = " + (num2 << 3));

    }
}
