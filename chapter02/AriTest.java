/*
测试运算符的使用1：算术运算符的使用
1 +   — + -* / ++ ++ -- --
 */



public class AriTest {
    public static void main(String[] args) {
        int m1 = 12;
        int n1 = 5;
        int k1 = m1/n1;
        System.out.println(k1);
        System.out.println(m1 / n1 * n1);

        /*
        取模
         */
        int i1 = 12;
        int j1 = 5;
        System.out.println(i1 % j1);
        // 开发中，经常用来判断某个数num1能整除另外一个数num2        num1 % num2 == 0


        int i2 = -12;//被摸数
        int j2 = 5;//模数
        System.out.println(i2 % j2);
        int i3 = 12;
        int j3 = -5;
        System.out.println(i3 % j3);
        int i4 = -12;
        int j4 = -5;
        System.out.println(i4% j4);
        //结论：取模以后结果与被模数的符号相同
        //****************************************
        //前++  先自增   再赋值、运算
        //后++  先赋值、运算   再自增
        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1="+a1+"，b1="+b1);
        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2="+a2+"，b2="+b2);

        //练习
        int i = 10;
        //++i;
        i++;//没有任何区别
        System.out.println("i="+i);
        //练习2
        short s1 = 10;
        //方式一  加一
        //s1 = s1 + 1;编译不通过
        s1 = (short) (s1 + 1);
        System.out.println("s1="+s1);

        //方式二  自增
        s1++;
        System.out.println("s1="+s1);

        //****************************************
        //--i
        //i--
        //+：连接符，只适用于String类型，其他类型会自动转换为String类型

    }
}
