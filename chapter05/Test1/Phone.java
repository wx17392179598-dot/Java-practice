package Test1;/*
面向对象编程：两大核心概念：类（class）、对象（Object）

类的实例化
等价描述：类的实例化《=》创建类的对象《=》创建类的实例
格式：类类型 对象名 = 通过new创建的对象实体
举例：
Phone p1 = new Phone();
Scanner scan = new Scanner(System.in);
String str = new String();

面相对象完成具体功能的操作的三步流程
步骤一：创建类，并设计类的内部成员（属性、方法）
步骤二：创建类的对象比如：Phone p1 = new Phone()；
步骤三：通过对象调用其内部声明的属相或方法，完成相关的工程。

 */

public class Phone {
    //属性
    String name;
    double price;

    //方法
    public void call() {
        System.out.println("手机能打电话");
    }

    public void sendMessage(String message) {
        System.out.println("发送信息" + message);
    }

    public void playGame() {
        System.out.println("手机能玩游戏");
    }

}
