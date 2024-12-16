public class UpperBound {
    public static void main(String[] args) {
        int[] arr={2,3,6,7,8,8,11,11,11,12};
        int x=10;
        findub(arr,x);
    }
    public static void findub(int[] arr,int x){
        int n=arr.length;
        int idx=n;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                idx=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println(idx);
    }
}
