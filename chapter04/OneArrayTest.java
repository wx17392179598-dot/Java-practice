import java.util.Scanner;

public class OneArrayTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2;
        num2 = 20;
        //声明数组
        double[] prices;
        //数组初始化
        //静态初始化：数组变量的赋值与数组元素的赋值操作同时进行
        prices = new double[]{20.32,43,43.22};
        //动态初始化：数组变量的赋值与数组元素的赋值操作分开进行
        String[] foods = new String[4];
        //其他的正确的方式
        int arr[] = new int[4];
        int [] arr1 = {1,2,3,4};//类型推断

        //2.数组元素的调用
        //通过角标的方式，获取数组的元素
        //角标范围从0开始，到数组的长度-1结束
        System.out.println(prices[0]);
        System.out.println(prices[1]);
        //System.out.println(prices[4]);//报异常，超出数组长度
        foods[0] = "苹果";
        foods[1] = "香蕉";
        foods[2] = "橙子";
        foods[3] = "葡萄";
        //foods[4] = "榴莲";//报异常，超出数组长度
        //3。数组的长度：用来描述数组的大小
        //使用length属性表示
        System.out.println(foods.length);
        System.out.println(prices.length);
        //4.数组的遍历
//        System.out.println(prices[0]);
//        System.out.println(prices[1]);
//        System.out.println(prices[2]);
//        System.out.println(prices[3]);
        for (int i = 0; i < 4; i++) {
            System.out.println(foods[i]);
        }
        for (int i = 0; i < foods.length ; i++) {
            System.out.println(foods[i]);
        }
        for (int i = 0; i < prices.length ; i++) {
            System.out.println(prices[i]);
        }

    }
}
