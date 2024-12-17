public class MinInRArr {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        find(arr);
    }
    public static void find(int[] arr){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int mini=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                mini=Math.min(mini, arr[low]);
                break;
            }
            if(arr[low]<=arr[mid]){
                mini=Math.min(mini, arr[low]);
                low=mid+1;
            }else{
                mini=Math.min(mini, arr[mid]);
                high=mid-1;
            }
        }
        System.out.println(mini);
    }
}
