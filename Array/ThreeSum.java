import  java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        //brute(arr);
        //better(arr);
        optimal(arr);
    }
    public static void brute(int[] arr){
        int n=arr.length;
        List<List<Integer>> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        Collections.sort(temp);
                        if( ! ls.contains(temp)) ls.add(temp);
                    }
                }
            }
        }
        System.out.println(ls.toString());
    }
    public static void better(int[] arr){
        int n=arr.length;
        List<List<Integer>> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            Set<Integer> st=new HashSet<>();
            for(int j=i+1;j<n;j++){
                List<Integer> temp=new ArrayList<>();
                int k=-(arr[i]+arr[j]);
                if(st.contains(k)){
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(k);
                    Collections.sort(temp);
                    if(! ls.contains(temp)) ls.add(temp);
                }
                st.add(arr[j]);
               
            }
        }
        System.out.println(ls.toString());
    }
    
    public static void optimal(int[] arr){
        List<List<Integer>> ls=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    List<Integer> temp=new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    ls.add(temp);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k+1]) k--;
                }
            }
        }
        System.out.println(ls.toString());
    }
}
