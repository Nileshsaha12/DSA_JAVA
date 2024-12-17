public class SearchInRSortedArrII {
    public static void main(String[] args) {
        int[] arr={3,3,3,1,2,3,3,3,3,3,3,3};
        int target=1;
        search(arr,target);
    }
    public static void search(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int idx=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                idx=mid;
                break;
            }
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low=low+1;
                high=high-1;
                continue;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<=arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(arr[mid]<=target && target<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        if(idx==-1){
            System.out.println("Not contains");
        }else{
            System.out.println("Contains");
        }
    }
}
