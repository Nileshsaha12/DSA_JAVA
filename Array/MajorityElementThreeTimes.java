import java.util.*;
public class MajorityElementThreeTimes {
    public static void main(String[] args) {
        int[] arr={1,1,1,3,3,3,4,4,4,4,4,2,2,2};
        //brute(arr);
        //better(arr);
        optimal(arr);
    }
    public static void brute(int[] arr){
        int n=arr.length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(ans.size()==0 || !ans.contains(arr[i])){
                int cnt=0;
                for(int j=0;j<n;j++){
                    if(arr[i]==arr[j]){
                        cnt++;
                    }
                }
                if(cnt>n/3){
                    ans.add(arr[i]);
                }
            }
        }
        System.out.println(ans.toString());
    }
    public static void better(int[] arr){
        int n=arr.length;
        List<Integer> ls=new ArrayList<>();
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i], 0)+1);
            if(mp.get(arr[i])==((n/3)+1)){
                ls.add(arr[i]);
            }
        }
        System.out.println(ls.toString());
    }
    public static void optimal(int[] arr){
        int  n=arr.length;
        int ele1=-1;
        int ele2=-1;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<n;i++){
            if(cnt1==0 && ele2 != arr[i]){
                cnt1++;
                ele1=arr[i];
            }
            else if(cnt2==0 && ele1 != arr[i]){
                cnt2++;
                ele2=arr[i];
            }
            else if(ele1==arr[i]){
                cnt1++;
            }else if(ele2==arr[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
       List<Integer> ls=new ArrayList<>();
       cnt1=0;
       cnt2=0;
       for(int i=0;i<n;i++){
        if(arr[i]==ele1) cnt1++;
        if(arr[i]==ele2) cnt2++;
       }
       int  mini=(int) (n/3)+1;
       if(cnt1>=mini) ls.add(ele1);
       if(cnt2>=mini) ls.add(ele2);
       System.out.println(ls.toString());
    }
}
