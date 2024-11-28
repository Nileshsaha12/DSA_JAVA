

public class nextPermutation {
    public static void main(String[] args) {
        int[] arr={2,1,5,4,3,0,0};
        optimal(arr);

    }
    public static void optimal(int[] arr){
        int idx=-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            reverse(arr,0,n-1);
        }
        for(int i=n-1;i>=idx;i--){
            if(arr[i]>arr[idx]){
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                break;
            }
        }
        reverse(arr,idx+1,n-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void reverse(int[] arr,int a,int b){
       while(a<=b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        a++;
        b--;
       }
    }
}
