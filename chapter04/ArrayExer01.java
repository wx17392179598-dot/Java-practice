import java.util.Arrays;

public class ArrayExer01 {
    public static void main(String[] args) {
        //创建动态数组
        int[] arr = new int[10];
        //通过循环给数组元素赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*(99-10+1)) +10;
            System.out.print(arr[i]+" ");
        }
        System.out.println( );
        //求最大值
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //求最小值
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
        //求总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("总和：" + sum);
        //求平均值
        int num = arr.length;
        double average = (double) sum / num;
        System.out.println("平均值：" + average);
    }
}
