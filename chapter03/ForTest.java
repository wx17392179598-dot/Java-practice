/*
循环结构之一：for
1.Java中规范了三种循环结构for，while，do-while
2.但是循环结构就一定有四要素
    1初始化条件
    2循环条件-->boolean类型的变量或者表达式
    3循环体
    4迭代部分
3，for循环的格式
for(1;2;4){
    3
    }
执行过程1-2-3-4-2-3-4-...-2
 */

public class ForTest {
    public static void main(String[] args) {
        //需求一：题目输出五行HellowWorld
        //方式一
 /*       System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");*/
        //方式二
        for(int i = 1;i <= 5;i++){
            System.out.println("Hello World");
        }
        //需求二
        int num = 1;
        for(System.out.println("a");num<3;System.out.println("c"),num++){
            System.out.println("b");
        }
        //需求三:遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
        int num2 = 0;
        int num3 = 0;
        for(int i = 1;i <= 100;i++){
            if(i%2==0){
                System.out.println(i);
                num2++;
                num3 += i;
            }
        }
        System.out.println("偶数个数为" + num2);
        System.out.println("偶数总和" + num3);


    }
}
