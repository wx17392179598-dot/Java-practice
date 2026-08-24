package Test3.exer1;

public class EmployeeTest {
    public static void main(String[] args) {
        //创建类的实例
        Employee emp1 = new Employee();
        emp1.id = 1001;
        emp1.name = "TOm";
        emp1.salary = 1000;
        emp1.age = 26;


        System.out.println("id = "+ emp1.id +"\nname="+emp1.name+"\nsalary="+emp1.salary+"\nage="+emp1.age);
        //创建Employee的第二个对象
        Employee emp2 = new Employee();
        emp2.id = 1002;
        emp2.name = "Tom";
        emp2.salary = 1000;
        emp2.age = 26;

        System.out.println("id = " + emp2.id+"\nname="+emp2.name+"\nsalary="+emp2.salary+"\nage="+emp2.age);


    }
}
