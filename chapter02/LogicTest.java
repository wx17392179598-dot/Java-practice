public class LogicTest {
    public static void main(String[] args) {
    /*
    区分&和&&
    执行过程：
        1.如果符号左边为true,则&、&&都会执行符号右边操作
        2.如果符号左边为false，则&会执行符号右边操作，
                            &&不会执行符号右边操作
        3.开发中，我们推荐用&&
     */
        //&：
        boolean b1 = true;
        b1 = false;
        int num1 = 10;

        if(b1 & (num1++ > 0)){
            System.out.println("床前明月光");
        } else {
            System.out.println("我叫郭德斌");
        }
        System.out.println("num1 = " + num1);

        //&&:
        boolean b2 = true;
        b2 = false;
        int num2 = 10;

        if(b2 && (num2++ > 0)){
            System.out.println("床前明月光");
        } else {
            System.out.println("我叫郭德斌");
        }
        System.out.println("num2 = " + num2);


        //**********************************
        //区分||和|
//        执行过程：
//        1.如果符号左边为false,则|、||都会执行符号右边操作
//        2.如果符号左边为true，则|会执行符号右边操作，
//                            ||不会执行符号右边操作
//        3.开发中，我们推荐用||
        boolean b3 = false;
        b3 = true;
        int num3 = 10;

        if(b3 | (num3++ > 0)){
            System.out.println("床前明月光");
        } else {
            System.out.println("我叫郭德斌");
        }
        System.out.println("num3 = " + num3);
        boolean b4 = false;
        b4 = true;
        int num4 = 10;
        if(b4 || (num4++ > 0)){
            System.out.println("床前明月光");
        } else {
            System.out.println("我叫郭德斌");

        }
        System.out.println("num4 = " + num4);

    }


}
