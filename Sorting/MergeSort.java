import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr={3,5,3,5,2,432,2,4};
        int n=arr.length-1;
        Mergesort(arr,0,n);
        for(int nr:arr) System.out.println(nr);
    }
    public static void Mergesort(int[] arr,int l,int r){
        if(l>=r) return;
        int mid=(l+r)/2;
        Mergesort(arr, l, mid);
        Mergesort(arr, mid+1, r);
        Merge(arr,l,mid,r);

    }
    public static void Merge(int[] arr,int l,int mid,int r){
        int left = l;
        int right=mid+1;
        List<Integer> arr2=new ArrayList<>();
        while(left<=mid && right<=r){
            if(arr[left]<=arr[right]){
                arr2.add(arr[left]);
                left++;
            }
            else{
                arr2.add(arr[right]);
                right++;
            }
            
        }
        while(left<=mid){
            arr2.add(arr[left]);
            left++;
            
        }
        while(right<=r){
            arr2.add(arr[right]);
            right++;
        }
        for(int i=l;i<=r;i++){
            arr[i]=arr2.get(i-l);
        }
    }
}
