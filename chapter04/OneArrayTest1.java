public class OneArrayTest1 {
    public static void main(String[] args) {
        //5.数组元素的默认初始化值

        //>整型数组元素的默认初始化值:
        int[] arr1 = new int[3];
        System.out.println(arr1[0]);
        short[] arr2 = new short[3];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        //> 浮点型数组元素的默认初始化值:
        double[] arr3 = new double[3];
        System.out.println(arr3[0]);
        float[] arr4 = new float[3];
        System.out.println(arr4[0]);

        //>字符型数组元素的默认初始化值: 0(或者是'\u0000'
        char[] arr5 = new char[3];
        System.out.println(arr5[0]);
        if(arr5[0] == 0){
            System.out.println("arr5[0] is 0");
        }
        if(arr5[0] == '0'){
            System.out.println("arr5[0] is '0'");
        }
        //>boolean型数组元素的默认初始化值:false(0对应的是false)
        boolean[] arr6 = new boolean[3];
        System.out.println(arr6[0]);

        //>引用数据类型数组元素的默认初始化值:null(空)
        String[] arr7 = new String[3];
        System.out.println(arr7[0]);
        for(int i = 0; i < arr7.length; i++){
            System.out.println(arr7[i]);
        }
        if(arr7[0] == null) {
            System.out.println("arr7[0] is null");
        }

        //6.数组的内存解析
        int[]a1 = new int[]{1,2,3};
        int[]a2 = a1;
        System.out.println(a1[1]);
        System.out.println(a1);
        a2[1] = 100;
        System.out.println(a1[1]);
        System.out.println(a2);

    }
}
