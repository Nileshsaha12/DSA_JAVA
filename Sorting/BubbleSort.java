public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        BubbleS(arr);
        for(int n:arr) System.out.println(n);
    }
    public static void BubbleS(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
}
