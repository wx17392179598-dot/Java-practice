package Test2;/*
对象在内存中的分配涉及到的内存结构（理论）
- 栈（stack）：方法内定义的变量，储存在栈中
- 堆（heap）：new出来的结构（比如：数组实体，对象实体）。包括对象中的属性
- 方法区（method area）：存放类的模版。比如：Person类的模板

类中对象的内存解析
    见：创建类中一个对象的内存解析.png
    见：创建类中多个对象的内存解析.png
强调
    1、创建的类的多个对象是，每个对象在堆空间中有一个对象实体，每个对象实体中保存着一份类的属性
    如果修改某一个对象的某属性值是，不会影响到其余对象的此属性的值

    2、当p1、p3两个变量指向了堆空间中的同一个对象实体，如果通过其中某一个对象变量修改对象的属性是
    会影响另一个对象变量的此属性的值
    Person p1 = new Person();
    p1.age = 18;
    Person p3 = p1;
    p3.age = 20;
    System.out.println(p1.age)//20

 */


public class PersonTest {
    public static void main(String[] args) {
        //创建对象类的实例化
        Person p1 = new Person();
        //通过对象调用属性或者方法
        p1.name = "jieke";
        p1.age = 18;
        p1.gender = '男';


        System.out.println("name:"+ p1.name+",age:"+p1.age+",gender:"+p1.gender);

        p1.eat();
        p1.sleep(8);
        p1.interests("画画");

        //在创建Person类的实例
        Person p2 = new Person();
        p2.name = "rose";
        p2.age = 19;
        p2.gender = '女';

        System.out.println("name:"+ p2.name+",age:"+p2.age+",gender:"+p2.gender);



    }




}
