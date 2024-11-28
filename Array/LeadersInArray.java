import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr ={10,22,13,3,0,6};
        //brute(arr);
        optimal(arr);
    }
    public static void brute(int[] arr){
        int n=arr.length;
      List<Integer> ans =new ArrayList<>();
        for(int i=0;i<n;i++){
           boolean flag=true;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                   flag=false;
                    break;
                }
            }
            if(flag){
                ans.add(arr[i]);
            }
        }
        for (Integer integer : ans) {
            System.out.print( integer+ " ");
        }
    }
    public static void optimal(int[] arr){
        int n=arr.length;
        List<Integer> ans=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max=arr[i];
            }
        }
        for (Integer integer : ans) {
            System.out.print(integer+ " ");
        }
    }
}
