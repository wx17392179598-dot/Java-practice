/*
break和continue的使用
                    使用范围                    在循环结构中的作用                     相同点

    break           switch语句、循环语句         结束当前循环或switch语句，               在次关键字的后面不能生命执行语句
                                              跳出循环或switch语句

    continue         循环语句                   结束当前次循环，继续下一次循环           在次关键字的后面不能生命执行语句
 了解带标签的break和continue的使用
 再开发中break使用频率更高
 */


public class BreakContinueTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                //break;
                continue;
            }
            System.out.print(i);
        }
        System.out.println();
        label:for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    //break;//结束的包裹的最近的结构
                    continue  label;
                }
                System.out.print(j);
            }
            System.out.println();
        }
        }

    }

