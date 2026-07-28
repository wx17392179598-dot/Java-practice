/*
分支结构之switch-case的使用
1 语法格式
switch(表达式）{
        case 常量1：
            执行语句1
            break
        case 常量2：
            执行语句2
            break
        case 常量3：
            执行语句3
            break
2 执行过程
根据表达式中的值，依次匹配case语句。一旦与莫一个case中的常量相等那么就执行case中的执行语句
执行完执行语句后
    遇到break，执行break后，跳出当前的switch-case结构
    没有遇到break，则继续执行后面的case中的语句---->case穿透
    直到遇到break或者执行完所有的case及遇到default停止退出当前节后
3. 说明
    switch中的表达式只能是特定的数据类型byte\short\ char\int\枚举()\String()
    case后跟的都是常量，使用表达式与这些常量做相等的判断，不能进行范围判断

 */



public class SwitchCaseTest {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 0:
                System.out.println("0");
                break;
                case 1:
                    System.out.println("1");
                    break;
                    case 2:
                        System.out.println("2");
                        break;
                        case 3:
                            System.out.println("3");
                            break;
                            default:
                                System.out.println("error");
        }
        //错误例子; 不能进行范围判断
//        int number = 20;
//        switch (number) {
//            case number > 0:
//                System.out.println("0");
//                break;
//        }



    }
}
