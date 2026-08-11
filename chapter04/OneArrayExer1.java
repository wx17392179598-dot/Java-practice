/*
案例:输出英文星期几
用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
 */
import  java.util.Scanner;

public class OneArrayExer1 {
    public static void main(String[] args) {
        String[] week = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输出数字（1-7）：");
        int day = sc.nextInt();
        if (day > 7||day<1) {
            System.out.println("输入有误！");
        } else {
            System.out.println(week[day - 1]);
        }
        sc.close();

    }
}
