//关于练习OneArrayExer2的优化


import java.util.Scanner;
public class OneArrayExer3 {
    public static void main(String[] args) {
        // 1、键盘输入成绩
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数:");
        int count = scan.nextInt();
        int[] scores = new int[count];
        //2根据提示依次输入成绩并保存到数组
        int maxScores = scores[0];
        System.out.println("请输入" + count + "个学生成绩");
        for(int i = 0; i < count; i++){
            scores[i] = scan.nextInt();
            //3进行成绩排序获得最大值
            if(maxScores < scores[i]){
                maxScores = scores[i];
            };
        }
        System.out.println("最高成绩为：" + maxScores);
        //4遍历数组，并且根据要求打印相关信息
        char grade = 0;
        for(int i = 0; i <scores.length; i++){
            if(scores[i] >= maxScores -10){
                grade = 'A';
            }else if(scores[i] >= maxScores -20){
                grade = 'B';
            }else if(scores[i] >= maxScores -30){
                grade = 'C';
            }else{
                grade = 'D';
            }
            System.out.println("学生" + (i + 1) + "的成绩为：" + scores[i]+"grade is " + grade);
        }
    }
}
