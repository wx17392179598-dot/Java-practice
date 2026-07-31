/*
随机生成一个100以内的数，猜这个随机数是多少?
从键盘输入数，如果大了，提示大了;如果小了，提示小了;如果对了，就不再猜了，并统计一共猜了多少次。
提示:生成一个[a,b]范围的随机数的方式:(int)(Math.random()*(b -a+1)+a)
 */
import  java.util.Scanner;

public class WhilExer {
    public static void main(String[] args) {
        //生成一个[1,100]的随机整数
        int target = (int)(Math.random()*100)+1;
        //用scanner从键盘获取数字
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = 1;
        //使用循环结构进行多次循环的对比和获取数据
        while(num != target){
            if(target > num){
                System.out.println(num + " 这个数小了 " );
            }else if(target < num){
                System.out.println(num + " 这个数大了" );
            }
            System.out.print("Enter a number: ");
            num = input.nextInt();
            sum ++;
        }
        System.out.println("The number is " + num);
        System.out.println("您猜测的次数是： " + sum);

    }

}
