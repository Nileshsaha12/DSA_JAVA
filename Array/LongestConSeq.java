import java.util.*;
public class LongestConSeq {
    public static void main(String[] args) {
        int[] arr={102,4,100,1,101,3,2,5,1,1,103,104,105,106,106,105,105,104,103};
        //brute(arr);
        //better(arr);
        optimal(arr);
    }
    public static void brute(int[] arr){
        int n=arr.length;
        int longest=-1;
        for(int i=0;i<n;i++){
            int seq=1;
            int temp=arr[i];
            while(lin(arr,temp+1)==true){
                temp=temp+1;
                seq=seq+1;
                longest=Math.max(seq, longest);
            }
        }
        System.out.println(longest);
    }
    public static boolean lin(int[] arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x) return true;
        }
        return false;
    }
    public static void better(int[] arr){
        if(arr.length==0) System.out.println(0);
        int n=arr.length;
        Arrays.sort(arr);
        int longest=0;
        int cnt=0;
        int Last_Min=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           if(arr[i]-1 == Last_Min){
                cnt+=1;
                Last_Min=arr[i];           
            }
            else if(arr[i] != Last_Min){
                   cnt=1;
                Last_Min=arr[i];
             
            }
            
            longest=Math.max(longest,cnt);
        }
        System.out.println(longest);
    }
    public static void optimal(int[] arr){
        int n=arr.length;
        
        Set<Integer> st=new TreeSet<>();
        for(int i=0;i<n;i++){
            st.add(arr[i]);
        }
       int longest=0;
       for (Integer it : st) {
        if(!st.contains(it-1)){
            int cnt=1;
            int x=it;
            while(st.contains(x+1)){
                cnt+=1;
                x=x+1;
            }
            longest= Math.max(cnt, longest);
        }
       }
       System.out.println(longest);
    }
}
