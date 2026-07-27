/*
测试运算符的作用：赋值运算符
1.= += -= *= /= %=
2.说明
    += -= *= /= %= 是复合赋值运算符，它们是简写形式，例如 a += 5 等价于 a = a + 5
    会自动强制类型转换，避免了强制类型转换的麻烦
    支持连续赋值
    += -= *= /= %= 不会改变运算符两边的变量类型
 */



public class SetValueTest {
    public static void main(String[] args) {

        int i = 5;

        long l = 10;

        byte b = (byte)i;

        // 操作方式1：
        int a1 = 10;
        int b1 = 10;

        //操作方式2：连续赋值
        int a2;
        int b2;
        a2 = b2 = 10;
        System.out.println(a2+ "," + b2);

        //操作方式3：
//        int a3 = 10;
//        int b3 = 10;
        int a3 = 10, b3 = 20;
        System.out.println(a3+ "," + b3);


        //*********************************
        //说明+=的使用
        int m1 = 10;
        m1 += 5;//类似于m1 = m1 + 5;
        System.out.println(m1);

        byte by1 = 10;
        by1 += 5;//by1 = by1 + 5操作会编译报错。应该写为“by1 = (byte)(by1 + 5)”
        System.out.println(by1);

        //练习。如何实现变量的值增加2
        //方式一：：推荐
        int n1 = 10;
        n1 +=2;
        System.out.println(n1);
        //方式二
        int n2 = 10;
        n2 = n2 + 2;
        System.out.println(n2);


        //练习二如何实现变量增加1
        int n3 = 10;
        n3 +=1;
        System.out.println(n3);
        //方式二
        int n4 = 10;
        n4 = n4 + 1;
        System.out.println(n4);
        //方式三
        int n5 = 10;
        n5++;
        System.out.println(n5);



    }
}
