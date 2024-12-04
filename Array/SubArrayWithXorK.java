import java.util.HashMap;
import java.util.*;
public class SubArrayWithXorK {
    public static void main(String[] args) {
        int[] arr={4,2,2,6,4};
        int k=6;
        //better(arr,k);
        optimal(arr,k);
    }
    public static void better(int[] arr,int k){
        int n=arr.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            int xor=0;
            for(int j=i;j<n;j++){
                xor=xor^arr[j];
                if(xor==k) cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static void optimal(int[] arr,int k){
        int n=arr.length;
        int cnt=0;
        Map<Integer,Integer> mp=new HashMap<>();
        int xor=0;
        mp.put(xor,1);
        for(int i=0;i<n;i++){
            xor=xor^arr[i];
            if(mp.containsKey(xor^k)){
                cnt+=mp.get(xor^k);
            }
            mp.put(xor,mp.getOrDefault(xor, 0)+1);
        }
        System.out.println(cnt);
    }

}
