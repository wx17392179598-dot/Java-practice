/*
题目:模拟ATM取款
声明变量balance并初始化为0，用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能。
======ATM======
1、存款
2、取款
3、显示余额
4、退出
请选择(1-4):
 */

import java.util.Scanner;
public class DoWhileExer {
    public static void main(String[] args) {
        double balance = 0;
        boolean flag = true;//控制循环结束
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("======ATM======\n" +
                    "      1、存款\n" +
                    "      2、取款\n" +
                    "      3、显示余额\n" +
                    "      4、退出\n" +
                    "      请选择(1-4):");
            int num = input.nextInt();
            switch(num){
                case 1:
                    System.out.print("请输入存款金额");
                    double balance1 = input.nextDouble();
                    if(balance1> 0){
                        balance += balance1;
                    }
                    break;
                case 2:
                    System.out.print("请输入存款金额");
                    double balance2 = input.nextDouble();
                    if(balance2> 0&&balance2<=balance){
                        balance -= balance2;
                    }else {
                        System.out.println("余额不足");
                    }
                    break;
                case 3:
                    System.out.println("余额为"+balance);
                    System.out.println("感谢使用");
                    break;
                case 4:
                    flag = false;//保证循环结束
                    break;
                    default:
                        System.out.println("输入有误，请重新输入");
            }

        }while(flag);//保证循环顺利
        input.close();

    }
}
