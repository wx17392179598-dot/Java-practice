public class AirExer {
    public static void main(String[] args) {
        int num = 153;
        int ge = num % 10;
        int shi = (num / 10) % 10;
        int bai = (num / 100) % 10;

        System.out.println("个位是" + ge);
        System.out.println("十位是" + shi);
        System.out.println("百位是" + bai);



        int hours = 89;
        int day = hours/24;
        int hour = hours%24;

        System.out.println("天数是" + day);
        System.out.println("小时数是" + hour);

    }
}
