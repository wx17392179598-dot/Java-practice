/*
分支结构1：if-else条件判断结构
    1格式
        格式1：
        if(条件表达式){
            // 条件表达式为true时执行的代码
        }
        格式2:
        if(条件表达式) {
            // 条件表达式为true时执行的代码
        } else {
            // 条件表达式为false时执行的代码
        }
        格式 3：
        if(条件表达式) {
            // 条件表达式为true时执行的代码
        } else if(条件表达式) {
            // 条件表达式为true时执行的代码
        } else {
            // 条件表达式为false时执行的代码
        }

 */


public class IfElseTest {
    public static void main(String[] args) {
        /*
        案例1:成年人心率的正常范围是每分钟60-100次。体检时，如果心率不在此范围内，则提示需要做进一步的检查。
         */
        int heartBeats  = 89;
        if (heartBeats < 60 || heartBeats > 100) {
            System.out.println("心率不在正常范围内，需要做进一步的检查。");
        }
        System.out.println("体检结束" );
        /*
        案例2：定义一个整数，判断是偶数或者奇数
         */
        int num1= 10;
        if (num1 % 2 == 0) {
            System.out.println(num1 + "是偶数");
        } else {
            System.out.println(num1 + "是奇数");
        }
        /*
        案例3：岳小鹏参加Java考试，他和父亲岳不群达成承诺:
            如果:
            成绩为100分时，奖励一辆跑车;
            成绩为(80，99]时，奖励一辆山地自行车;
            当成绩为[60，80]时，奖励环球影城一日游;
            其它时，胖揍一顿。
            说明:默认成绩是在[0,100]范围内

            结论：
            1.如果多个条件表达式没有交集，则那个条件表达式声明位置无影响
              如果多个表达式有交集，则条件表达式声明位置按照从上到下的顺序运行
         */
        int score = 59;
        if (score == 100){
            System.out.println("奖励一辆跑车");
        } else if (score > 80 && score <= 99) {
            System.out.println("奖励一辆山地自行车");
        } else if (score >= 60 && score <= 80) {
            System.out.println("奖励环球影城一日游");
        } else {
            System.out.println("胖揍一顿");
        }
    }
}
