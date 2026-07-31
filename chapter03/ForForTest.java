/*
嵌套循环的使用
1.嵌套循环:是指一个循环结构A的循环体是另一个循环结构B。
-外层循环:循环结构A
-内层循环:循环结构B
2
 */


public class ForForTest {
    public static void main(String[] args) {
        for(int j =1;j<=5;j++){//外层循环
            for(int i =1;i<= 6;i++){//内层循环
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n##########################");
        for(int j =1;j<=5;j++){//外层循环
            for(int i =1;i<= j;i++){//内层循环
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n##-----------------------");
        for(int j =1;j<=5;j++){//外层循环
            for(int i =1;i <= 6-j;i++){//内层循环
                System.out.print("*");
            }
            System.out.println();
        }
        for(int j =1;j<=5;j++){//外层循环
            for(int i =1;i <= 10-(2*j);i++){//内层循环
                System.out.print(" ");
            }
            for (int n=1;n<=(2*j-1);n++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int j =1;j<=4;j++){//外层循环
            for(int i =1;i <= (2*j);i++){//内层循环
                System.out.print(" ");
            }
            for (int n=1;n<=(8-2*j+1);n++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        //九九乘法表
        for(int j =1;j<=9;j++){
            for(int i =1;i <= j ;i++){
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }


    }
}
