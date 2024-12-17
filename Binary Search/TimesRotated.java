public class TimesRotated {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        find(arr);
    }
    public static void find(int[] arr){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int indx=-1;
        int mini=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                if(arr[low]<mini){
                    mini=arr[low];
                    indx=low;
                }
                break;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<mini){
                    mini=arr[low];
                    indx=low;
                }
                low=mid+1;
            }else{
                if(arr[mid]<mini){
                    mini=arr[mid];
                    indx=mid;
                }
                high=mid-1;
            }
        }
        System.out.println(indx);
    }
}
