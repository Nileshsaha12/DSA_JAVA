import java.util.HashMap;
import java.util.Map;

public class NumberOfSubArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,-3,1,1,1,4,2,-3};
        int k=3;
        //better(arr,k);
        optimal(arr,k);
    }
    public static void better(int[] arr,int k){
        int n=arr.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
    public static void optimal(int[] arr,int k){
        int n=arr.length;
        int  maxCnt=0;
        int preSum=0;
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        for(int i=0;i<n;i++){
            preSum+=arr[i];
            if(mp.containsKey(preSum-k)){
                maxCnt+=mp.get(preSum-k);
            }
            mp.put(preSum, mp.getOrDefault(preSum, 0)+1);

        }
        System.out.println(mp.toString());
        System.out.println(maxCnt);
    }
}
