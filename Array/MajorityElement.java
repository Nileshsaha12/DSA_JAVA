import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={2,2,3,3,1,2,2};
        //brute(arr);
        //better(arr);
        optimal(arr);
    }
    public static void brute(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
            if(cnt>n/2){
                System.out.println(arr[i]);
                break;
            }

        }
    }
    public static void better(int[] arr){
        int n=arr.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(arr[i] , mp.getOrDefault(arr[i], 0)+1);
        }
        for(int i=0;i<n;i++){
            if(mp.get(arr[i])>(n/2)){
                System.out.println(arr[i]);
                break;
            }
        }
    }
    public static void optimal(int[] arr){
        int n=arr.length;
        int ele=-1;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt++;
                ele=arr[i];
            }else if(ele == arr[i]){
                cnt++;
            }else{
                cnt--;
            }
        }
        int cnt1=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ele){
                cnt1++;
            }
        }
        if(cnt1>(n/2)){
            System.out.println(ele);
        }
    }
}
