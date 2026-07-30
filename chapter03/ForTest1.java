/*
水仙花数
 */

public class ForTest1 {
    public static void main(String[] args) {
      for(int i = 100;i<= 999;i++){
          int ge = i % 10;
          int shi = i / 10 %10;
          int bai = i/100 %10;
          int ge3 = ge*ge*ge;
          int shi3 = shi*shi*shi;
          int bai3 = bai*bai*bai;
          if(ge3+shi3+bai3 == i){
              System.out.println("这个数是水仙花数"+i);
          }
      }
    }
}
