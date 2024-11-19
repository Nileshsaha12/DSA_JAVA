import java.util.HashMap;

public class AppearsOnce {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4};
        //brute(arr);
        //better(arr);
        optimal(arr);
    }
    public static void brute(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int num=arr[i];
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]==num){
                    count++;
                }
            }
            if(count==1) System.out.println(num);
        }
       
    }
    public static void better(int[] arr){
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);

        }
        for(Integer i:mp.keySet()){
            if(mp.get(i)==1) System.out.println(i);
        }
    }
    public static void optimal(int[] arr){
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        System.out.println(xor);
    }
}
