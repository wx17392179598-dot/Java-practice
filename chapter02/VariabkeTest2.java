/*
测试字符类型和布尔类型的使用


 */


public class VariabkeTest2 {
    public static void main(String[] args){
        char c1 = 'a';//char类型只能存储一个字符，不能存储多个字符
        char c2 = '中';
        char c3 = '%';

        char c4 = '\u4e2d';//Unicode编码表示中文字符


        char c5 = '\n';//换行符


        char c6 =  97;//可以存储整数，存储的是对应的ASCII编码值
        char c7=  '1';//存储的是字符'1'，不是整数1
        char c8 =  1;//存储的是整数1，对应的ASCII编码值是SOH（Start of Heading），不是字符'1'

        System.out.println(c4 + " " + c1 + " " + c2 + " " + c3 + " " + c5 + " " + c6+ " " + c7+ " " + c8);

        //测试布尔类型
        boolean flag = true;
        boolean flag2 = false;
        System.out.println(flag);
        System.out.println(flag2);

    }
}
