import java.util.HashMap;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,4,3,2,1};
        int k=4;
        //brute(arr,k);
        //better(arr,k);
        optimal(arr,k);

    }
    public static void brute(int[] arr,int k){
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k)
                max=Math.max(j-i+1,max);
            }
            
        }
        System.out.println(max);
    }
    public static void better(int[] arr,int k){
        HashMap<Long ,Integer> mp=new HashMap<>();
        Long sum=0L;
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                maxLen=Math.max(maxLen, i+1);
            }
            Long rem=sum-k;
            if (mp.containsKey(rem)) {
                int len = i - mp.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!mp.containsKey(sum)) {
                mp.put(sum, i);
            }
        }
      
        System.out.println(maxLen);
    }
    public static void optimal(int[] arr,int k){
        int n=arr.length;
        int left=0;
        int right=0;
        int maxLen=0;
        int sum=arr[0];
        while(right<n){

            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxLen=Math.max(maxLen, right-left+1);
            }
          right++;
          if(right<n) sum+=arr[right];  
        }
        System.out.println(maxLen);
    }
}

