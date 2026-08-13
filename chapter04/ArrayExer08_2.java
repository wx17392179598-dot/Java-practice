/*
案例2:二分法查找
时间复杂度是O(logn)
数组中的数据必须是有序的


定义数组: int[] arr2 = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
查找元素5是否在上述数组中出现过?如果出现，输出对应的索引值。
 */

public class ArrayExer08_2 {
    public static void main(String[] args) {
        int[] arr2 = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
        int target = 26;
        //二分法查找
        int left = 0;
        int right = arr2.length-1;
        boolean flag = false;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr2[mid]==target){
                System.out.println(arr2[mid]+"位置在"+mid);
                flag = true;
                break;
            } else if(arr2[mid]<target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if(!flag){
            System.out.println("没有找到"+target);
        }
    }
}
