public class ModBubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        BubbleS(arr);
        for(int n:arr) System.out.println(n);
    }
    public static void BubbleS(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean flag=true;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    flag=false;
                }
            }
            if(flag) break;
            System.out.println("run");
        }
    }
}
