**7.31**
-
学习了For、while、无限循环、嵌套循环，相关知识和进行了对应的训练。 

---
**8.4**
-
1、学习了关于流程控制的相关知识，练习了实体项目的的实现，以及关键字break、continue的使用。

2、以及对于不同算法之间性能的优化和比较。 

3、复习了第三章的知识点，回忆里下相关知识。

---
**8.11**
-
1、一维数组的学习和联系，各种类型的数组的使用以及初始值和数组遍历的实现。
```java
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

    }
}

```
2、一维数组的内存解析
```java
int[]a1 = new int[]{1,2,3};
        int[]a2 = a1;
        System.out.println(a1[1]);
        System.out.println(a1);
        a2[1] = 100;
        System.out.println(a1[1]);
        System.out.println(a2);
```
3、一维数组的练习
```java
/*
案例一:输出英文星期几
用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
 */
import  java.util.Scanner;

public class OneArrayExer1 {
    public static void main(String[] args) {
        String[] week = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输出数字（1-7）：");
        int day = sc.nextInt();
        if (day > 7||day<1) {
            System.out.println("输入有误！");
        } else {
            System.out.println(week[day - 1]);
        }
        sc.close();

    }
}
//案例二具体可看:OneArrayExer2和OneArrayExer3;
```
---
**8.12**
-
1、二维数组的学习和联系，二维数组的使用以及初始值和数组遍历的实现。
```java
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
```
2、二维数组的内存解析

3、二维数组的练习
```java
public class TwoArrayExer2 {
    public static void main(String[] args) {
        String[][] arr2 = new String[][]{
                {"10","1","段 誉","22","3000"},
                {"11","3","任我行","23", "18000","15000", "7000"},
                {"13","2","令狐冲","32","15000","2000"},
                {"11","4","张三丰","24", "18000","7300"},
                {"12","5","周芷若","28", "10000","5000"},
                {"11","6","赵 敏","22","6800"},
                {"12","7","张无忌","29","10800","5200"},
                {"13","8","韦小宝","30","19800","15000","2500"},
                {"12","9","杨 过","26","9800","5500"},
                {"11","10","小龙女","21","6600"},
                {"11","11","郭 靖","25","7100"},
                {"12","12","黄 蓉","27","9600","4800"}

        };
        System.out.println("员工类型\t编号\t姓名\t\t年龄\t薪资\t\t奖金\t\t股票");
        for(int i = 0; i < arr2.length; i++){
            String arr1 = arr2[i][0];
            switch (arr1){
                case "10":
                    System.out.print("职员\t\t");
                    break;
                    case "11":
                        System.out.print("程序员\t");
                        break;
                        case "12":
                            System.out.print("设计师\t");
                            break;
                            case "13":
                                System.out.print("架构师\t");
                                break;
            }
            for(int j = 1; j < arr2[i].length; j++){
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

```
4、数组的常见算法
```java
/*
详情见：
        chapter04/ArrayExer01.java
        chapter04/ArrayExer02.java
        chapter04/ArrayExer03.java
        chapter04/ArrayExer04.java
        chapter04/ArrayExer04_1.java
        chapter04/ArrayExer05.java
*/
```
***8.13***
-
1、对数组的反转存储学习完成详情见“[ArrayExer05.java](chapter04/ArrayExer05.java)”

2、对数组的扩容和缩容的学习详情见“[ArrayExer06.java](chapter04/ArrayExer06.java)和[ArrayExer07.java](chapter04/ArrayExer07.java)”

3、对于线性查找和二分查找的学习详情见“[ArrayExer08_1.java](./chapter04/ArrayExer08_1.java)”

4、对冒泡排序和快速排序的学习，要求会手写冒泡排序，快速排序用到了后面的知识，现阶段只了解其排序思想。
详细见“[BubbleSortExer.java](chapter04/BubbleSortExer.java)和[FlsatSortExer.java](chapter04/FlsatSortExer.java)”

```

快速排序：时间最快的排序方法
1、时间复杂度O(nlogn)
2、概念逻辑：从数组中。第一个数为标准，找到比他大的放后面，比他小的放前面，然后分为左右两组，这样前面都是比他小的，后面比他大的，然后前后分别分组继续循环以上操作，以此类推直到顺序正确。
```

