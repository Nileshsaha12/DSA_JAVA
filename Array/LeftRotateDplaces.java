
public class LeftRotateDplaces {
    public static void main(String[] args) {
        int k=3;
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        //Brute(arr,k,n);
        Optimal(arr,k,n);
    }
    //This is a brute force approach which takes...TC=O(n+k) and SC=O(k)
    public static void Brute(int[] arr,int k,int n){
        k=k%n;
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        for(int i=n-k;i<n;i++){
            arr[i]=temp[i-(n-k)];
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
    // This is the optimal approach which takes..TC=O(2n) and SC=O(1)
    public static void Optimal(int[] arr,int k,int n){
        k=k%n;
        reverse(arr, 0,k);
        reverse(arr, k, n);
        reverse(arr, 0, n);
        for (int i : arr) {
            System.out.println(i);
        }
        
    }
    public static int[] reverse(int[] arr,int a,int b){
        int k=(a+b);
        if((a+b)%2==0){
            for(int i=a;i<k/2;i++){
                int x=arr[i];
                arr[i]=arr[k-i-1];
                arr[k-i-1]=x;
            }
        }
        else{
            for(int i=a;i<=k/2;i++){
                int x=arr[i];
                arr[i]=arr[k-i-1];
                arr[k-i-1]=x;
            }
        }
        return arr;
    }
}
