package Test3.exer2;

public class EmployeeTest {
    public static void main(String[] args) {

        //创建Employee的一个实例
        Employee emp1 = new Employee();
        emp1.age = 24;
        emp1.id = 1001;
        emp1.name = "111";//emp1.name = new String("111")
        emp1.salary = 5000;
        emp1.brithday = new MyDate();
        emp1.brithday.year  = 1999;
        emp1.brithday.month = 1;
        emp1.brithday.day = 1;


        System.out.println("id = "+ emp1.id +"\nname="+emp1.name+"\nsalary="+emp1.salary+"\nage="+emp1.age
        +"\nbirthday="+ emp1.brithday.year+"y"+emp1.brithday.month+"m"+emp1.brithday.day+"d");

    }
}
