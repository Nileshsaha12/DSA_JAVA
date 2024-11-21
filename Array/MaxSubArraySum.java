public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        //better(arr);
         optimal(arr);
    }
    public static void better(int[] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                max=Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
    public static void optimal(int[] arr){
        int n=arr.length;
        int sum=0;
        int start=-1; 
        int end=-1;
        int start1=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(sum==0) start=i;
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            if(sum>max){
                max=sum;
                start1=start;
                end=i;
            }
        }
        for(int i=start1;i<=end;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(max);
    }
}
