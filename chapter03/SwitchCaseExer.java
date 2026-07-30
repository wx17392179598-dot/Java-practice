/*
案例：用Switch-case实现：对于学生成绩大于60分的，输出合格。低于60分的，输出不合格

 */
public class SwitchCaseExer {
    public static void main(String[] args) {
//        //方式一
        int score = 78;
//        switch (score) {
//            case 0:
//                System.out.println("不及格");
//                break;
//                case 1:
//                    System.out.println("不及格");
//                    break;
//                    //...
//                    case 100:
//                        System.out.println("及格");
//                        break;
//                        default:
//                            System.out.println("error");
//                            break;
//    }
            // 方式二
        switch (score / 10){
            case 0 :
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("不及格");
                break;
            case 2:
                System.out.println("不及格");
                break;
            case 3:
                System.out.println("不及格");
                break;
            case 4:
                System.out.println("不及格");
                break;
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
                case 8:
                    case 9:
                        case 10:
                System.out.println("及格");
                break;
                default:
                    System.out.println("error");
                    break;

        }
        //  方式三
        switch (score / 60)
        {
            case 0 :
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格");
                break;
            default:
                System.out.println("error");
                break;
        }

    }
}
