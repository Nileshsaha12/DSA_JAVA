public class iterativeBS {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int x=10;
        iter(arr,x);
    }
    public static void iter(int[] arr,int x){
        int n=arr.length;
        int low=0;
        int fl=1;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                fl=0;
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        
        if(fl==1) System.out.println("Not found");
    }
}
