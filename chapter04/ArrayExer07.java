/*
案例:数组的缩容:
int[]arr={1,2,3,4,5,6,7}。现需删除数组中索引为4的元素。现有数组
 */

public class ArrayExer07 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        //删除索引为4的元素
        //方式一
//        for (int i=4;i<arr.length-1;i++){
//            arr[i]=arr[i+1];
//        }
//        //将最后一个元素设为0（或任何默认值）
//        arr[arr.length-1]=0;
        //方式二：新建一个数组
        int[] newArr=new int[arr.length-1];
        for (int i=0;i<4;i++){
            newArr[i]=arr[i];
        }
        for (int i=4;i<arr.length-1;i++){
            newArr[i]=arr[i+1];
        }
        arr=newArr;


        //遍历arr
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
