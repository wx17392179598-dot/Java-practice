/*
条件运算符：
（条件表达式）？值1：值2
如果条件表达式为true,则执行值1，否则执行值2
值1和值2需要时相同的类型或者兼容的类型

 */

public class ConditionTest {
    public static void main(String[] args) {
        String info = (2>1) ? "2大于1" : "2不大于1";
        System.out.println(info);

        double result = (2>1) ? 1 : 2.0;
        System.out.println(result);

        //练习一：获取两个整数的较大值
        int a = 10;
        int b = 20;
        int max = (a>b) ? a : b;
        System.out.println(max);

        //练习二：获取三个数的最大值
        int i = 20;
        int j = 30;
        int k = 23;
        int tempmax = (i > j) ? i : j;
        tempmax = (tempmax > k) ? tempmax : k;
        System.out.println(tempmax);


        //练习三：今天是周二，十天后是周几
        int week = 2;
        week += 10;
        week %= 7;


        System.out.println("今天是周二，十天后是周" + (week == 0 ? "日" : week ));

    }
}
