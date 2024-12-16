public class FirstLastArr {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,8,8,11,11,13};
        int x=8;
        //brute(arr,x);
        optimal(arr,x);
    }
    public static void brute(int[] arr,int x){
        int n=arr.length;
        int first=-1;
        int last=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                if(first==-1) first=i;
                last=i;
            }
        }
        System.out.println("First-" + first + "Last-" + last);
    }
    public static void optimal(int[] arr,int x){
        int n=arr.length;
        int lb=findlb(arr,x);
        int ub=findub(arr, x);
        if(lb==n || arr[lb] != x) System.out.println("First- " + -1 + "Last- " + -1);
        else  System.out.println("First-" + lb + "Last-" + (ub-1));
    }
    public static int findlb(int[] arr,int x){
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
        return idx;
    }
    public static int findub(int[] arr,int x){
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
        return idx;
    }
}
