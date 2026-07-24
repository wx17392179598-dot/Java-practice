/*
测试基本数据类型变量间的运算规则
运算规则包含：
    1、自动类型提升
    2、强制类型转换
说明：
    1、在运算过程中，数据类型会自动提升为容量大的数据类型
    容量大小并非指的是占用空间大小，而是指数据的范围大小
    2、在运算过程中，如果需要将容量大的数据类型赋值给容量小的数据类型，需要进行强制类型转换
    3、在运算过程中，如果需要将浮点型数据赋值给整型数据，需要进行强制类型转换
    4、在运算过程中，如果需要将整型数据赋值给字符型数据，需要进行强制类型转换

*/


public class VariabkeTest3 {
    public static void main(String[] args){
        int i1 = 10;
        int i2 = i1;

        long l1 = i1;
        float f1 = i1;
        double d1 = i1;
        byte b1 = 12;
        //特殊情况1:byte和short类型在运算过程中会自动提升为int类型
        byte b2 = 12;
        short s1 =10;
        i2 = b2 + s1; // 运算过程中，b2和s1会自动提升为int类型
        //特殊情况2：char
        char c1 = 'a';
        char c2 = 'b';
        int i3 = c1 + c2; // 运算过程中，c1和c2会自动提升为int类型
        //精度损失
        int i5 = 129;
        byte b3 = (byte)i5;
        System.out.println(b3);



    }
}
