import java.util.ArrayList;
import java.util.List;

public class ReversePair {
    public static void main(String[] args) {
        int[] arr= {40,25,19,12,9,6,2};
        //brute(arr);
        optimal(arr);
    }
    public static void brute(int[] arr){
        int n=arr.length;
        int cnt=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>2*arr[j]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
    public static void optimal(int[] arr){
        int cnt=0;
        int n=arr.length;
        cnt+= Mergesort(arr,0,n-1);
        System.out.println(cnt);
    } 
    public static int Mergesort(int[] arr,int l,int r){
        int cnt=0;
        if(l>=r) return cnt;
        int mid=(l+r)/2;
        cnt+=Mergesort(arr, l, mid);
        cnt+=Mergesort(arr, mid+1, r);
        cnt+=count(arr,l,mid,r);
        Merge(arr,l,mid,r);
        
       return cnt;

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
    public static int count(int[] arr,int low,int mid,int high){
        int cnt=0;
        int r=mid+1;
        for(int i=low;i<=mid;i++){
            while(r<=high && arr[i]>2*arr[r]){
                r++;
            }
            cnt = cnt + (r-(mid+1));
        }
        return cnt;
    }
}
