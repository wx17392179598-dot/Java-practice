/*
循环结构do-while
1格式
    1
    do{
        3
        4
    }while(2);
    执行过程：1-3-4-2-3-4-...-2
2说明：
    这个循环至少执行一次循环体
    在实际开发中，相较于for和while来说用的比较少
 */

public class DoWhileTest {
    public static void main(String[] args) {
        //需求：遍历100以内的偶数，并输出偶数的个数和总和
        int i =1;
        int num = 0;
        int sum = 0;
        do{
            if(i % 2==0){
                System.out.println(i);
                num++;
                sum+=i;
            }

            i++;
        }while(i <= 100);
        System.out.println("个数"+num);
        System.out.println(sum);

    }
}
