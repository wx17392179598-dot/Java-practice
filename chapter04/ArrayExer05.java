/*
案例:
定义数组:int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
如何实现数组元素的反转存储?你有几种方法。
 */

import java.util.Arrays;

public class ArrayExer05 {
    public static void main(String[] args) {
        int [] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        } System.out.println();
        //方式一
//        for(int i=0;i<arr.length/2;i++){
//            int temp=arr[i];
//            arr[i]=arr[arr.length-1-i];
//            arr[arr.length-1-i]=temp;
//        }
        //方式二
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        //方式三：不推荐
//        int []newArr = new int[arr.length];
//        for(int i= arr.length-1;i>=0;i--){
//            newArr[arr.length-1-i]=arr[i];
//        }
//        arr=newArr;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
