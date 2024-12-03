import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] arr={1,0,-1,0,-2,2};
        int target=0;
        //brute(arr,target);
        //better(arr,target);
        optimal(arr,target);
    }
    public static void brute(int[] arr,int target){
        List<List<Integer>> ls=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        List<Integer> temp=new ArrayList<>();
                        if(arr[i]+arr[j]+arr[k]+arr[l]==target){
                            temp.add(arr[i]);
                            temp.add(arr[j]);
                            temp.add(arr[k]);
                            temp.add(arr[l]);
                            Collections.sort(temp);
                            if(! ls.contains(temp)){
                                ls.add(temp);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ls.toString());
    }
    public static void better(int[] arr,int target){
        int n=arr.length;
        List<List<Integer>> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Integer> st=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    int l=-(arr[i]+arr[j]+arr[k]);
                    if(st.contains(l)){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(l);
                        Collections.sort(temp);
                        if(! ls.contains(temp)){
                            ls.add(temp);
                        }
                    }
                    st.add(arr[k]);
                }
            }
        }
        System.out.println(ls.toString());
    }
    public static void optimal(int[] arr,int target){
        Arrays.sort(arr);
        List<List<Integer>> ls=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && arr[j]==arr[j-1]) continue;
                int k=j+1;
                int l=n-1;
                while(k<l){
                    int sum=arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum>target){
                        l--;
                    }else if(sum<target){
                        k++;
                    }else{
                        List<Integer> temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        if(! ls.contains(temp)){
                            ls.add(temp);
                        }
                        k++;
                        l--;
                        while(k<l && arr[k]==arr[k-1]) k++;
                        while(k<l && arr[l]==arr[l+1]) l--;
                    }
                }
            }
        }

        System.out.println(ls.toString());
    }
}
