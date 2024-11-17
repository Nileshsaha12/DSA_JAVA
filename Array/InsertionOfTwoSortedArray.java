import java.util.ArrayList;
import java.util.List;

public class InsertionOfTwoSortedArray {
    public static void main(String[] args) {
       int[] arr1={1,2,3,4,5};
       int[] arr2={2,3,4,5,6};
       //brute(arr1,arr2);
       optimal(arr1, arr2);
    }
    static public void brute(int[] arr1,int[] arr2){
        List<Integer> ans=new ArrayList<>();
        int[] visit=new int[arr2.length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j] && visit[j]==0){
                    ans.add(arr1[i]);
                    visit[j]=1;
                    break;
                }
                if(arr2[j]>arr1[i]) break;
            }
        }
        for (int i : ans) {
            System.out.print(i);
        }
    }
    static public void optimal(int[] a,int[] b){
        int i=0;
        int j=0;
        List<Integer> ans=new ArrayList<>();
        int n1=a.length;
        int n2=b.length;
        while(i<n1 && j<n2){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }else if(a[i]<b[j]){
                i++;
            }else if(a[i]>b[j]){
                j++;
            }
        }
        for (Integer integer : ans) {
            System.out.print(integer);
        }
    }
}
