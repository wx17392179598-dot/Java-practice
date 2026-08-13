public class ArrayExer02 {
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,6,8,9,0,1,2,7,3};
        int max=arr[0],min=arr[0];
        double sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
            };
            if(arr[i]<min){
                min=arr[i];
            }
        }
        double average = (sum-min-max)/(arr.length-2);
        System.out.println("最终得分"+ average);
    }
}
