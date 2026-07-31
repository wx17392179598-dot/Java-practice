/*
1：while 的格式
            1
            while(2){
                3
                4
            }
 执行过程：1-2-3-4-2-3-4-...-2
 2：for和while可以互相转换
 3：for和while循环的区别：初始条件的作用域范围不同
 */

public class WhileTest {
    public static void main(String[] args) {
        //需求一：遍历50次HelloWorld
//        int i = 1;
//        while (i <= 50) {
//            System.out.println("Hello World" );
//            i++;
//
//        }
        //需求二，遍历1-100以内的偶数，并获取偶数的个数，以及所有偶数的和
        int j = 1;
        int num1 = 0;
        int num2 = 0;
        while (j <= 100) {
            if (j%2==0) {
                System.out.println(j);
                num1++;
                num2 += j;

            }
            j++;


        }
        System.out.println("共有偶数"+num1);
        System.out.println("偶数之和"+num2);


    }

}
