public class MaximumProductSubArr {
    public static void main(String[] args) {
        int[] arr={2,3,-2,4};
        //better(arr);
        optimal(arr);
    }
    public static void better(int[] arr){
        int n=arr.length;
        int prod=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int temp=1;
            for(int j=i;j<n;j++){
                temp*=arr[j];
                prod=Math.max(temp,prod);
            }
        }
        System.out.println(prod);
    }
    public static void optimal(int[] arr){
        int n=arr.length;
        int prod=Integer.MIN_VALUE;
        int pre=1;
        int suf=1;
        for(int i=0;i<n;i++){
            if(pre==0) pre=1;
            if(suf==0) suf=1;
            pre*=arr[i];
            suf*=arr[n-i-1];
            prod=Math.max(prod,Math.max(suf, pre));
        }
        System.out.println(prod);
    }
}
