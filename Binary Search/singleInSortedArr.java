public class singleInSortedArr {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,4,5,5,6,7,7};
       // brute(arr);
       optimal(arr);
    }
    public static void brute(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i==0) {
                if(arr[i] != arr[i+1]){
                    System.out.println(arr[i]);
                    break;
                }
            }else if(i==n-1){
                if(arr[i] != arr[i-1]){
                    System.out.println(arr[i]);
                    break;
                }
            }else{
                if((arr[i] != arr[i-1]) && (arr[i] != arr[i+1])){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
    public static void optimal(int[] arr){
        int n=arr.length;
        if(n==1){
            System.out.println(arr[0]);
            return;
        }
        if(arr[0] != arr[1]){
            System.out.println(arr[0]);
            return;
        }
        if(arr[n-1] != arr[n-2]){
            System.out.println(arr[n-1]);
            return;
        }
        int low=1;
        int high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if((arr[mid] != arr[mid-1]) && arr[mid] != arr[mid+1]){
                System.out.println(arr[mid]);
                break;
            }
            else if((mid%2==1 && arr[mid]==arr[mid-1]) || (mid%2==0 && arr[mid]==arr[mid+1])){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
    }
}
