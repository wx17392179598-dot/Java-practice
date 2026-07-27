/*
案例2:如何交换两个int型变量的值?String呢?
 */

public class BitExer {
    public static void main(String[] args) {
        int m =10;
        int n =20;
        System.out.println("交换前: m = " + m + ", n = " + n);
        //方法一
//        int temp = n;
//        n = m;
//        m = temp;
        //方式二：优点：不需要定义临时变量，缺点：可能会出现溢出，实用性差（不适用非数值类型）
//        m = m + n;
//        n = m - n;
//        m = m - n;
        //方式三: 优点：不需要定义临时变量
        m = m ^ n;
        n = m ^ n;//(m ^ n) ^n ---->m
        m = m ^ n;
        System.out.println("交换后: m = " + m + ", n = " + n);
    }
}
