/*
遍历100000以内的所有质数，体会不同算法实现的性能差异
 */


public class PrimeNumberTest1 {
    public static void main(String[] args) {
        //获取当前系统的时间：
        long startTime = System.currentTimeMillis();

        boolean isFlag = true;
        int count = 0;//记录质数的个数

        for (int i = 2; i <= 100000; i++) {

            for (int j = 2; j < i; j++) {
                if(i % j==0){
                    isFlag = false;

                }
            }
            if(isFlag){
                count++;
            }
            isFlag = true;
        }
        System.out.println("质数的个数是：" + count);
        long endTime = System.currentTimeMillis();
        System.out.println("执行时间：" + (endTime - startTime) + "ms");
    }
}
