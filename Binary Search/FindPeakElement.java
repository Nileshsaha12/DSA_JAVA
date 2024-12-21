public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr={1,4,2,3,4,5,6,7,8,2,1};
        //brute(arr);
        int cx=optimal(arr);
        System.out.println(cx);
    }
    public static void brute(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if((i==0 || arr[i]>arr[i-1]) && (i==n-1 || arr[i]>arr[i+1])){
                System.out.println(i);
            }
        }
    }
    public static int optimal(int[] arr){
        int n=arr.length;
        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        int low=1;
        int high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]>arr[mid-1]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
