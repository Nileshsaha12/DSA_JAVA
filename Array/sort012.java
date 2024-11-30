public class sort012 {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,1,2,1,2,1,0,0};
        //better(arr);
        optimal(arr);
    }
    public static void better(int[] arr){
        int n=arr.length;
        int ct0=0;
        int ct1=0;
        int ct2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) ct0++;
            if(arr[i]==1) ct1++;
            if(arr[i]==2) ct2++;
        }
        for(int i=0;i<ct0;i++){
            arr[i]=0;
        }
        for(int i=ct0;i<(ct0+ct1);i++){
            arr[i]=1;
        }
        for(int i=(ct0+ct1);i<(ct0+ct1+ct2);i++){
            arr[i]=2;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
    public static void optimal(int[] arr){
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        for (int i : arr) {
            System.out.print( i + " ");
        }
        System.out.println();
    }
}
