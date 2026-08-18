package Test1;

public class PhoneTest {//Phone类的测试类
        public  static void main(String[] args) {

            //创建Phone的对象
            Phone p1 = new Phone();
            //通过Phone的对象，调用其内部声明的属相或者方法
            //形式：“对象.属性”或“对象.方法”
            p1.name = "huawei mate50";
            p1.price = 8999;
            System.out.println("name"+p1.name+",price"+p1.price);

            p1.call();
            p1.sendMessage("有内鬼");
            p1.playGame();

        }
}
