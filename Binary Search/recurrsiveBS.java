public class recurrsiveBS {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
    int x=10;
    int n=arr.length;
    rec(arr,x,0,n-1);
    }
    public static void rec(int[] arr,int x,int low,int high){
        if(low>high){
            System.out.println("Not Found");
            return;
        }
        int mid=(low+high)/2;
        if(arr[mid]==x) System.out.println(mid);
        else if(arr[mid]<x) rec(arr,x,mid+1,high);
        else rec(arr,x,low,mid-1);
    }
}
