//对于方式的优化

public class PrimeNumberTest2 {
    public static void main(String[] args) {
        //获取当前系统的时间：
        long startTime = System.currentTimeMillis();

        boolean isFlag = true;
        int count = 0;//记录质数的个数

        for (int i = 2; i <= 100000; i++) {

            for (int j = 2; j < Math.sqrt(i); j++) {//加上Math.sqrt()---->时间从700ms到10ms
                if(i % j==0){
                    isFlag = false;
                    break;//优化后时间从7000ms-->700ms

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
