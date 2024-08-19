public class revArr3 {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        
        f(0,arr);
        for(int num:arr) System.out.println(num);
    }
    public static void f(int l,int[] arr){
        int n=arr.length-1;
        if(l>n/2) return;
        swap(arr,l,n);
        f(l+1,arr);
    }
    public static void swap(int[] arr,int a,int n){
        int t=arr[a];
        arr[a]=arr[n-a];
        arr[n-a]=t;
    }
}
