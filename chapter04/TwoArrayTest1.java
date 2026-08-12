public class TwoArrayTest1 {
    public static void main(String[] args) {
        //5.数组的默认初始值
        //外层元素：默认存储地址值
        //内层元素：默认与一维数组元素的相同
        //动态初始化说明：外层为空，内层还没有分配

        int[][] arr1 = new int[3][2];
        //外层
        System.out.println(arr1[0]);//[I@4eec7777
        System.out.println(arr1[1]);//[I@3b07d329
        //内层
        System.out.println(arr1[0][0]);//0



        boolean[][] arr2 = new boolean[3][2];
        //外层
        System.out.println(arr2[0]);//[Z@41629346
        //内层
        System.out.println(arr2[1][0]);//false

        String[][] arr3 = new String[3][2];
        //外层
        System.out.println(arr3[0]);//[Ljava.lang.String;@404b9385
        //内层
        System.out.println(arr3[1][0]);//null

        //***********************
        //动态初始化方式说明
        int[][] arr4 = new int[3][];
        //外层
        System.out.println(arr4[0]);//null
        //内层
        //System.out.println(arr4[0][0]);//报错NullPointerException


    }
}
