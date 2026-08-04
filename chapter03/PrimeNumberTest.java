/*
找出100以内的质数，100000以内呢
质数：只能被1和本身整除的自然数：比如2 3 5 7 11...
 */


public class PrimeNumberTest {
    public static void main(String[] args) {
        //方式一
        /*
        for (int i = 2; i <= 100; i++) {
            int number = 0;//记录i是否是质数，0是质数，1不是质数
            for (int j = 2; j < i; j++) {
                if(i % j==0){
                    number++;
                }
            }
            if(number==0){
                System.out.println(i);
            }
        }*/
        //方式二
        /*
        for (int i = 2; i <= 100; i++) {
            boolean isFlag = true;//记录i是否是质数，0是质数，1不是质数
            for (int j = 2; j < i; j++) {
                if(i % j==0){
                    isFlag = false;

                }
            }
            if(isFlag){
                System.out.println(i);
            }
        }*/
    }
}
