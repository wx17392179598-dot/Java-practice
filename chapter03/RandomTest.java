/*
如何获取一个随机数
1.可以使用java的API方法\
2.random（）调用后会返回一个[0.0,1.0)的随机数
3.需求
    1 获取一个[0-100]的随机整数
    2 获取一个[1-100]的随机整数
4.需求获取一个[a,b]的随机整数
     (int)(Math.random() * (b - a + 1)) + a
 */

public class RandomTest {
    public static void main(String[] args) {
        double random = Math.random();
        System.out.println("random:" + random);

        int randomNumber = (int)(random * 101); // 将随机数转换为0-100的整数
        System.out.println("randomNumber:" + randomNumber);
        int randomNumber1 = (int)(random * 100) + 1;//随机数转换为1-100的整数
        System.out.println("randomNumber1:" + randomNumber1);
    }
}
