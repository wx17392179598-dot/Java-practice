import java.util.Arrays;

/*

 */
public class TwoArrayTest {
    public  static void main(String[] args) {
        //1.1、静态初始化
        int [][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8,9}};
        //1.2、动态初始化1
        String[][] arr2 = new String[3][4];
        //   动态初始化2
        double[][]  arr3 = new double[3][];
        //其他正确写法
        int  arr4 [][] = new int[][]{{1,2},{3,4},{5,6}};
        int [] arr5 [] = new int[][]{{1,2},{3,4},{5,6}};
        int [][] arr6 = {{1,2},{3,4},{5,6}};
        //错误写法
        //int [][] arr1 = new int[2][3]{{1,2},{3,4},{5,6}};

        //2、数组元素调用
        //针对于arr1来说，外层元素{1,2,3}、{4,5}、{6,7,8,9} 内层元素:1,2,3,4,5,6,7,8,9
        //调用内层元素
        System.out.println(arr1[0][0]);
        System.out.println(arr1[1][0]);
        System.out.println(arr1[2][0]);
        //调用外层元素
        System.out.println(arr2[0]);//@4eec7777
        //测试arr2,arr3
        arr2[0][1] = "tom";
        System.out.println(arr2[0][1]);//tom
        System.out.println(arr2[0]);//[Ljava.lang.String;@4eec7777
        arr3[0] = new double[4];
        arr3[0][0] = 1.0;
        System.out.println(arr3[0][0]);

        //3.数组的长度
        System.out.println(arr1.length);//3
        System.out.println(arr1[0].length);//3
        System.out.println(arr1[1].length);//2
        System.out.println(arr1[2].length);//4

        //4.数组的遍历
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
