/*
冒泡排序：时间复杂度：O(n^2)
案例1:使用冒泡排序，实现整型数组元素的排序操作
比如:int[]
arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
 */

import java.util.Arrays;

public class BubbleSortExer {
    public static void main(String[] args) {
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

        //冒泡排序
        for(int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    //交换arr[i]和arr[i+1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
