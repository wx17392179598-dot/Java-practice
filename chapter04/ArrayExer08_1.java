/*
线性查找
时间复杂度是O(n)




案例1:线性查找
定义数: int[] arr1 = new int[]{34,54,3,2,65,7,34,5,76,34,67};查找元素是否在上述数组中出现过?如果出现，输出对应的索引值。
 */

public class ArrayExer08_1 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{34,54,3,2,65,7,34,5,76,34,67};

        int target = 1;

        //线性查找
        //方式一
        boolean isFlag = true;
        for (int i = 0; i<arr1.length;i++){
            if(arr1[i]==target){
                System.out.println(arr1[i]+"位置在"+i);
                isFlag = false;
                break;

            }
        }
        if (isFlag){
            System.out.println("没有找到"+target);
        }

        //方式二
        int i = 0;
        for (; i<arr1.length;i++){
            if(arr1[i]==target){
                System.out.println(arr1[i]+"位置在"+i);
                break;

            }
        }
        if(i == arr1.length){
            System.out.println("没有找到"+target);
        }

    }
}
