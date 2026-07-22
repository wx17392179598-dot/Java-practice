public class FloatDoubleExer    {
    public static void main(String[] args){
        double d1=3.14;
        double radius1 = 1.2;
        double radius2 = 2.5;
        int radius3 = 3;
        double area1 = radius1*radius1*d1;
        double area2 = radius2*radius2*d1;
        double area3 = radius3*radius3*d1;
        System.out.println("半径为"+radius1+"的圆面积为："+area1);
        System.out.println("半径为"+radius2+"的圆面积为："+area2);
        System.out.println("半径为"+radius3+"的圆面积为："+area3);

        double huashui = 100.0;
        double she = (huashui-32) / 1.8;

        System.out.println("华氏温度为："+huashui+"℉对应的摄氏温度为："+she+"℃");


    }
}
