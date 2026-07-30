/*
说明：输入正整数M和n，求起最大公约数和最小公倍数
 */
import java.util.Scanner;
public class ForTest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入正整数m");
        int m = input.nextInt();
        System.out.println("请输入正整数n");
        int n = input.nextInt();
        int max=(n > m) ? n:m;
        int min=(m > n) ? n:m;
        //方式一
        /*int num1 = 1;
        for(int i = 1;i <= n && i <= m;i++){
            if(m % i == 0 && n % i == 0){
                num1 = i;
            }
        }
        System.out.println("最大公约数为"+ num1);
        */
        //方式二
        int num1 = 1;
        for(int i = min;i >= 1;i--){
            if(m % i == 0 && n % i == 0){
                num1 = i;
                break;//一旦执行立即跳出当前循环，即可保证正确输出
            }
        }
        System.out.println("最大公约数为"+ num1);
        //方式一
        /*int num2 = 0;
        for(int j = 1;j <=(n*m);j++){
            if(j % m == 0 && j % n == 0){
                num2 = j;
                break;
            }
        }
        System.out.println("最小公倍数为"+ num2);
        */
        //方式二
        int num2 = 0;
        for(int j = n*m;j >= max;j--){
            if(j % m == 0 && j % n == 0){
                num2 = j;
            }
        }
        System.out.println("最小公倍数为"+ num2);

    }
}
