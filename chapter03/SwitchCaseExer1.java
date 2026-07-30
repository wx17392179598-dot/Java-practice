/*
案例：编写程序：从键盘上输入2023的month和day，要求程序输出输入的日期为2023年的第几天
 */
import java.util.Scanner;
public class SwitchCaseExer1 {
    public static void main(String[] args) {
        //1，使用Scanner，从给键盘后驱2023年的month和day
        Scanner input = new Scanner(System.in);
        System.out.print("请输入2023年的月份: ");
        int month = input.nextInt();//阻塞式的方法
        System.out.println("请输入2023年的天:");
        int day = input.nextInt();
        //2，使用switch-case实现分支结构
        int sunDays = 0;
        //方式一
        /*存在数据冗余
//        switch (month) {
//            case 1:
//                sunDays = day;
//                break;
//                case 2:
//                    sunDays = 31 + day;
//                    break;
//                    case 3:
//                        sunDays = 31+28+day;
//                        break;
//                        case 4:
//                            sunDays = 31+28+30+day;
//                            break;
//            case 12:
//                sunDays = 31+30+...+day;
//                break;
//
//        }*/
        //方式二
        switch (month) {
            case 12:
                sunDays += 30;
            case 11:
                sunDays += 31;
            case 10:
                sunDays += 30;
            case 9:
                sunDays += 31;
            case 8:
                sunDays += 31;
            case 7:
                sunDays += 30;
            case 6:
                sunDays += 31;
            case 5:
                sunDays += 30;
            case 4:
                sunDays += 31;
            case 3:
                sunDays += 28;
            case 2:
                sunDays += 31;
            case 1:
                sunDays += day;
                break;
                default:
                    System.out.println("error");
        }
        input.close();//防止内存泄露
        System.out.println("当前日期是2023年" + month +"月"+ day + "日，并且为2023年的第" + sunDays+"天");
    }
}
