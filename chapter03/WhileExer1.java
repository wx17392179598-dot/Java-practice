/*
世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如我有一张足够大的纸，它的厚度是0.1毫米。
请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 */
public class WhileExer1 {
    public static void main(String[] args) {
        double zhu = 8848860;
        double zhi = 0.1;
        int num = 0;

        while(zhu >= zhi){

                zhi *= 2;
            num++;
        }
        System.out.println(num);
        System.out.println(zhu/1000);
        System.out.println(zhi/1000);


    }
}
