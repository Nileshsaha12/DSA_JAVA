public class SearchInRSortedarr {
    public static void main(String[] args) {
        int[] arr={7,8,9,1,2,3,4,5,6};
        int x=1;
        findVal(arr,x);
    }
    public static void findVal(int[] arr,int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int idx=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                idx=mid;
                break;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=x && x<=arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(arr[mid]<=x && x<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        System.out.println(idx);
    }
}
