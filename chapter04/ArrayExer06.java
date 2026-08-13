/*
案例1:数组的扩容:
现有数组 int[] arr = new int[]{1,2,3,4,5};
现将数组长度扩容1倍，并将10,20,30三个数据添加到arr数组中，如何操作?
 */

public class ArrayExer06 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        //扩容一倍
        int[] arr1 = new int[arr.length * 2];
        //或者
        int[] arr2 = new int[arr.length << 1];//左移一位
        //将原有数组元素拷贝到新的数组中
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        //将10,20,30三个数据添加到arr数组中
        arr1[arr.length] = 10;
        arr1[arr.length + 1] = 20;
        arr1[arr.length + 2] = 30;
        //将新的数组赋值到旧的arr中

        arr = arr1;
        //遍历arr

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
