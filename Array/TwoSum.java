import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11,3};
        int target=14;
        //brute(arr,target);
        //better(arr,target);
        optimal(arr,target);
    }
    public static void brute(int[] arr,int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.print( i+ " " +j);
                }
            }
            System.out.println();
        }
    }
    public static void better(int[] arr,int target){
        int n=arr.length;
        HashMap<Integer,Integer> mp =new HashMap<>();
        for(int i=0;i<n;i++){
            int rem=target-arr[i];
            if(mp.containsKey(rem)){
                System.out.print(i + " " + mp.get(rem));
            }
            System.out.println();
            if(!mp.containsKey(rem)){
                mp.put(arr[i], i);
            }
        }
    }
    public static void optimal(int[] arr,int target){
        int n=arr.length;
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.print("YES");
                break;
            }
        
            else if(sum<target){
                left++;
            }
            else if(sum>target) {
                right--;
            }
        }
    }
}
