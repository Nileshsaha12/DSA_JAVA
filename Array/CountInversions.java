import java.util.ArrayList;
import java.util.List;

public class CountInversions {
    public static void main(String[] args) {
        int[] arr={5,3,2,4,1};
        //brute(arr);
        optimal(arr);
    }
    public static void brute(int[] arr){
        int n=arr.length;
        int cnt=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
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
       cnt+= Merge(arr,l,mid,r);
       return cnt;

    }
    public static int Merge(int[] arr,int l,int mid,int r){
        int cnt=0;
        int left = l;
        int right=mid+1;
        List<Integer> arr2=new ArrayList<>();
        while(left<=mid && right<=r){
            if(arr[left]<=arr[right]){
                arr2.add(arr[left]);
                left++;
            }
            else{
                cnt+=(mid-left+1);
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
        return cnt;
    }
}
