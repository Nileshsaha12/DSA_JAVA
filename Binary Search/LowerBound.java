public class LowerBound{
    public static void main(String[] args) {
        int[] arr={1,2,3,3,5,8,8,10,10,11};
        int x=9;
        findlb(arr,x);
    }
    public static void findlb(int[] arr,int x){
        int n=arr.length;
        int idx=n;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                idx=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println(idx);
    }
}