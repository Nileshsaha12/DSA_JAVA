
public class revArr2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length-1;
        f(0,arr,n);
        for(int num:arr) System.out.println(num);
    }
    public static void f(int l,int[] arr,int r){
        if(l>r) return;
        swap(arr,l,r);
        f(l+1,arr,r-1);
    }
    public static void swap(int[] arr,int a,int b){
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
}
